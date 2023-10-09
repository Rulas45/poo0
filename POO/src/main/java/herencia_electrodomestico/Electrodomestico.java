
package herencia_electrodomestico;


public class Electrodomestico {
    
    public static final int PRECIO_DEF = 120;
    
    public int precio;
    public float peso;
    
    public Electrodomestico(float peso){
        this.precio = PRECIO_DEF;
        this.peso = peso;
    }
    
}
