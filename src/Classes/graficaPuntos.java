
package Classes;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author kacha
 */
public class graficaPuntos extends Grafica {
    JFreeChart grafica;
    ChartPanel panel1;
    
    XYSeriesCollection datos = new XYSeriesCollection();;
    String titulo, etiquetaY, etiquetaX;
    
    public graficaPuntos(){}
    
    @Override
    public String Descripcion(){
        return "Grafica de barras";
    }

    public void insertarGrafica(String t) {
        titulo = t;
        etiquetaX ="Pramentro 1";
        etiquetaY ="Pramentro 2";
        DefaultCategoryDataset dt = new DefaultCategoryDataset();
        dt.addValue(20, "Hola", "");
        dt.addValue(20, "adios", "");
        grafica = ChartFactory.createLineChart3D(titulo, etiquetaX, etiquetaY, dt, PlotOrientation.HORIZONTAL, true, true, true);
    }
    @Override
    public JPanel getPanelChart() {
        return new ChartPanel(grafica);
       
    }
    
}
