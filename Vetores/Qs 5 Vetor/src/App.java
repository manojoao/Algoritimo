import javax.swing.JOptionPane;
public class App {
                public static void main(String[] args) throws Exception {
                    double num[] = new double [10];
                    String mostrar="";
            
                    for ( int a = 0; a < 10; a++){
            
                        num[a] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o " + (a + 1) + "º número?"));
            
                        if(num[a] % 2 != 0){
            
                            num[a] = num[a] * 1.05;
            
                            mostrar += num[a] + " ";
            
                        }
            
                            else{
            
                                num[a] = num[a] * 1.02;
            
                                mostrar += num[a] + " ";
            
                            }
            
            
                    }
            
                    JOptionPane.showMessageDialog(null, mostrar);
            
                }
            
            }
            