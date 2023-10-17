//Precio Producto App
package ejercicio;

import javax.swing.JOptionPane;

public class Ejercicio9 {
    public static void main(String[]args){
        final double IVA=0.21;
        
        String texto=JOptionPane.showInputDialog("Introduce el precio del producto");
        
        double precio=Double.parseDouble(texto);
        
        double precioFinal=precio+(precio+IVA);
        
        System.out.println("El total es: "+precioFinal);   
    }   
}
