//Codigo ASCII App
package ejercicio;

import javax.swing.JOptionPane;

public class Ejercicio7 {
  public static void main(String[] args){
      String texto=JOptionPane.showInputDialog("Introduce un codigo ASCII");
      int codigo=Integer.parseInt(texto);
      char caracter=(char)codigo;
      System.out.println("La letra es la: "+caracter);
  }  
}
