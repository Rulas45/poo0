
package abstraccion;


public class Ejemplo implements Animal{

    @Override
    public void animalSonido() {
        System.out.println("Guau guau");
    }

    @Override
    public void dormir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

