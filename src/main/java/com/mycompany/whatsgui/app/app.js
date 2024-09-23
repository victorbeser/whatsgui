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
// MAIN-MSG-BEGIN
let main_msg = "A empresa QuinzeConto

Agradece sua participação!

Hehe";

Agradece sua participação!

Hehe";
// USER-TYPE-BEGIN
});
