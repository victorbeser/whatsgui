/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.whatsgui.view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import javax.swing.SwingUtilities;

/**
 *
 * @author victor
 */
public class IndexView extends javax.swing.JFrame {

    public String appFilePath = "src\\main\\java\\com\\mycompany\\whatsgui\\app\\app.js";

    /**
     * Creates new form IndexView
     */
    public IndexView() {
        initComponents();
        redirectConsole();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConsoleOutput = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        btnReset = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        btnMainMsg = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(110, 192, 147));

        jLabel2.setFont(new java.awt.Font("Courier 10 Pitch", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("WhatsGUI");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("v1.0");

        txtConsoleOutput.setEditable(false);
        txtConsoleOutput.setBackground(new java.awt.Color(51, 51, 51));
        txtConsoleOutput.setColumns(20);
        txtConsoleOutput.setForeground(new java.awt.Color(255, 255, 255));
        txtConsoleOutput.setLineWrap(true);
        txtConsoleOutput.setRows(5);
        txtConsoleOutput.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(txtConsoleOutput);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(563, 563, 563))
                            .addComponent(jLabel3))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18))
        );

        jMenu2.setText("File");

        jMenuItem2.setText("Run");
        jMenu2.add(jMenuItem2);

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jMenu2.add(btnReset);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Configuration");

        btnMainMsg.setText("Main Message");
        btnMainMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMsgActionPerformed(evt);
            }
        });
        jMenu1.add(btnMainMsg);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // SHOW IN CONSOLE
    private void redirectConsole() {
        OutputStream outputStream = new OutputStream() {
            @Override
            public void write(int b) {
                // Adiciona o caractere ao JTextArea
                SwingUtilities.invokeLater(() -> txtConsoleOutput.append(String.valueOf((char) b)));
            }
        };
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        System.setErr(printStream); // Para redirecionar tamb�m os erros
    }

    // ADD SOME FUNCTION
    private void adicionarTextoNoArquivo() {
        File arquivo = new File(appFilePath);
        StringBuilder conteudo = new StringBuilder();
        String texto = """
                       if (msg.includes('')) {
                               if (msg.startsWith(' ')) {
                                   const parametro = msg.slice(1).trim();
                                   await message.reply('');
                               } else {
                                   await message.reply(hello_msg);}
                           } else {
                               await message.reply(hello_msg);}""";

        // L� o arquivo e guarda o conte�do em um StringBuilder
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo), StandardCharsets.UTF_8))) {
            String linha;
            boolean dentroDaSecao = false;

            while ((linha = reader.readLine()) != null) {
                // Verifica se est� dentro da se��o desejada
                if (linha.trim().equals("// USER-TYPE-BEGIN")) {
                    dentroDaSecao = true;
                }

                // Adiciona a linha atual ao conte�do
                conteudo.append(linha).append(System.lineSeparator());

                // Adiciona o texto se estiver dentro da se��o
                if (dentroDaSecao && linha.trim().equals("// USER-TYPE-BEGIN")) {
                    conteudo.append(texto).append(System.lineSeparator());
                    dentroDaSecao = false; // Reseta a flag
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Escreve o conte�do de volta no arquivo
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(arquivo), StandardCharsets.UTF_8))) {
            writer.write(conteudo.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ADD MAIN MESSAGE
    private void addMainMessage(String mainMessage) {
        
        System.out.println("Adding new main message...");
        
        File arquivo = new File(appFilePath);
        StringBuilder conteudo = new StringBuilder();
        String texto = """
                       let main_msg = "%s";
                       """.formatted(mainMessage);

        // L� o arquivo e guarda o conte�do em um StringBuilder
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo), StandardCharsets.UTF_8))) {
            String linha;
            boolean dentroDaSecao = false;

            while ((linha = reader.readLine()) != null) {
                // Verifica se est� dentro da se��o desejada
                if (linha.trim().equals("// MAIN-MSG-BEGIN")) {
                    dentroDaSecao = true;
                }

                // Adiciona a linha atual ao conte�do
                conteudo.append(linha).append(System.lineSeparator());

                // Adiciona o texto se estiver dentro da se��o
                if (dentroDaSecao && linha.trim().equals("// MAIN-MSG-BEGIN")) {
                    conteudo.append(texto).append(System.lineSeparator());
                    dentroDaSecao = false; // Reseta a flag
                }
            }
            System.out.println("Main message added");
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }

        // Escreve o conte�do de volta no arquivo
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(arquivo), StandardCharsets.UTF_8))) {
            writer.write(conteudo.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // GENERATE BASE FILE
    private void generateFile() {
        System.out.println("Configuring the application file path");
        File arquivo = new File(appFilePath);
//        String caminhoAbsoluto = arquivo.getAbsolutePath();
//        System.out.println("Caminho absoluto: " + caminhoAbsoluto);

        System.out.println("Initializating");

        try {
            // Cria o arquivo se ele n�o existir
            if (arquivo.createNewFile()) {
                System.out.println("Generating application file...");
            } else {
                System.out.println("Restarting application file...");
            }

            // Escreve o conte�do no arquivo
            try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(arquivo), StandardCharsets.UTF_8))) {
                writer.write("const { Client } = require('whatsapp-web.js');");
                writer.newLine();
                writer.write("const qrcode = require('qrcode-terminal');");
                writer.newLine();
                writer.write("");
                writer.newLine();
                writer.write("const client = new Client({");
                writer.newLine();
                writer.write("    puppeteer: {");
                writer.newLine();
                writer.write("        args: ['--no-sandbox', '--disable-setuid-sandbox'],");
                writer.newLine();
                writer.write("    }");
                writer.newLine();
                writer.write("});");
                writer.newLine();
                writer.write("");
                writer.newLine();
                writer.write("client.on('ready', () => {");
                writer.newLine();
                writer.write("    console.log('Client is ready!');");
                writer.newLine();
                writer.write("});");
                writer.newLine();
                writer.write("");
                writer.newLine();
                writer.write("client.on('qr', qr => {");
                writer.newLine();
                writer.write("    qrcode.generate(qr, { small: true });");
                writer.newLine();
                writer.write("});");
                writer.newLine();
                writer.write("");
                writer.newLine();
                writer.write("client.on('message', async message => {");
                writer.newLine();
                writer.write("    let msg = message.body.toLowerCase().trim(); ");
                writer.newLine();
                writer.write("// MAIN-MSG-BEGIN");
                writer.newLine();
                writer.write("// USER-TYPE-BEGIN");
                writer.newLine();
//                writer.write(" ");
//                writer.newLine();

                // ###########################
                // Aqui voc� pode continuar a adicionar o restante do seu c�digo
                // writer.write("    // seu c�digo aqui");
                // writer.newLine();
                // MAIN MESSAGE
//                writer.write("    let hello_msg = `");
//                writer.newLine();
//                writer.write(mainMsg);
//                writer.newLine();
//                writer.write("`;");
//                writer.newLine();
//
//                // USER TYPE WORD
//                writer.write("    if (msg.includes('" + userType + "')) {");
//                writer.newLine();
//                writer.write("        if (msg.startsWith('" + userType + " " + "')) {");
//                writer.newLine();
//                writer.write("            const parametro = msg.slice(" + (userTypeLength + 1) + ").trim();");
//                writer.newLine();
//                writer.write("            await message.reply('" + botResponse + "');");
//                writer.newLine();
//                writer.write("        } else {");
//                writer.newLine();
//                writer.write("            await message.reply(hello_msg);}");
//                writer.newLine();
//                writer.write("    } else {");
//                writer.newLine();
//                writer.write("        await message.reply(hello_msg);}");
//                writer.newLine();
                // ###########################
//                writer.write("// USER-TYPE-END");
//                writer.newLine();
                writer.write("});");
                writer.newLine();

                System.out.println("The file has been restarted");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        generateFile();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnMainMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMsgActionPerformed
        // TODO add your handling code here:
        String msg = "Hello World";
        addMainMessage(msg);

    }//GEN-LAST:event_btnMainMsgActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IndexView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndexView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndexView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndexView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndexView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnMainMsg;
    private javax.swing.JMenuItem btnReset;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtConsoleOutput;
    // End of variables declaration//GEN-END:variables
}
