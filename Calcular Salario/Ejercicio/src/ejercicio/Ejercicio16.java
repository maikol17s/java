//Contraseña App
package ejercicio;

import javax.swing.JOptionPane;

public class Ejercicio16 {
    public static void main(String[] args){
        String contraseña="!Logrado¡";
        
        final int INTENTOS= 3;
        
        boolean acierto=false;
        
        String password;
        for (int i=0;i<3 && !acierto;i++){
            password=JOptionPane.showInputDialog("Introduce la contraseña");
            
            if (password.equals(contraseña)){
                System.out.println("Bien Hecho, acertaste");
                acierto=true;
            }
        }
    }
}
