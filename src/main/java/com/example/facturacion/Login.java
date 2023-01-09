package com.example.facturacion;
import javax.swing.*;

import io.cloudevents.CloudEvent;

import java.awt.event.*;

public class Login extends JFrame{
        JFrame f;//creating instance of JFrame  
        JTextField userField;
        JPasswordField passwordField;

        Login(){
                   
        
            JLabel userText = new JLabel("Usuario: ");
            userText.setBounds(10, 20 , 80, 25);
            add(userText);

            userField = new JTextField(20);
            userField.setBounds(100,20,165,25);
            add(userField);
            

            JLabel passLabel = new JLabel("Contraseña: ");
            passLabel.setBounds(10,50,80,25);
            add(passLabel);

            passwordField = new JPasswordField(20);
            passwordField.setBounds(100,50,165,25);
            passwordField.setToolTipText("Solo 10 caracteres!!!");
            add(passwordField);

            JButton b=new JButton("Login");//creating instance of JButton  
            b.setBounds(10,80,80, 25);//x axis, y axis, width, height  
            b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    new Menu();
                    dispose();
                    String usuario = userField.getText();
                    System.out.println(usuario);
                                               
                }
            });
            add(b);//adding button in JFrame  

            setLocation(300, 200);
            setSize(400,500);//400 width and 500 height  
            setLayout(null);//using no layout managers  
            setVisible(true);//making the frame visible 
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
             
}
