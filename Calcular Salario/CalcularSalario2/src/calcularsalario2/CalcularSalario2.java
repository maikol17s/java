
package calcularsalario2;

import javax.swing.JOptionPane;

public class CalcularSalario2 {
 
    public static void main(String[] args) {
        int salario=1160000;
        int dias_mes=31;
        int valor_dia=0;
        int sd=0;
        
        String nombre = JOptionPane.showInputDialog("Digite su nombre");
        int dias = Integer.parseInt(JOptionPane.showInputDialog("Digite los dias que ha trabajado"));
        valor_dia = salario/dias_mes;
        sd=valor_dia*dias;
        JOptionPane.showMessageDialog(null, "su salario mensual es: "+sd);
        JOptionPane.showMessageDialog(null, "su salario mensual es: "+valor_dia);
    }
    
}
