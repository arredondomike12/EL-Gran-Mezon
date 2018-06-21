
package Classes;

/**
 *
 * @author kacha
 */
import javax.swing.*;
public abstract class  Grafica {
    public Grafica(){
        
    }
    
    public String Descripcion(){
        return "Grafica generica";
    }
    
    public abstract void insertarGrafica(String t);
    public abstract JPanel getPanelChart();
    
}
