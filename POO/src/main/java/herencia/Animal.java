
package herencia;


public class Animal {
    public void sonidoAnimal(){
        System.out.println("El animal hace un sonido");
    }
}


class Perro extends Animal{
    @Override
    public void sonidoAnimal(){
        System.out.println("Guau guau");
    }
}
class Gato extends Animal{
    @Override
    public void sonidoAnimal(){
        System.out.println("miau miau");
    }
}