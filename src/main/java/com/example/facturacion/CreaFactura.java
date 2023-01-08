package com.example.facturacion;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;

public class CreaFactura extends JFrame {
    JFrame f;
    JTextField idf;
    int eid; //variable que contendra el id cuando se haga click en el boton crear factura
    JTextField ncf;
    String enc; //variable que contendra el nombre del cliente
    JTextField dcf;
    String edc; //variable que contendra la direccion del cliente
    JTextField tcf;
    int etc; //variable que contendra el telefono del cliente
    JTextField ccf;
    String ecc; //variable que contendra el correo del cliente
    JTextField vcf;
    double evc; //variable que contendra el valor total sin iva;
    JTextField ivaf;
    final int viva =12;
    JTextField tocf;
    double etoc; //variable que contendra el valor total a pagar con iva;
    JTextField cantidadf, cantidadf1,cantidadf2,cantidadf3,cantidadf4,cantidadf5,cantidadf6;
    int [] cantidades= new int [7]; // array de int donde se guadaran las cantidades
    JTextField desf,desf1,desf2,desf3,desf4,desf5,desf6;
    String [] descripciones = new String[7]; //array de String donde se guardaran las descripciones
    JTextField costof,costof1,costof2,costof3,costof4,costof5,costof6;
    double [] costos = new double [7]; // array de double donde se guardaran los costos

    CreaFactura(){
        Font fuente = new Font("Calibri", 100, 72);
    	Font fid = new Font("Calibri", 100, 32);
    	Font fdatos = new Font("Calibri", 100, 22);
    	
        JLabel userText = new JLabel("FACTURA AJC S.A");
        userText.setBounds(10, 0 , 1000, 100);
        userText.setForeground(Color.white);
        userText.setFont(fuente);
        add(userText); 

        JLabel id = new JLabel("Factura id: ");
        id.setBounds(710, 0 , 1000, 50);
        id.setForeground(Color.white);
        id.setFont(fid);
        add(id);  

        idf = new JTextField(100);
        idf.setBounds(710,50,200,40);
        add(idf);

        JLabel dtc = new JLabel("Datos Coorporativos:");
        dtc.setBounds(10, 90 , 1000, 100);
        dtc.setFont(fdatos);
        add(dtc); 

        JLabel name = new JLabel("AJC S.A");
        name.setBounds(10, 130 , 1000, 100);
        name.setFont(fdatos);
        add(name); 

        JLabel dir = new JLabel("Calle Arketh y finca menor N.- 345");
        dir.setBounds(10, 150 , 1000, 100);
        dir.setFont(fdatos);
        add(dir); 

        JLabel telf = new JLabel("099625124  - 0921312432");
        telf.setBounds(10, 170 , 1000, 100); 
        telf.setFont(fdatos);
        add(telf); 

        JLabel correo = new JLabel("ajc.81@outlook.com");
        correo.setBounds(10, 190 , 1000, 100);
        correo.setFont(fdatos);
        add(correo); 

        JLabel dtcl = new JLabel("Datos Consumidor:");
        dtcl.setBounds(510, 90 , 1000, 100);
        dtcl.setFont(fdatos);
        add(dtcl); 

        JLabel nc = new JLabel("Nombre: ");
        nc.setBounds(510, 130 , 1000, 100);
        nc.setFont(fdatos);
        add(nc); 

        ncf = new JTextField(100);
        ncf.setBounds(700,165,270,20);
        add(ncf);

        JLabel dc = new JLabel("Direccion: ");
        dc.setBounds(510, 150 , 1000, 100);
        dc.setFont(fdatos);
        add(dc); 

        dcf = new JTextField(100);
        dcf.setBounds(700,185,270,20);
        add(dcf);
        
        JLabel tc = new JLabel("Telefonos: ");
        tc.setBounds(510, 170 , 1000, 100);
        tc.setFont(fdatos);
        add(tc); 
        
        tcf = new JTextField(100);
        tcf.setBounds(700,205,270,20);
        add(tcf);
        
        
        JLabel cc = new JLabel("Correo Electronico: ");
        cc.setBounds(510, 190 , 1000, 100);
        cc.setFont(fdatos);
        add(cc); 
        
        ccf = new JTextField(100);
        ccf.setBounds(700,225,270,20);
        add(ccf);
        
        
        JLabel vc = new JLabel("Valor a Pagar: ");
        vc.setBounds(510, 210 , 1000, 100);
        vc.setFont(fdatos);
        add(vc); 
        
        vcf = new JTextField(100);
        vcf.setBounds(700,245,270,20);
        add(vcf);
        
        
        JLabel iva = new JLabel("IVA: ");
        iva.setBounds(510, 230 , 1000, 100);
        iva.setFont(fdatos);
        add(iva); 
        
        ivaf = new JTextField(100);
        ivaf.setBounds(700,265,270,20);
        ivaf.setText("12%");
        add(ivaf);
        
        
        JLabel toc = new JLabel("Valor Total: ");
        toc.setBounds(510, 250 , 1000, 100);
        toc.setFont(fdatos);
        add(toc); 
        
        tocf = new JTextField(100);
        tocf.setBounds(700,285,270,20);
        add(tocf);
        
        
        JLabel cantidad = new JLabel("Cantidad ");
        cantidad.setBounds(10,350,1000,50);
        cantidad.setForeground(Color.white);
        cantidad.setFont(fid);
        add(cantidad); 
        
        cantidadf = new JTextField(100);
        cantidadf.setBounds(0,400,200,30);
        add(cantidadf);
        cantidadf1 = new JTextField(100);
        cantidadf1.setBounds(0,430,200,30);
        add(cantidadf1);
        cantidadf2 = new JTextField(100);
        cantidadf2.setBounds(0,460,200,30);
        add(cantidadf2);
        cantidadf3 = new JTextField(100);
        cantidadf3.setBounds(0,490,200,30);
        add(cantidadf3);
        cantidadf4 = new JTextField(100);
        cantidadf4.setBounds(0,520,200,30);
        add(cantidadf4);
        cantidadf5 = new JTextField(100);
        cantidadf5.setBounds(0,550,200,30);
        add(cantidadf5);
        cantidadf6 = new JTextField(100);
        cantidadf6.setBounds(0,580,200,30);
        add(cantidadf6);
        
        JLabel des = new JLabel("Descripcion ");
        des.setBounds(350,350,1000,50);
        des.setForeground(Color.white);
        des.setFont(fid);
        add(des); 
        
        desf = new JTextField(100);
        desf.setBounds(200,400,500,30);
        add(desf);
        desf1 = new JTextField(100);
        desf1.setBounds(200,430,500,30);
        add(desf1);
        desf2 = new JTextField(100);
        desf2.setBounds(200,460,500,30);
        add(desf2);
        desf3 = new JTextField(100);
        desf3.setBounds(200,490,500,30);
        add(desf3);
        desf4 = new JTextField(100);
        desf4.setBounds(200,520,500,30);
        add(desf4);
        desf5 = new JTextField(100);
        desf5.setBounds(200,550,500,30);
        add(desf5);
        desf6 = new JTextField(100);
        desf6.setBounds(200,580,500,30);
        add(desf6);
        
        
        JLabel costos = new JLabel("Costo ");
        costos.setBounds(710,350,1000,50);
        costos.setForeground(Color.white);
        costos.setFont(fid);
        add(costos); 
        
        costof = new JTextField(100);
        costof.setBounds(700,400,300,30);
        add(costof);
        costof1 = new JTextField(100);
        costof1.setBounds(700,430,300,30);
        add(costof1);
        costof2 = new JTextField(100);
        costof2.setBounds(700,460,300,30);
        add(costof2);
        costof3 = new JTextField(100);
        costof3.setBounds(700,490,300,30);
        add(costof3);
        costof4 = new JTextField(100);
        costof4.setBounds(700,520,300,30);
        add(costof4);
        costof5 = new JTextField(100);
        costof5.setBounds(700,550,300,30);
        add(costof5);
        costof6 = new JTextField(100);
        costof6.setBounds(700,580,300,30);
        add(costof6);
        
        JButton back = new JButton("Regresar");
        back.setBounds(820,620,100,25);
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                new Menu();
                dispose();
            }
        });
        add(back);
        JButton crea = new JButton("Ingresar Datos");
        crea.setBounds(950,620,125,25);
        crea.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Los datos se han subido a la bas de datos!!");          
                // poner aca los .getText de cada Jfield 
            }

        });
        add(crea);

        JPanel panel=new JPanel();  
        panel.setBounds(0,0,1000,100);    
        panel.setBackground(Color.black);   
        add(panel); 
        
        JPanel panel1=new JPanel();  
        panel1.setBounds(0,350,1000,50);    
        panel1.setBackground(Color.black);   
        add(panel1); 
        

        setLocation(30, 20);
        setSize(1000,700);//400 width and 500 height  
        setLayout(null);//using no layout managers  
        setVisible(true);//making the frame visible 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
