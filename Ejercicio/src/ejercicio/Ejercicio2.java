//Numero Mayor App
package ejercicio;

public class Ejercicio2 {
    public static void main(String[] args) {
 
        int numero1=30;
        int numero2=30;
 
        if (numero1>=numero2){
            
            if(numero1==numero2){
                System.out.println("Los numeros "+numero1+" y "+numero2+" son iguales");
            }else{
                System.out.println("El número "+numero1+" es mayor que el número "+numero2);
            }
        }else{
            System.out.println("El número "+numero2+" es mayor que el número "+numero1);
        }
    }
}
