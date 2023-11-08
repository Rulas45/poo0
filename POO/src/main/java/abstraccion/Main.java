
package abstraccion;

import java.util.Scanner;

public class Main {
     public static void main(String args[]){
        
        Scanner scn = new Scanner(System.in);

            float num1;
            float num2;

            System.out.println("Introduzca el valor del sueldo bruto mensual del trabajador:");
                num1 = scn.nextFloat();
                if (num1 <= 0){
                    System.out.println("Error");
                }

            System.out.println("Introduzca el número de pagas anuales del trabajador:");
                num2 = scn.nextFloat();
                if (num2 <= 0 && num2 > 12){
                    System.out.println("Error");
                }

            float a = num1 * num2;
            float b = num1;
            float c = (num1 - (num1 * 15 / 100)) * 12;
            float d = c / num2;

            System.out.println("El sueeldio bruto del trabajador es: "+a+", mientras que el sueldo bruto mensual es de:" +b+". Aparte, el sueldo anual neto es: "+c+", y el sueldo mensual neto es de: "+d);



    }
}

