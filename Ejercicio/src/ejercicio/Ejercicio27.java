//Ejercicio 27 
package ejercicio;

import java.util.Scanner;

public class Ejercicio27 {
    
    public static void main(String[] args) {
        
       Scanner sn=new Scanner(System.in);
       int num=sn.nextInt();
        
       int contador=0;
        
       while(num!=-1){
            
           contador++;
            
           num=sn.nextInt(); //Pedimos de nuevo el número
            
       }
         
       System.out.println("Fin, se ha introducido "+contador+" numeros");
        
    }
     
}
