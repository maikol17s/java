//Ejercicio_DiscoDurodeRoer_Basicos_15_Scanner 
package ejercicio;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[]args){
        int codigo;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Ingresa un numero mayor que 0");
            codigo=sc.nextInt();
        }while(codigo<=0);
        
        System.out.println("El codigo es: "+codigo);
    }
}
