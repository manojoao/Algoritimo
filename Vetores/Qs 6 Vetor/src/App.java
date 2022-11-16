import javax.swing.JOptionPane;
public class App {
   
        public static void main(String[] args) throws Exception {

            double num[] = new double[20];
            String mostrar="", mostrar2="";
    
            for(int a=0; a < 20; a++){
    
                num[a] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o " + (a + 1) + "º número?"));
            
            }    
    
            for(int b = 19; b >=0; b--){
    
                mostrar += num[b] + " | ";
    
            }
    
            for(int c = 0; c < 20; c++){
    
                mostrar2 += num[c] + " | ";
    
            }
    
            JOptionPane.showMessageDialog(null, "Os números na ordem de entrada: " + mostrar2 + "\nOs números na ordem inversa: " + mostrar);
        }
    }
    