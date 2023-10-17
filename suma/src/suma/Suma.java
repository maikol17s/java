
package suma;

import java.util.Scanner;



public class Suma {

    
        public static void main(String[] args) {
       
        //Definimos variables.
       
        int numero1=0;
        int numero2=0;
        int numero3=0;
        int suma=0;
        int resta=0;
        int multiplicar=0;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("SEÑOR USUARIO POR FAVOR DIGITE EL PRIMER NUMERO:");
        numero1=teclado.nextInt();
        System.out.println("SEÑOR USUARIO POR FAVOR DIGITE EL SEGUNDO NUMERO:");
        numero2=teclado.nextInt();
       
        suma=numero1+numero2+numero3;
        System.out.println("LA SUMA DE LOS DOS NUMEROS ES:" + suma);
        
        resta=numero1-numero2-numero3;
        System.out.println("LA SUMA DE LOS DOS NUMEROS ES:" + resta);
        
        multiplicar=numero1*numero2*numero3;
        System.out.println("LA SUMA DE LOS DOS NUMEROS ES:" + multiplicar);
    }
        
}
