
package processbuilder;


public class Main {
    public static void main (String args[]){
        String ruta = "C:\\Program Files\\Adobe\\Acrobat DC\\Acrobat\\Acrobat.exe";
        
        Main m = new Main();
        m.ejecutar(ruta);
        System.out.println("Finalizado");
    }
    
    public void ejecutar(String ruta){
        ProcessBuilder pb;
        try{
            pb = new ProcessBuilder(ruta);
            pb.start();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
