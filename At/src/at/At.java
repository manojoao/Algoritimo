
package at;
import javax.swing.JOptionPane;

public class At {

   
    public static void main(String[] args) {
        int n1, n2, res;
         n1= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um Número Positivo:"));
         
         n2= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um Número Positivo:"));
         
         res = n1+n2;
         
         JOptionPane.showMessageDialog(null, "O valor dessa soma é: "+res);
         
    }
    
}
