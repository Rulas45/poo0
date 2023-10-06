
package poo2;

import java.util.Scanner;


public class Main {
    
    public static void main(String args[]){
        
        
        Scanner scn = new Scanner(System.in);
        String nombre;
        String numero;
        double tipo;
        double importe;
        
        Cuenta cuenta1 = new Cuenta();
        
        System.out.println("Introduzca nombre");
        nombre = scn.next();
        System.out.println("introduzca numero de cuenta");
        numero = scn.next();
        System.out.println("Introduzca tipo de interes");
        tipo = scn.nextDouble();
        System.out.println("Saldo:");
        importe = scn.nextDouble();
        
        cuenta1.setNombre(nombre);
        cuenta1.setNumeroCuenta(numero);
        cuenta1.setTipoInteres(tipo);
        cuenta1.setSaldo(importe);
        
        Cuenta cuenta2 = new Cuenta("Rafa","3838736873683",1.75,300);
        
        Cuenta cuenta3 = new Cuenta(cuenta1);
        
        System.out.println(cuenta1.getSaldo());
        
        cuenta1.ingreso(400);
        
        System.out.println(cuenta1.getSaldo());
        
        cuenta3.transferencia(cuenta2, 10);
        
        System.out.println(cuenta2.getSaldo());
        System.out.println(cuenta3.getSaldo());
        
    }
    
}
