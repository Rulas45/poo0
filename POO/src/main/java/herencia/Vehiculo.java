
package herencia;


public class Vehiculo {
    
    public String matricula;
    public double mma;
    
    public void encenderVehiculo(){
        System.out.println("Vehiculo encendido");
    }
    
    public Vehiculo(String matricula, double mma){
        this.matricula = matricula;
        this.mma = mma;
    }
    
}

class Coche extends Vehiculo{
    
    public String color;
    public int km;
    
    public Coche(String matricula,double mma,String color, int km){
        super(matricula,mma);
        this.color = color;
        this.km = km;
    }
    
}

class Moto extends Coche{
    public int cilindrada;
    
    public Moto(String matricula,double mma,String color, int km,int cilidrada){
        super(matricula,mma,color,km);
        this.cilindrada = cilindrada;
    }
}