package com.example.facturacion;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;

public class AnulaFactura extends JFrame{
    AnulaFactura(){
        JButton back = new JButton("Regresar");
        back.setBounds(10,80,100,25);
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                new Menu();
                dispose();
            }
        });
        add(back);

        setLocation(300, 200);
        setSize(400,500);//400 width and 500 height  
        setLayout(null);//using no layout managers  
        setVisible(true);//making the frame visible 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        System.out.println("hola");
    }
}
