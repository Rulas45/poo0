
package herencia_empleado;


public class Directivo extends Empleado{
    
   public Directivo(){
       
   }
   
   public Directivo(String nombre){
       super(nombre);
   }
   
   public String toString(){
       return super.toString()+" -> Directivo";
   }
    
}
