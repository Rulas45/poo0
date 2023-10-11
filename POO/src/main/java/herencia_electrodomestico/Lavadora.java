
package herencia_electrodomestico;


public class Lavadora extends Electrodomestico{
    
    private final static int CARGA_DEF = 5;
    
    private int carga;

    public int getCarga() {
        return carga;
    }
    
    @Override
    public double precioFinal(){
        double plus = super.precioFinal();
        if(carga>30){
            plus+=50;
        }
        return plus;
    }

    public Lavadora(int carga, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    
    public Lavadora(){
        this.precioBase = PRECIO_BASE_DEF;
        this.peso = PESO_DEF;
        this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
        this.color = COLOR_DEF;
        this.carga = CARGA_DEF;
    }
    
    public Lavadora(double precioBase, double peso){
        this.precioBase = precioBase;
        this.peso = peso;
        this.peso = PESO_DEF;
        this.color = COLOR_DEF;
        this.carga = CARGA_DEF;
        
    }
    
    
    
}
