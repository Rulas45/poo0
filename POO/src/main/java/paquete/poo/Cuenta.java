
package paquete.poo;


public class Cuenta {
    
    private String titular;
    private double cantidad;
    
   
    
    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    public Cuenta(String titular){
        this.titular = titular;
        this.cantidad = 0;
    }
    
    public Cuenta(final Cuenta c){
        
        titular = c.titular;
        cantidad = c.cantidad;
        
    }
    
    public String getTitular(){
        return titular;
    }
    public double getCantidad(){
        return cantidad;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    public void setCantidad(double cantidad){
        if(cantidad>0){
            this.cantidad = cantidad;
        }
    }
    
    @Override
    public String toString(){
        return "Titular "+titular+" y la cantidad es: "+cantidad;
    }
    
    public void ingresar(double cantidad){
        if(cantidad>0){
            this.cantidad += cantidad;
        }
    }
    
    public void retirar(double cantidad){
        if(this.cantidad - cantidad <0){
            this.cantidad = 0;
        }else{
            this.cantidad -= cantidad;
        }
    }
}
