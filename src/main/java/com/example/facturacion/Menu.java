package com.example.facturacion;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;

public class Menu extends JFrame{
    JFrame f;
    
    Menu(){
        JButton creaFactura = new JButton("Crear Factura");
        JButton modFactura = new JButton("Modificar Factura");
        JButton anulaFactura = new JButton("Anular Factura");
        JButton loggout = new JButton("Log out");

        creaFactura.setBounds(10,80,125,25);
        creaFactura.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                new CreaFactura();
                dispose();
            }
        });
        modFactura.setBounds(10,107,150,25);
        modFactura.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new ModFactura();
                dispose();
            }
        });
        anulaFactura.setBounds(10,137,125,25);
        anulaFactura.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new AnulaFactura();
                dispose();
            }
        });
        loggout.setBounds(10,210,150,25);
        loggout.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new Login();
                dispose();
            }
        });

        add(creaFactura);
        add(modFactura);
        add(anulaFactura);
        add(loggout);

        setLocation(300, 200);
        setSize(400,500);//400 width and 500 height  
        setLayout(null);//using no layout managers  
        setVisible(true);//making the frame visible 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        

}
