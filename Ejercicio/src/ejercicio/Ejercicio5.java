//Area Circulo App
package ejercicio;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un radio");
        sc.useLocale(Locale.US);
        double radio = sc.nextDouble();
        
        double area=Math.PI*Math.pow(radio,2);
        
        System.out.println("El area del circulo es " +area);
    }
}
