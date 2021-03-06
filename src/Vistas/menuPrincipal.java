package Vistas;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class menuPrincipal extends JFrame {
    private final JLabel etiqueta1, etiqueta2, icono1, icono2, icono3, icono4, icono5, icono6;
    private final JLabel titulo, piePgina;
    private final JLabel nom1, nom2, nom3, nom4, nom5, nom6;
    private final JPanel panel1;

    public menuPrincipal(){
       setLayout(null);
       setTitle("El Gran Mezon");
       this.setUndecorated(true);
       getContentPane().setBackground(Color.WHITE);
       
       panel1 = new JPanel();
       panel1.setLayout(null);
       panel1.setBackground(Color.WHITE);
       panel1.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
       panel1.setBounds(10, 10, 780, 580);
       this.add(panel1);
       
       titulo = new JLabel("El Gran Mezon");
       titulo.setBounds(20, 5, 250, 50);
       titulo.setVisible(true);
       titulo.setFont(new Font("Eras Medium ITC", 0 , 30));
       titulo.setForeground(Color.ORANGE);
       panel1.add(titulo);
       
       
       ImageIcon imagen = new ImageIcon("src\\Recursos\\tach.png");
       etiqueta1 = new JLabel(imagen);
       etiqueta1.setBounds(740, 0, 40, 40);
       etiqueta1.setVisible(true);
       etiqueta1.setHorizontalAlignment(JLabel.CENTER);
       panel1.add(etiqueta1);
       
       ImageIcon minim = new ImageIcon("src\\Recursos\\min.png");
       etiqueta2 = new JLabel(minim);
       etiqueta2.setBounds(700, 0, 40, 40);
       etiqueta2.setVisible(true);
       etiqueta2.setHorizontalAlignment(JLabel.CENTER);
       panel1.add(etiqueta2);
       
       ImageIcon icon1 = new ImageIcon("src\\Recursos\\isla.png");
       icono1 = new JLabel(icon1);
       icono1.setBounds(80, 100, 150, 150);
       icono1.setVisible(true);
       icono1.setHorizontalAlignment(JLabel.CENTER);
       panel1.add(icono1);
       
       ImageIcon icon2 = new ImageIcon("src\\Recursos\\crecimiento.png");
       icono2 = new JLabel(icon2);
       icono2.setBounds(80, 300, 150, 150);
       icono2.setVisible(true);
       icono2.setHorizontalAlignment(JLabel.CENTER);
       panel1.add(icono2);
       
       ImageIcon icon3 = new ImageIcon("src\\Recursos\\icon.png");
       icono3 = new JLabel(icon3);
       icono3.setBounds(530, 100, 150, 150);
       icono3.setVisible(true);
       icono3.setHorizontalAlignment(JLabel.CENTER);
       panel1.add(icono3);
       
       ImageIcon icon4 = new ImageIcon("src\\Recursos\\cliente.png");
       icono4 = new JLabel(icon4);
       icono4.setBounds(530, 300, 150, 150);
       icono4.setVisible(true);
       icono4.setHorizontalAlignment(JLabel.CENTER);
       panel1.add(icono4);
       
       ImageIcon icon5 = new ImageIcon("src\\Recursos\\equipo.png");
       icono5 = new JLabel(icon5);
       icono5.setBounds(300, 100, 150, 150);
       icono5.setVisible(true);
       icono5.setHorizontalAlignment(JLabel.CENTER);
       panel1.add(icono5);
       
       ImageIcon icon6 = new ImageIcon("src\\Recursos\\ayudar.png");
       icono6 = new JLabel(icon6);
       icono6.setBounds(300, 300, 150, 150);
       icono6.setVisible(true);
       icono6.setHorizontalAlignment(JLabel.CENTER);
       panel1.add(icono6);
       
       nom1 = new JLabel("Servicios");
       nom1.setBounds(115, 235, 250, 50);
       nom1.setVisible(true);
       nom1.setFont(new Font("Bookman Old Style", 0, 18));
       nom1.setForeground(Color.ORANGE);
       panel1.add(nom1);
       
       nom2 = new JLabel("Reportes");
       nom2.setBounds(115, 440, 250, 50);
       nom2.setVisible(true);
       nom2.setFont(new Font("Bookman Old Style", 0 , 18));
       nom2.setForeground(Color.ORANGE);
       panel1.add(nom2);
       
       nom3 = new JLabel("Pagina web");
       nom3.setBounds(325, 235, 250, 50);
       nom3.setVisible(true);
       nom3.setFont(new Font("Bookman Old Style", 0 , 18));
       nom3.setForeground(Color.ORANGE);
       panel1.add(nom3);
       
       nom4 = new JLabel("Ayuda");
       nom4.setBounds(350, 440, 250, 50);
       nom4.setVisible(true);
       nom4.setFont(new Font("Bookman Old Style", 0 , 18));
       nom4.setForeground(Color.ORANGE);
       panel1.add(nom4);
       
       nom5 = new JLabel("Estudios de mercado");
       nom5.setBounds(510, 235, 250, 50);
       nom5.setVisible(true);
       nom5.setFont(new Font("Bookman Old Style", 0 , 18));
       nom5.setForeground(Color.ORANGE);
       panel1.add(nom5);
       
       nom6 = new JLabel("Registro de clientes");
       nom6.setBounds(520, 440, 250, 50);
       nom6.setVisible(true);
       nom6.setFont(new Font("Bookman Old Style", 0 , 18));
       nom6.setForeground(Color.ORANGE);
       panel1.add(nom6);
       
       piePgina = new JLabel("©2018 El Gran Mezon Company");
       piePgina.setBounds(550, 540, 250, 50);
       piePgina.setVisible(true);
       piePgina.setFont(new Font("Bookman Old Style", 0 , 14));
       piePgina.setForeground(Color.ORANGE);
       panel1.add(piePgina);
       
       // clor de los iconos: D99B00 
       
       //Controles para los eventos
       Eventos me = new Eventos();
       icono1.addMouseListener(me);
       icono2.addMouseListener(me);
       icono3.addMouseListener(me);
       icono4.addMouseListener(me);
       icono5.addMouseListener(me);
       icono6.addMouseListener(me);
       etiqueta1.addMouseListener(me);
       etiqueta2.addMouseListener(me);
    }
    //Eventos
    
    private class Eventos extends MouseAdapter{
        
        @Override
        public void mouseEntered(MouseEvent e){
            if (e.getSource() == icono1){icono1.setBorder(BorderFactory.createLineBorder(Color.ORANGE));}
            if (e.getSource() == icono2){icono2.setBorder(BorderFactory.createLineBorder(Color.ORANGE));}
            if (e.getSource() == icono3){icono3.setBorder(BorderFactory.createLineBorder(Color.ORANGE));}
            if (e.getSource() == icono4){icono4.setBorder(BorderFactory.createLineBorder(Color.ORANGE));}
            if (e.getSource() == icono5){icono5.setBorder(BorderFactory.createLineBorder(Color.ORANGE));}
            if (e.getSource() == icono6){icono6.setBorder(BorderFactory.createLineBorder(Color.ORANGE));}
        }
        @Override
        public void mouseExited(MouseEvent e){
            if (e.getSource() == icono1){icono1.setBorder(null);}
            if (e.getSource() == icono2){icono2.setBorder(null);}
            if (e.getSource() == icono3){icono3.setBorder(null);}
            if (e.getSource() == icono4){icono4.setBorder(null);}
            if (e.getSource() == icono5){icono5.setBorder(null);}
            if (e.getSource() == icono6){icono6.setBorder(null);}            
        }
        @Override
        public void mouseClicked(MouseEvent e){
            if (e.getSource() == icono4){
                try{
                    Registro rm = new Registro();
                    rm.setBounds(0, 0, 800, 600);
                    rm.setVisible(true);
                    rm.setResizable(false);
                    rm.setLocationRelativeTo(null);
                }
                catch(Exception h){}
            }
            if(e.getSource() == etiqueta1){
                System.exit(0);
            }
            if(e.getSource() == icono2){
                try{
                    Reportes rm = new Reportes();
                    rm.setBounds(0, 0, 800, 600);
                    rm.setVisible(true);
                    rm.setResizable(false);
                    rm.setLocationRelativeTo(null);
                }
                catch(Exception h){}
                
            }
        }
        
    }

}
