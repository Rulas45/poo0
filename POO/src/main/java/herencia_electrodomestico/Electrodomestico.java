
package herencia_electrodomestico;


public class Electrodomestico {
    
    protected final static String COLOR_DEF = "blanco";
    protected final static char CONSUMO_ENERGETICO_DEF = 'F';
    protected final static double PRECIO_BASE_DEF = 100;
    protected final static double PESO_DEF = 5;
    
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    
    private void comprobarColor(String color){
        String colores[] = {"blanco","negro","azul","gris"};
        boolean correcto = false;
        for(int i = 0;i<colores.length && !correcto;i++){
            if(colores[i].equals(color)){
                correcto = true;
            }
        }
        if(correcto){
            this.color = color;
        }else{
            this.color = COLOR_DEF;
        }
    }
    
    public void comprobarConsumoEnergetico(char consumoEnergetico){
        if(consumoEnergetico>=65 && consumoEnergetico<=70){
            this.consumoEnergetico = consumoEnergetico;
        }else{
            this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
        }
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }
    
    public double precioFinal(){
        double plus = 0;
        switch(consumoEnergetico){
            case 'A':
                plus += 100;
                break;
            case 'B':
                plus+=80;
                break;
            case 'C':
                plus+=60;
                break;
            case 'D':
                plus +=50;
                break;
            case 'E':
                plus +=30;
                break;
            case 'F':
                plus+=10;
                break;
        }
        if(peso >= 0 && peso <19){
            plus+=10;
        }else if(plus >=20 && plus <49){
            plus+=50;
        }else if(plus >=50 && plus <79){
            plus+=80;
        }else if(plus >=80){
            plus+=100;
        }
        return precioBase + plus;
        
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }
    
    public Electrodomestico(double precioBase, double peso){
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
        this.color = COLOR_DEF;
    }
    
    public Electrodomestico(){
        this.precioBase = PRECIO_BASE_DEF;
        this.peso = PESO_DEF;
        this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
        this.color = COLOR_DEF;
    }
    
    
   
    
}
