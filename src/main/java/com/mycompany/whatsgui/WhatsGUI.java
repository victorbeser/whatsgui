/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.whatsgui;

import com.mycompany.whatsgui.view.IndexView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author victor
 */
public class WhatsGUI {

    public static void main(String[] args) {
//        System.out.println("Hello World!");

        IndexView indexViewFrame = new IndexView();
        indexViewFrame.setVisible(true);


//        JFrame frame = new JFrame("Configurar Hello World");
//        frame.setSize(400, 200);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(null);
//
//        JLabel label = new JLabel("Digite seu texto:");
//        label.setBounds(10, 20, 150, 25);
//        frame.add(label);
//
//        JTextField textField = new JTextField("Helloo, World!");
//        textField.setBounds(150, 20, 200, 25);
//        frame.add(textField);
//
//        JButton button = new JButton("Executar Node.js");
//        button.setBounds(10, 60, 150, 25);
//        frame.add(button);
//
//        button.addActionListener((ActionEvent e) -> {
//            String userInput = textField.getText();
//            try {
//                ProcessBuilder processBuilder = new ProcessBuilder("node", "/home/victor/NetBeansProjects/WhatsGUI/src/main/java/com/mycompany/whatsgui/app.js", userInput);
//                processBuilder.inheritIO(); // Para ver a saída no console
//                Process process = processBuilder.start();
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        });
//
//        frame.setVisible(true);
    }
}
