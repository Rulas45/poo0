
package herencia_empleado;


public class Operario extends Empleado{
    
    public Operario(String nombre){
        super(nombre);
    }
    
    public Operario(){
        
    }
    
    public String toString(){
        return super.toString() + "-> Operario";
    }
    
}
