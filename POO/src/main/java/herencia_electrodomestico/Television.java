
package herencia_electrodomestico;


public class Television extends Electrodomestico {
    private final static int RESOLUCION_DEF = 20;
    
    private int resolucion;
    private boolean sintonizadorTDT;
    
    @Override
    public double precioFinal(){
        double plus = super.precioFinal();
        
        if(resolucion>40){
            plus+=precioBase*0.3;
        }
        if(sintonizadorTDT){
            plus+=50;
        }
        return plus;
    }

    public Television(int resolucion, boolean sintonizadorTDT, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    public Television(){
        this.precioBase = PRECIO_BASE_DEF;
        this.peso = PESO_DEF;
        this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
        this.color = COLOR_DEF;
        this.resolucion = RESOLUCION_DEF;
        this.sintonizadorTDT = false;
    }
    
    public Television(double precioBase,double peso){
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
        this.color = COLOR_DEF;
        this.resolucion = RESOLUCION_DEF;
        this.sintonizadorTDT = false;
    }
    
}
