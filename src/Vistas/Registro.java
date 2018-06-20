package Vistas;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Registro extends JFrame implements ActionListener {
    //ppp
    private final JPanel panel1, panel2, panel3, panel4, panel5;
    private final JLabel camp1, camp2, camp3, camp4, camp5, camp6, camp7, camp8, camp9, camp10;
    private final JLabel etiqueta1, etiqueta2;
    private final JLabel titulo, piePgina, btnGuardar, btnSalir;
    private final JTextField campo1, campo2, campo3, campo4, campo5, campo6, campo7, campo8, campo9, campo10, campo11;
    //Controles del panel de bajas
    private final JLabel camp11, camp12, camp13, camp14, camp15, camp16, camp17, camp18, camp19, camp20, IDcamp;
    private final JTextField campo12, campo13, campo14, campo15, campo16, campo17, campo18, campo19, campo20, campo21, campo22, IDcampo;
    private final JLabel btnBorrar2, btnSalir2;
    //Controles del panal de Modificaciones
    private final JLabel camp21, camp22, camp23, camp24, camp25, camp26, camp27, camp28, camp29, camp30, IDcamp2;
    private final JTextField campo23, campo24, campo25, campo26, campo27, campo28, campo29, campo30, campo31, campo32, campo33, IDcampo2;
    private final JLabel btnModificar, btnSalir3;
    //Menu
    private final JLabel menu1, menu2, menu3;
   
    
    private String URLRecursos = "C:\\Users\\dell\\Documents\\NetBeansProjects\\El Gran Mezon 2.0\\src\\Recursos";
    
    public Registro(){
        setLayout(null);
        this.setUndecorated(true);
        getContentPane().setBackground(Color.WHITE);
     
        
       panel1 = new JPanel();
       panel1.setLayout(null);
       panel1.setBackground(Color.WHITE);
       panel1.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
       panel1.setBounds(10, 10, 780, 580);
       this.add(panel1);
       
       titulo = new JLabel("Registro:");
       titulo.setBounds(20, 5, 250, 50);
       titulo.setVisible(true);
       titulo.setFont(new Font("Eras Medium ITC", 0 , 30));
       titulo.setForeground(Color.ORANGE);
       panel1.add(titulo);
       
       panel2 = new JPanel();
       panel2.setLayout(null);
       panel2.setVisible(true);
       panel2.setBackground(Color.WHITE);
       panel2.setBounds(30, 50, 310, 525);
       panel1.add(panel2);
       
       panel3 = new JPanel();
       panel3.setLayout(null);
       panel3.setBackground(Color.WHITE);
       panel3.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
       panel3.setBounds(350, 85, 400, 465);
       panel1.add(panel3);
       
       ImageIcon imagen = new ImageIcon(URLRecursos + "\\cerrar.png");
       etiqueta1 = new JLabel(imagen);
       etiqueta1.setBounds(740, 0, 40, 40);
       etiqueta1.setVisible(true);
       etiqueta1.setHorizontalAlignment(JLabel.CENTER);
       panel1.add(etiqueta1);
       
       ImageIcon minim = new ImageIcon(URLRecursos + "\\multi-tab.png");
       etiqueta2 = new JLabel(minim);
       etiqueta2.setBounds(700, 0, 40, 40);
       etiqueta2.setVisible(true);
       etiqueta2.setHorizontalAlignment(JLabel.CENTER);
       panel1.add(etiqueta2);
       
       piePgina = new JLabel("©2018 El Gran Mezon Company");
       piePgina.setBounds(550, 540, 250, 50);
       piePgina.setVisible(true);
       piePgina.setFont(new Font("Bookman Old Style", 0 , 14));
       piePgina.setForeground(Color.ORANGE);
       panel1.add(piePgina);
       
       camp1 = new JLabel("Nombre: ");
       camp1.setBounds(20, 30, 80, 50);
       camp1.setVisible(true);
       camp1.setFont(new Font("Bookman Old Style", 0 , 14));
       camp1.setForeground(Color.ORANGE);
       panel2.add(camp1);
       
       campo1 = new JTextField();
       campo1.setBounds(85, 45, 150, 20);
       campo1.setVisible(true);
       campo1.setFont(new Font("Bookman Old Style", 0 , 14));
       panel2.add(campo1);
       
       camp2 = new JLabel("Apellidos:");
       camp2.setBounds(20, 60, 100, 70);
       camp2.setVisible(true);
       camp2.setFont(new Font("Bookman Old Style", 0 , 14));
       camp2.setForeground(Color.ORANGE);
       panel2.add(camp2);
       
       campo2 = new JTextField();
       campo2.setBounds(100, 85, 90, 20);
       campo2.setVisible(true);
       campo2.setFont(new Font("Bookman Old Style", 0 , 14));
       panel2.add(campo2);
       
       campo3 = new JTextField();
       campo3.setBounds(200, 85, 90, 20);
       campo3.setVisible(true);
       campo3.setFont(new Font("Bookman Old Style", 0 , 14));
       panel2.add(campo3);
       
       camp3 = new JLabel("Edad:");
       camp3.setBounds(20, 100, 100, 70);
       camp3.setVisible(true);
       camp3.setFont(new Font("Bookman Old Style", 0 , 14));
       camp3.setForeground(Color.ORANGE);
       panel2.add(camp3);
       
       campo4 = new JTextField();
       campo4.setBounds(70, 125, 90, 20);
       campo4.setVisible(true);
       campo4.setFont(new Font("Bookman Old Style", 0 , 14));
       panel2.add(campo4);
       
       camp4 = new JLabel("Fecha de \n nacimiento:");
       camp4.setBounds(20, 140, 180, 70);
       camp4.setVisible(true);
       camp4.setFont(new Font("Bookman Old Style", 0 , 14));
       camp4.setForeground(Color.ORANGE);
       panel2.add(camp4);
       
       campo5 = new JTextField();
       campo5.setBounds(185, 165, 120, 20);
       campo5.setVisible(true);
       campo5.setFont(new Font("Bookman Old Style", 0 , 14));
       panel2.add(campo5);
       
       camp5 = new JLabel("Domicilio:");
       camp5.setBounds(20, 180, 180, 70);
       camp5.setVisible(true);
       camp5.setFont(new Font("Bookman Old Style", 0 , 14));
       camp5.setForeground(Color.ORANGE);
       panel2.add(camp5);
       
       campo6 = new JTextField();
       campo6.setBounds(100, 205, 120, 20);
       campo6.setVisible(true);
       campo6.setFont(new Font("Bookman Old Style", 0 , 14));
       panel2.add(campo6);
       
       camp6 = new JLabel("Calle:");
       camp6.setBounds(20, 220, 180, 70);
       camp6.setVisible(true);
       camp6.setFont(new Font("Bookman Old Style", 0 , 14));
       camp6.setForeground(Color.ORANGE);
       panel2.add(camp6);
       
       campo7 = new JTextField();
       campo7.setBounds(70, 245, 100, 20);
       campo7.setVisible(true);
       campo7.setFont(new Font("Bookman Old Style", 0 , 14));
       panel2.add(campo7);
       
       camp7 = new JLabel("N#:");
       camp7.setBounds(180, 220, 180, 70);
       camp7.setVisible(true);
       camp7.setFont(new Font("Bookman Old Style", 0 , 14));
       camp7.setForeground(Color.ORANGE);
       panel2.add(camp7);
       
       campo8 = new JTextField();
       campo8.setBounds(210, 245, 80, 20);
       campo8.setVisible(true);
       campo8.setFont(new Font("Bookman Old Style", 0 , 14));
       panel2.add(campo8);
       
       camp8 = new JLabel("Municipio:");
       camp8.setBounds(20, 260, 180, 70);
       camp8.setVisible(true);
       camp8.setFont(new Font("Bookman Old Style", 0 , 14));
       camp8.setForeground(Color.ORANGE);
       panel2.add(camp8);
       
       campo9 = new JTextField();
       campo9.setBounds(105, 285, 150, 20);
       campo9.setVisible(true);
       campo9.setFont(new Font("Bookman Old Style", 0 , 14));
       panel2.add(campo9);
       
       camp9 = new JLabel("Telefono:");
       camp9.setBounds(20, 300, 180, 70);
       camp9.setVisible(true);
       camp9.setFont(new Font("Bookman Old Style", 0 , 14));
       camp9.setForeground(Color.ORANGE);
       panel2.add(camp9);
       
       campo10 = new JTextField();
       campo10.setBounds(90, 325, 150, 20);
       campo10.setVisible(true);
       campo10.setFont(new Font("Bookman Old Style", 0 , 14));
       panel2.add(campo10);
       
       camp10 = new JLabel("Email:");
       camp10.setBounds(20, 340, 180, 70);
       camp10.setVisible(true);
       camp10.setFont(new Font("Bookman Old Style", 0 , 14));
       camp10.setForeground(Color.ORANGE);
       panel2.add(camp10);
       
       campo11 = new JTextField();
       campo11.setBounds(70, 365, 150, 20);
       campo11.setVisible(true);
       campo11.setFont(new Font("Bookman Old Style", 0 , 14));
       panel2.add(campo11);
       
       btnGuardar = new JLabel("Salir");
       btnGuardar.setBounds(220, 460, 80, 40);
       btnGuardar.setVisible(true);
       btnGuardar.setFont(new Font("Bookman Old Style", 0 , 14));
       btnGuardar.setForeground(Color.ORANGE);
       btnGuardar.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
       btnGuardar.setHorizontalAlignment(JLabel.CENTER);
       panel2.add(btnGuardar);
       
       btnSalir = new JLabel("Guardar");
       btnSalir.setBounds(130, 460, 80, 40);
       btnSalir.setVisible(true);
       btnSalir.setFont(new Font("Bookman Old Style", 0 , 14));
       btnSalir.setForeground(Color.ORANGE);
       btnSalir.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
       btnSalir.setHorizontalAlignment(JLabel.CENTER);
       panel2.add(btnSalir);
       
       //Pnael Bajas
       panel4 = new JPanel();
       panel4.setLayout(null);
       panel4.setVisible(false);
       panel4.setBackground(Color.WHITE);
       panel4.setBounds(30, 50, 310, 525);
       panel1.add(panel4);
       
       camp11 = new JLabel("Nombre: ");
       camp11.setBounds(20, 30, 80, 50);
       camp11.setVisible(true);
       camp11.setFont(new Font("Bookman Old Style", 0 , 14));
       camp11.setForeground(Color.ORANGE);
       panel4.add(camp11);
       
       campo12 = new JTextField();
       campo12.setBounds(85, 45, 150, 20);
       campo12.setVisible(true);
       campo12.setFont(new Font("Bookman Old Style", 0 , 14));
       panel4.add(campo12);
       
       camp12 = new JLabel("Apellidos:");
       camp12.setBounds(20, 60, 100, 70);
       camp12.setVisible(true);
       camp12.setFont(new Font("Bookman Old Style", 0 , 14));
       camp12.setForeground(Color.ORANGE);
       panel4.add(camp12);
       
       campo13 = new JTextField();
       campo13.setBounds(100, 85, 90, 20);
       campo13.setVisible(true);
       campo13.setFont(new Font("Bookman Old Style", 0 , 14));
       panel4.add(campo13);
       
       campo14 = new JTextField();
       campo14.setBounds(200, 85, 90, 20);
       campo14.setVisible(true);
       campo14.setFont(new Font("Bookman Old Style", 0 , 14));
       panel4.add(campo14);
       
       camp13 = new JLabel("Edad:");
       camp13.setBounds(20, 100, 100, 70);
       camp13.setVisible(true);
       camp13.setFont(new Font("Bookman Old Style", 0 , 14));
       camp13.setForeground(Color.ORANGE);
       panel4.add(camp13);
       
       campo15 = new JTextField();
       campo15.setBounds(70, 125, 90, 20);
       campo15.setVisible(true);
       campo15.setFont(new Font("Bookman Old Style", 0 , 14));
       panel4.add(campo15);
       
       camp14 = new JLabel("Fecha de \n nacimiento:");
       camp14.setBounds(20, 140, 180, 70);
       camp14.setVisible(true);
       camp14.setFont(new Font("Bookman Old Style", 0 , 14));
       camp14.setForeground(Color.ORANGE);
       panel4.add(camp14);
       
       campo16 = new JTextField();
       campo16.setBounds(185, 165, 120, 20);
       campo16.setVisible(true);
       campo16.setFont(new Font("Bookman Old Style", 0 , 14));
       panel4.add(campo16);
       
       camp15 = new JLabel("Domicilio:");
       camp15.setBounds(20, 180, 180, 70);
       camp15.setVisible(true);
       camp15.setFont(new Font("Bookman Old Style", 0 , 14));
       camp15.setForeground(Color.ORANGE);
       panel4.add(camp15);
       
       campo17 = new JTextField();
       campo17.setBounds(100, 205, 120, 20);
       campo17.setVisible(true);
       campo17.setFont(new Font("Bookman Old Style", 0 , 14));
       panel4.add(campo17);
       
       camp16 = new JLabel("Calle:");
       camp16.setBounds(20, 220, 180, 70);
       camp16.setVisible(true);
       camp16.setFont(new Font("Bookman Old Style", 0 , 14));
       camp16.setForeground(Color.ORANGE);
       panel4.add(camp16);
       
       campo18 = new JTextField();
       campo18.setBounds(70, 245, 100, 20);
       campo18.setVisible(true);
       campo18.setFont(new Font("Bookman Old Style", 0 , 14));
       panel4.add(campo18);
       
       camp17 = new JLabel("N#:");
       camp17.setBounds(180, 220, 180, 70);
       camp17.setVisible(true);
       camp17.setFont(new Font("Bookman Old Style", 0 , 14));
       camp17.setForeground(Color.ORANGE);
       panel4.add(camp17);
       
       campo19 = new JTextField();
       campo19.setBounds(210, 245, 80, 20);
       campo19.setVisible(true);
       campo19.setFont(new Font("Bookman Old Style", 0 , 14));
       panel4.add(campo19);
       
       camp18 = new JLabel("Municipio:");
       camp18.setBounds(20, 260, 180, 70);
       camp18.setVisible(true);
       camp18.setFont(new Font("Bookman Old Style", 0 , 14));
       camp18.setForeground(Color.ORANGE);
       panel4.add(camp18);
       
       campo20 = new JTextField();
       campo20.setBounds(105, 285, 150, 20);
       campo20.setVisible(true);
       campo20.setFont(new Font("Bookman Old Style", 0 , 14));
       panel4.add(campo20);
       
       camp19 = new JLabel("Telefono:");
       camp19.setBounds(20, 300, 180, 70);
       camp19.setVisible(true);
       camp19.setFont(new Font("Bookman Old Style", 0 , 14));
       camp19.setForeground(Color.ORANGE);
       panel4.add(camp19);
       
       campo21 = new JTextField();
       campo21.setBounds(90, 325, 150, 20);
       campo21.setVisible(true);
       campo21.setFont(new Font("Bookman Old Style", 0 , 14));
       panel4.add(campo21);
       
       camp20 = new JLabel("Email:");
       camp20.setBounds(20, 340, 180, 70);
       camp20.setVisible(true);
       camp20.setFont(new Font("Bookman Old Style", 0 , 14));
       camp20.setForeground(Color.ORANGE);
       panel4.add(camp20);
       
       campo22 = new JTextField();
       campo22.setBounds(70, 365, 150, 20);
       campo22.setVisible(true);
       campo22.setFont(new Font("Bookman Old Style", 0 , 14));
       panel4.add(campo22);
       
       IDcamp = new JLabel("ID_Cliente:");
       IDcamp.setBounds(20, 380, 180, 70);
       IDcamp.setVisible(true);
       IDcamp.setFont(new Font("Bookman Old Style", 0 , 14));
       IDcamp.setForeground(Color.ORANGE);
       panel4.add(IDcamp);
       
       IDcampo = new JTextField();
       IDcampo.setBounds(105, 405, 150, 20);
       IDcampo.setVisible(true);
       IDcampo.setFont(new Font("Bookman Old Style", 0 , 14));
       panel4.add(IDcampo);
       
       btnBorrar2 = new JLabel("Borrar");
       btnBorrar2.setBounds(220, 460, 80, 40);
       btnBorrar2.setVisible(true);
       btnBorrar2.setFont(new Font("Bookman Old Style", 0 , 14));
       btnBorrar2.setForeground(Color.ORANGE);
       btnBorrar2.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
       btnBorrar2.setHorizontalAlignment(JLabel.CENTER);
       panel4.add(btnBorrar2);
       
       btnSalir2 = new JLabel("Salir");
       btnSalir2.setBounds(130, 460, 80, 40);
       btnSalir2.setVisible(true);
       btnSalir2.setFont(new Font("Bookman Old Style", 0 , 14));
       btnSalir2.setForeground(Color.ORANGE);
       btnSalir2.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
       btnSalir2.setHorizontalAlignment(JLabel.CENTER);
       panel4.add(btnSalir2);
       
       //Panel Modificaciones
       panel5 = new JPanel();
       panel5.setLayout(null);
       panel5.setVisible(false);
       panel5.setBackground(Color.WHITE);
       panel5.setBounds(30, 50, 310, 525);
       panel1.add(panel5);
       
       camp21 = new JLabel("Nombre: ");
       camp21.setBounds(20, 30, 80, 50);
       camp21.setVisible(true);
       camp21.setFont(new Font("Bookman Old Style", 0 , 14));
       camp21.setForeground(Color.ORANGE);
       panel5.add(camp21);
       
       campo23 = new JTextField();
       campo23.setBounds(85, 45, 150, 20);
       campo23.setVisible(true);
       campo23.setFont(new Font("Bookman Old Style", 0 , 14));
       panel5.add(campo23);
       
       camp22 = new JLabel("Apellidos:");
       camp22.setBounds(20, 60, 100, 70);
       camp22.setVisible(true);
       camp22.setFont(new Font("Bookman Old Style", 0 , 14));
       camp22.setForeground(Color.ORANGE);
       panel5.add(camp22);
       
       campo24 = new JTextField();
       campo24.setBounds(100, 85, 90, 20);
       campo24.setVisible(true);
       campo24.setFont(new Font("Bookman Old Style", 0 , 14));
       panel5.add(campo24);
       
       campo25 = new JTextField();
       campo25.setBounds(200, 85, 90, 20);
       campo25.setVisible(true);
       campo25.setFont(new Font("Bookman Old Style", 0 , 14));
       panel5.add(campo25);
       
       camp23 = new JLabel("Edad:");
       camp23.setBounds(20, 100, 100, 70);
       camp23.setVisible(true);
       camp23.setFont(new Font("Bookman Old Style", 0 , 14));
       camp23.setForeground(Color.ORANGE);
       panel5.add(camp23);
       
       campo26 = new JTextField();
       campo26.setBounds(70, 125, 90, 20);
       campo26.setVisible(true);
       campo26.setFont(new Font("Bookman Old Style", 0 , 14));
       panel5.add(campo26);
       
       camp24 = new JLabel("Fecha de \n nacimiento:");
       camp24.setBounds(20, 140, 180, 70);
       camp24.setVisible(true);
       camp24.setFont(new Font("Bookman Old Style", 0 , 14));
       camp24.setForeground(Color.ORANGE);
       panel5.add(camp24);
       
       campo27 = new JTextField();
       campo27.setBounds(185, 165, 120, 20);
       campo27.setVisible(true);
       campo27.setFont(new Font("Bookman Old Style", 0 , 14));
       panel5.add(campo27);
       
       camp25 = new JLabel("Domicilio:");
       camp25.setBounds(20, 180, 180, 70);
       camp25.setVisible(true);
       camp25.setFont(new Font("Bookman Old Style", 0 , 14));
       camp25.setForeground(Color.ORANGE);
       panel5.add(camp25);
       
       campo28 = new JTextField();
       campo28.setBounds(100, 205, 120, 20);
       campo28.setVisible(true);
       campo28.setFont(new Font("Bookman Old Style", 0 , 14));
       panel5.add(campo28);
       
       camp26 = new JLabel("Calle:");
       camp26.setBounds(20, 220, 180, 70);
       camp26.setVisible(true);
       camp26.setFont(new Font("Bookman Old Style", 0 , 14));
       camp26.setForeground(Color.ORANGE);
       panel5.add(camp26);
       
       campo29 = new JTextField();
       campo29.setBounds(70, 245, 100, 20);
       campo29.setVisible(true);
       campo29.setFont(new Font("Bookman Old Style", 0 , 14));
       panel5.add(campo29);
       
       camp27 = new JLabel("N#:");
       camp27.setBounds(180, 220, 180, 70);
       camp27.setVisible(true);
       camp27.setFont(new Font("Bookman Old Style", 0 , 14));
       camp27.setForeground(Color.ORANGE);
       panel5.add(camp27);
       
       campo30 = new JTextField();
       campo30.setBounds(210, 245, 80, 20);
       campo30.setVisible(true);
       campo30.setFont(new Font("Bookman Old Style", 0 , 14));
       panel5.add(campo30);
       
       camp28 = new JLabel("Municipio:");
       camp28.setBounds(20, 260, 180, 70);
       camp28.setVisible(true);
       camp28.setFont(new Font("Bookman Old Style", 0 , 14));
       camp28.setForeground(Color.ORANGE);
       panel5.add(camp28);
       
       campo31 = new JTextField();
       campo31.setBounds(105, 285, 150, 20);
       campo31.setVisible(true);
       campo31.setFont(new Font("Bookman Old Style", 0 , 14));
       panel5.add(campo31);
       
       camp29 = new JLabel("Telefono:");
       camp29.setBounds(20, 300, 180, 70);
       camp29.setVisible(true);
       camp29.setFont(new Font("Bookman Old Style", 0 , 14));
       camp29.setForeground(Color.ORANGE);
       panel5.add(camp29);
       
       campo32 = new JTextField();
       campo32.setBounds(90, 325, 150, 20);
       campo32.setVisible(true);
       campo32.setFont(new Font("Bookman Old Style", 0 , 14));
       panel5.add(campo32);
       
       camp30 = new JLabel("Email:");
       camp30.setBounds(20, 340, 180, 70);
       camp30.setVisible(true);
       camp30.setFont(new Font("Bookman Old Style", 0 , 14));
       camp30.setForeground(Color.ORANGE);
       panel5.add(camp30);
       
       campo33 = new JTextField();
       campo33.setBounds(70, 365, 150, 20);
       campo33.setVisible(true);
       campo33.setFont(new Font("Bookman Old Style", 0 , 14));
       panel5.add(campo33);
       
       IDcamp2 = new JLabel("ID_Cliente:");
       IDcamp2.setBounds(20, 380, 180, 70);
       IDcamp2.setVisible(true);
       IDcamp2.setFont(new Font("Bookman Old Style", 0 , 14));
       IDcamp2.setForeground(Color.ORANGE);
       panel5.add(IDcamp2);
       
       IDcampo2 = new JTextField();
       IDcampo2.setBounds(105, 405, 150, 20);
       IDcampo2.setVisible(true);
       IDcampo2.setFont(new Font("Bookman Old Style", 0 , 14));
       panel5.add(IDcampo2);
       
       btnModificar = new JLabel("Modificar");
       btnModificar.setBounds(220, 460, 80, 40);
       btnModificar.setVisible(true);
       btnModificar.setFont(new Font("Bookman Old Style", 0 , 14));
       btnModificar.setForeground(Color.ORANGE);
       btnModificar.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
       btnModificar.setHorizontalAlignment(JLabel.CENTER);
       panel5.add(btnModificar);
       
       btnSalir3 = new JLabel("Salir");
       btnSalir3.setBounds(130, 460, 80, 40);
       btnSalir3.setVisible(true);
       btnSalir3.setFont(new Font("Bookman Old Style", 0 , 14));
       btnSalir3.setForeground(Color.ORANGE);
       btnSalir3.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
       btnSalir3.setHorizontalAlignment(JLabel.CENTER);
       panel5.add(btnSalir3);
       
       //Opciones
       
       menu1 = new JLabel("Registrar");
       menu1.setBounds(150, 15, 100, 30);
       menu1.setVisible(true);
       menu1.setHorizontalAlignment(JLabel.CENTER);
       menu1.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
       menu1.setFont(new Font("Bookman Old Style", 0 , 14));
       menu1.setForeground(Color.ORANGE);
       panel1.add(menu1);
       
       menu2 = new JLabel("Borrar");
       menu2.setBounds(260, 15, 100, 30);
       menu2.setVisible(true);
       menu2.setHorizontalAlignment(JLabel.CENTER);
       menu2.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
       menu2.setFont(new Font("Bookman Old Style", 0 , 14));
       menu2.setForeground(Color.ORANGE);
       panel1.add(menu2);
       
       menu3 = new JLabel("Modificar");
       menu3.setBounds(370, 15, 100, 30);
       menu3.setVisible(true);
       menu3.setHorizontalAlignment(JLabel.CENTER);
       menu3.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
       menu3.setFont(new Font("Bookman Old Style", 0 , 14));
       menu3.setForeground(Color.ORANGE);
       panel1.add(menu3);
       
       
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
}
