const { Client } = require('whatsapp-web.js');
const qrcode = require('qrcode-terminal');
const fs = require('fs');

const client = new Client();
const sessions = new Map(); // Mapa para armazenar estado de agendamento por número de telefone

// Mensagens
let hello_msg = `
Olá! A [SUA_EMPRESA] agradece o contato!
Selecione uma das opções abaixo para continuar seu atendimento:

• *Agendar Consulta*
• *Sobre*

Digite uma das opções acima ou "cancelar" para voltar ao início do atendimento.
`;

let name_msg = `
Vamos iniciar seu agendamento!

Por favor, me informe seu nome completo.
`;

let cpf_msg = `
Me informe o seu CPF.
`;

let data_msg = `
Agora me informe a data desejada para agendamento.

Exemplo: 21/07/2024
`;

let telefone_msg = `
Para finalizar, qual seu telefone para contato? (WhatsApp ou Ligação).
`;

/* ############################ */
client.on('ready', () => {
    console.log('Client is ready!');
});

client.on('qr', qr => {
    qrcode.generate(qr, { small: true });
});

client.on('message', async message => {
    let sender = message.from;
    let msg = message.body.toLowerCase(); // Converter a mensagem para minúsculas

    console.log(`Mensagem recebida de ${sender}: ${msg}`);

    if (msg.includes("cancelar")) {
        if (sessions.has(sender)) {
            sessions.delete(sender); // Limpa o estado do agendamento para este número
        }
        await message.reply("Operação cancelada.");
    }

    // Verifica se está no processo de agendamento para este número
    if (sessions.has(sender)) {
        let session = sessions.get(sender);

        if (session.nameInfo) {
            // Se está esperando o nome do usuário
            session.nomeUsuario = message.body; // Captura o nome do usuário
            session.nameInfo = false; // Reseta o estado de captura do nome
            session.cpfInfo = true;
            await message.reply(cpf_msg);
        } else if (session.cpfInfo) {
            // Se está esperando o CPF do usuário
            session.cpfUsuario = message.body; // Captura o CPF do usuário
            session.cpfInfo = false; // Reseta o estado de captura do CPF
            session.telefoneInfo = true;
            await message.reply(data_msg);
        } else if (session.telefoneInfo) {
            // Se está esperando o telefone do usuário
            session.telefoneUsuario = message.body;
            session.telefoneInfo = false;
            session.dataInfo = true;
            await message.reply(telefone_msg);
        } else if (session.dataInfo) {
            // Se está esperando a data do agendamento
            session.dataUsuario = message.body;
            session.dataInfo = false;
            let mensagemFinal = `
Agendamento realizado!

Confira as informações:
Nome: ${session.nomeUsuario}
CPF: ${session.cpfUsuario}
Data agendada: ${session.dataUsuario}
Telefone para contato: ${session.telefoneUsuario}

Um de nossos especialistas entrará em contato confirmando o agendamento.

Obrigado!
            `;
            // Monta o objeto JSON com as informações
            const messageData = {
                sender: sender,
                username: session.nomeUsuario,
                cpf: session.cpfUsuario,
                phone: session.telefoneUsuario,
                date: session.dataUsuario,
            };

            // Lê o conteúdo atual do arquivo, se existir
            let fileContent = [];
            try {
                const data = fs.readFileSync('database/whatspi_data.json', 'utf8');
                fileContent = data ? JSON.parse(data) : [];
            } catch (err) {
                console.error('Erro ao ler o arquivo:', err);
            }

            // Adiciona o novo objeto ao array
            fileContent.push(messageData);

            // Converte o objeto para JSON
            const toJSON = JSON.stringify(fileContent, null, 2) + '\n'; // 2 espaços de indentação para legibilidade

            // Escrever mensagem final no arquivo
            fs.writeFile('database/whatspi_data.json', toJSON, function (err) {
                if (err) {
                    console.error('Erro ao adicionar mensagem final ao arquivo:', err);
                    // Tratar o erro de forma apropriada, se necessário
                } else {
                    console.log('Mensagem final do agendamento adicionada ao arquivo!');
                }
            });
            sessions.delete(sender); // Finaliza o processo de agendamento para este número
            await message.reply(mensagemFinal);
        }
    } else {
        // Opções principais
        if (msg.includes("agendar consulta")) {
            // Inicia o processo de agendamento
            sessions.set(sender, {
                nameInfo: true,
                cpfInfo: false,
                dataInfo: false,
                telefoneInfo: false,
                nomeUsuario: '',
                cpfUsuario: '',
                dataUsuario: '',
                telefoneUsuario: ''
            });
            await message.reply(name_msg);
        } else {
            await message.reply(hello_msg);
        }
    }
});

// Iniciar o cliente
client.initialize();