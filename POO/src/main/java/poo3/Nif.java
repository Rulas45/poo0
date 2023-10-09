
package poo3;

import java.util.Scanner;


public class Nif {
    
    private int dni;
    private char letra;
    
    public Nif(int dni){
        this.dni = dni;
        letra = calcularLetra();
    }
    
    public Nif(){
        
    }
    
    private char calcularLetra(){
        char [] letras =  {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        
        return letras[dni%23];
        
    }
    
    public void leer(){
        Scanner scn = new Scanner(System.in);
        do{
            System.out.println("Introduzca la letra del dni");
            dni = scn.nextInt();
            
        }while(dni<=0);
        letra = calcularLetra();
    }
    
    @Override
    public String toString(){
        return "Numero del dni "+dni+" letra del dni: "+letra;
    }
    
}
