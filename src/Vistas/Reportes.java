
package Vistas;

import java.awt.Color;
import java.awt.event.ItemEvent;
import javax.swing.*;
import Classes.*;
import java.awt.Component;


/**
 *
 * @author kacha
 */
public class Reportes extends JFrame{
    private JPanel panel1, panel2, panel3;
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
       
     
       
       eleccion = new JComboBox();
       eleccion.setBackground(Color.WHITE);
       eleccion.setBounds(500, 20, 200, 20);
       eleccion.addItem("Puntos");
       eleccion.addItem("Barras");
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
