
package calcular.salario;

import java.util.Scanner;


public class CalcularSalario {

    public static void main(String[] args) {
        String nombre = "Pedro";
        int salario = 0;
        int diasTrabajados = 0;
        int division = 0;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("SEÑOR USUARIO POR FAVOR DIGITE SU SALARIO:");
        salario=teclado.nextInt();
        System.out.println("SEÑOR USUARIO POR FAVOR DIGITE SUS DIAS TRABAJADOS:");
        diasTrabajados=teclado.nextInt();
       
        division=salario/diasTrabajados;
        System.out.println("Su nombre es: "+ nombre + " Su salario es: " + salario + " Sus dias trabajados son: " + diasTrabajados + " Su salario mensual es : " +division);
    }
    
}
