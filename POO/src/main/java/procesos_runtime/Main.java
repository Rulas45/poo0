
package procesos_runtime;

import java.io.IOException;


public class Main {
    
    public static void main(String args[]){
        
        //Runtime, ProcessBuilder
        
        Runtime runtime = Runtime.getRuntime();
        
        try{
            runtime.exec("calc.exe");
        }catch(IOException ex){
            System.err.println("Excepción de E/S");
        }
        
        
    }
    
}
