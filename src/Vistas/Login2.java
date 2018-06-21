package Vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login2 extends JFrame{
    private final JPanel panel1;
    private final JLabel imagenLogin;
    private final JLabel  salir, minimizar;
    private final JLabel nombre, contraseña, btnLogin, btnSalir, piePagina;
    private final JTextField nomreCampo, contraseñaCampo;
    public Login2(){
        this.setLayout(null);
        this.setUndecorated(true);
        this.setResizable(false);
        getContentPane().setBackground(Color.WHITE);
        
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(10, 10, 280, 380);
        panel1.setVisible(true);
        panel1.setBackground(Color.WHITE);
        panel1.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
        this.add(panel1);
        
        
        ImageIcon lo =  new ImageIcon ("src\\Recursos\\avatar.png");
        imagenLogin = new JLabel(lo);
        imagenLogin.setLocation(10, 200);
        imagenLogin.setBounds(100, 70, 80, 80);
        imagenLogin.setVisible(true);
        imagenLogin.setHorizontalAlignment(JLabel.CENTER);
        panel1.add(imagenLogin);
        
        nombre = new JLabel("Usuario");
        nombre.setBounds(60, 150, 100, 40);
        nombre.setVisible(true);
        nombre.setFont(new Font("Bookman Old Style", 0, 16));
        nombre.setForeground(Color.ORANGE);
        panel1.add(nombre);
        
        nomreCampo = new JTextField();
        nomreCampo.setBounds(60, 185, 150, 25);
        nomreCampo.setFont(new Font("Bookman Old Style", 0, 16));
        nomreCampo.setVisible(true);
        panel1.add(nomreCampo);
        
        contraseña = new JLabel("Contraseña");
        contraseña.setBounds(60, 210, 100, 40);
        contraseña.setVisible(true);
        contraseña.setFont(new Font("Bookman Old Style", 0, 16));
        contraseña.setForeground(Color.ORANGE);
        panel1.add(contraseña);
        
        contraseñaCampo = new JTextField();
        contraseñaCampo.setBounds(60, 245, 150, 25);
        contraseñaCampo.setFont(new Font("Bookman Old Style", 0, 16));
        contraseñaCampo.setVisible(true);
        panel1.add(contraseñaCampo);
        
        btnLogin = new JLabel("Login");
        btnLogin.setBounds(140, 280, 70, 30);
        btnLogin.setVisible(true);
        btnLogin.setFont(new Font("Bookman Old Style", 0, 16));
        btnLogin.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
        btnLogin.setHorizontalAlignment(JLabel.CENTER);
        btnLogin.setForeground(Color.ORANGE);
        btnLogin.setOpaque(true);
        btnLogin.setBackground(Color.WHITE);
        panel1.add(btnLogin);
        
        btnSalir = new JLabel("Salir");
        btnSalir.setBounds(60, 280, 70, 30);
        btnSalir.setVisible(true);
        btnSalir.setFont(new Font("Bookman Old Style", 0, 16));
        btnSalir.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
        btnSalir.setHorizontalAlignment(JLabel.CENTER);
        btnSalir.setForeground(Color.ORANGE);
        btnSalir.setOpaque(true);
        btnSalir.setBackground(Color.WHITE);        
        panel1.add(btnSalir);
        
       piePagina = new JLabel("©2018 El Gran Mezon Company");
       piePagina.setBounds(50, 340, 250, 50);
       piePagina.setVisible(true);
       piePagina.setFont(new Font("Bookman Old Style", 0 , 14));
       piePagina.setForeground(Color.ORANGE);
       panel1.add(piePagina);
       
       ImageIcon sallir =  new ImageIcon ("src\\Recursos\\tach.png");
       salir = new JLabel(sallir);
       salir.setLocation(10, 200);
       salir.setBounds(250, 5, 20, 30);
       salir.setVisible(true);
       salir.setHorizontalAlignment(JLabel.CENTER);
       panel1.add(salir);
       
       ImageIcon min =  new ImageIcon ("src\\Recursos\\min.png");
       minimizar = new JLabel(min);
       minimizar.setLocation(10, 200);
       minimizar.setBounds(200, 5, 30, 30);
       minimizar.setVisible(true);
       minimizar.setHorizontalAlignment(JLabel.CENTER);
       panel1.add(minimizar);
       
       
       //Controles para eventos
       EventosRaton me = new EventosRaton();
       btnLogin.addMouseListener(me);
       btnSalir.addMouseListener(me);
       
    }   
    //Eventos
    private class EventosRaton extends MouseAdapter {
        
        @Override
        
        public void mouseClicked(MouseEvent e){
            if(e.getSource() == btnLogin){
               try {
                menuPrincipal menu = new menuPrincipal();
                menu.setBounds(0, 0, 800, 600);
                menu.setVisible(true);
                menu.setResizable(false);
                menu.setLocationRelativeTo(null);
                
                
               }
               catch(Exception h){
               }
            }
            else if(e.getSource() == salir ){
              
               
            }
        }
        @Override
        public void mouseEntered(MouseEvent e){
            if (e.getSource() == btnLogin){btnLogin.setBackground(Color.ORANGE);
            btnLogin.setForeground(Color.BLACK);}
            else if(e.getSource() == btnSalir){btnSalir.setBackground(Color.ORANGE);
            btnSalir.setForeground(Color.BLACK);}
        }
        
        @Override
        public void mouseExited(MouseEvent e){
            if (e.getSource() == btnLogin){btnLogin.setBackground(Color.WHITE);
            btnLogin.setForeground(Color.ORANGE);}
            else if(e.getSource() == btnSalir){btnSalir.setBackground(Color.WHITE);
            btnSalir.setForeground(Color.ORANGE);}
            
        }
        
    }

}

