
package Classes;

/**
 *
 * @author kacha
 */
public class fabricaGraficas {
    
    protected String tipo;
    
    public fabricaGraficas(String t){
        tipo = t;
    }
    
    public Grafica crearGrafica(){
        if(tipo.equalsIgnoreCase("Barras")){
            return new graficaBarras();
        }
        else if(tipo.equalsIgnoreCase("Puntos")) {
            return new graficaPuntos();
        }
        return null;
    }
    
}
