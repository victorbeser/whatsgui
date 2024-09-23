const { Client } = require('whatsapp-web.js');
const qrcode = require('qrcode-terminal');

const client = new Client({
    puppeteer: {
        args: ['--no-sandbox', '--disable-setuid-sandbox'],
    }
});

client.on('ready', () => {
    console.log('Client is ready!');
});

client.on('qr', qr => {
    qrcode.generate(qr, { small: true });
});

client.on('message', async message => {
    let msg = message.body.toLowerCase().trim(); 
    let hello_msg = `
 goooll

de placa e de trivela
no cantinho
pra comemorar

!!!!!	
`;
    if (msg.includes('consultar')) {
        if (msg.startsWith('consultar ')) {
            const parametro = msg.slice(10).trim();
            await message.reply('ola meu nome eh quinzeconto');
        } else {
            await message.reply(hello_msg);}
    } else {
        await message.reply(hello_msg);}
});
