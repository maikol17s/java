//Ejercicio_basicos_DDR_18
package ejercicio;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
      
        Scanner sn = new Scanner(System.in);
        
        sn.useDelimiter("\n");
         
        System.out.println("Escribe una frase");
        String frase=sn.next();
         
        
        String palabras[] = frase.split(" ");
         
        for (String palabra : palabras) {
            System.out.println(palabra);
        }   
    }   
}

