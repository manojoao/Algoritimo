import javax.swing.JOptionPane;
public class App {
    
        public static void main(String[] args) throws Exception {
            double num[] = new double [10];
            double num2[] = new double [10];
            double gap[] = new double [10];
            String mostrar="";
    
            for ( int a = 0; a < 10; a++){
    
                num[a] = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o " + (a + 1) + "º número?"));
                num2[a] = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o " + (a + 1) + "º número a ser comparado?"));
    
                if(num[a] == num2[a]){
    
                    gap[a] = 1;
    
                    mostrar += gap[a] + " | ";
    
                }
    
                    else{
    
                        gap[a] = 0;
    
                        mostrar += gap[a] + " | ";
    
                    }
    
    
            }
    
            JOptionPane.showMessageDialog(null, mostrar);
    
        }
    }