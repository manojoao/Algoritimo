
package atp2;
import javax.swing.JOptionPane;

public class Atp2 {

   
    public static void main(String[] args) {
        
       String n1, n2, res;
         n1= JOptionPane.showInputDialog(null, "Digite um Número Positivo:");
         
         n2= JOptionPane.showInputDialog(null, "Digite um Número Positivo:");
         
         res = n1 + n2;
         
         JOptionPane.showMessageDialog(null, "O valor dessa soma é: " +res);
 
    }
    
}
