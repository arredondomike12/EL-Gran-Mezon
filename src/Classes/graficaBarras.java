
package Classes;

/**
 *
 * @author kacha
 */
import org.jfree.chart.*;
import org.jfree.data.xy.*;
import javax.swing.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
public final class graficaBarras extends Grafica {
    JFreeChart grafica;
    ChartPanel panel1;
    
    XYSeriesCollection datos = new XYSeriesCollection();;
    String titulo, etiquetaY, etiquetaX;
    private double [] x, y;
   
    
    public graficaBarras(){
        
    }
    
    @Override
    public String Descripcion(){
        return "Grafica de barras";
    }

    @Override
    public void insertarGrafica(String t) {
        titulo = t;
        etiquetaX ="Pramentro 1";
        etiquetaY ="Pramentro 2";
        DefaultCategoryDataset dt = new DefaultCategoryDataset();
        dt.addValue(20, "Hola", "");
        dt.addValue(20, "adios", "");
        grafica = ChartFactory.createBarChart3D(etiquetaY, etiquetaX, titulo, dt, PlotOrientation.VERTICAL, true, true, true); 
    }
    @Override
    public JPanel getPanelChart() {
        return new ChartPanel(grafica);
       
    }
}
    

