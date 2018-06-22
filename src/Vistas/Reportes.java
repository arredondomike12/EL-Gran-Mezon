
package Vistas;

import java.awt.Color;
import java.awt.event.ItemEvent;
import javax.swing.*;
import Classes.*;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


/**
 *
 * @author kacha
 */
public class Reportes extends JFrame{
    private JPanel panel1, panel2;
    private JLabel etiqueta1, cerrar, minimizar;
    private JComboBox eleccion;
    private Grafica miGrafica ;
    private fabricaGraficas miFabrica;
    
    public Reportes(){
       setLayout(null);
       setTitle("El Gran Mezon");
       this.setUndecorated(true);
       getContentPane().setBackground(Color.WHITE);
       
       miFabrica = new fabricaGraficas("Puntos");
       miGrafica = miFabrica.crearGrafica();
       miGrafica.insertarGrafica("Puntos");
       panel2 = miGrafica.getPanelChart();
       
       
       panel1 = new JPanel();
       panel1.setLayout(null);
       panel1.setBackground(Color.WHITE);
       panel1.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
       panel1.setBounds(10, 10, 780, 580);
       this.add(panel1);
     
       panel2.setLayout(null);
       panel2.setBackground(Color.WHITE);
       panel2.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
       panel2.setBounds(40, 50, 700, 500);
       panel2.setVisible(true);
       panel2.setName("PanelDesechable");
       panel1.add(panel2);
       
       etiqueta1 = new JLabel("Seleccion el tipo de reporte:");
       etiqueta1.setBounds(50, 15, 250, 20);
       etiqueta1.setBackground(Color.WHITE);
       etiqueta1.setFont(new Font("Bookman Old Style", 0, 14));
       etiqueta1.setForeground(Color.ORANGE);
       etiqueta1.setVisible(true);
       panel1.add(etiqueta1);
       
       ImageIcon imagen = new ImageIcon("src\\Recursos\\tach.png");
       cerrar = new JLabel(imagen);
       cerrar.setBounds(740, 0, 40, 40);
       cerrar.setVisible(true);
       cerrar.setHorizontalAlignment(JLabel.CENTER);
       panel1.add(cerrar);
       
       ImageIcon minim = new ImageIcon("src\\Recursos\\min.png");
       minimizar = new JLabel(minim);
       minimizar.setBounds(700, 0, 40, 40);
       minimizar.setVisible(true);
       minimizar.setHorizontalAlignment(JLabel.CENTER);
       panel1.add(minimizar);
       
     
       
       eleccion = new JComboBox();
       eleccion.setBackground(Color.WHITE);
       eleccion.setBounds(255, 15, 200, 20);
       eleccion.addItem("Puntos");
       eleccion.addItem("Barras");
       eleccion.addItem("Lineas");
       panel1.add(eleccion);
       
   
       
       
       eleccion.addItemListener((ItemEvent e) -> {
           if(e.getStateChange() == ItemEvent.SELECTED){
               int index = eleccion.getSelectedIndex();
               String tipo = e.getItem().toString();
               miFabrica = new fabricaGraficas(tipo);
               miGrafica = miFabrica.crearGrafica();
               miGrafica.insertarGrafica(tipo);
               añadirPanel(miGrafica.getPanelChart());
               System.out.println(tipo);
           }
       });
       
       cerrar.addMouseListener(new MouseListener(){
        
           @Override
           public void mouseClicked(MouseEvent me){
               if (me.getSource() == cerrar){
                   dispose();
               }
           }
           @Override
           public void mousePressed(MouseEvent me){}
           @Override
           public void mouseReleased(MouseEvent me){}
           @Override
           public void mouseEntered(MouseEvent me){}
           @Override
           public void mouseExited(MouseEvent me){}
               
           
        
    });
       
       
       
        
    }
    private void añadirPanel(JPanel h){
        for(Component item : panel1.getComponents()){
            if("PanelDesechable".equals(item.getName())){
               panel1.remove(item);
               h.setBounds(40, 50, 700, 500);
               h.setName("PanelDesechable");
               panel1.add(h);
               panel1.repaint();
            }
        }

    }

    
}
