
package herencia_empleado;


public class Empleado {
    
    private String nombre;
    
    public Empleado(String nombre){
        this.nombre = nombre;
    }
    
    public Empleado(){
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String toString(){
        return "Empleado: "+nombre;
    }
    
}
