/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.*;

/**
 *
 * @author kacha
 */
public class graficaLineas extends Grafica {
    JFreeChart grafica;
    XYSeriesCollection datos = new XYSeriesCollection();

    @Override
    public void insertarGrafica(String t) {
        agregarDatos();
        String titulo = t;
        String etiquetaX = "Pramentro 1";
        String etiquetaY = "Pramentro 2";
        DefaultCategoryDataset dt = new DefaultCategoryDataset();
        dt.addValue(20, "Hola", "");
        dt.addValue(20, "adios", "");
        grafica = ChartFactory.createXYStepChart(titulo, etiquetaX, etiquetaY, datos, PlotOrientation.HORIZONTAL, true, true, true);
    }

    @Override
    public JPanel getPanelChart() {
        return new ChartPanel(grafica);  
    }
    private void agregarDatos(){
        XYSeries lm = new XYSeries("Nueva Series");
        double [] x = new double [9];
        double [] y = new double [9];
        
        for(int i =0 ; i < x.length; i++){
            x [i] = (int)Math.round(Math.random()*10+1);
            y [i] = (int)Math.round(Math.random()*10+1);
            for(int j = 0; j < y.length; j++){
                lm.add(x[j], y[j]);
            }
        }
        datos.addSeries(lm);
                
    }
    
}
