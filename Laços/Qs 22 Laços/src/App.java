import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        int salario=0,filho=0,maior=0,cont=0;
        int sal[] = new int[10];
        int fil[] = new int [10];
        String repeti= "";
        repeti = JOptionPane.showInputDialog(null, "Iniciar o relatório? (s/n)");
        while (repeti.equals("s")||repeti.equals("sim")){
                 
            for(int a=0;a<1;a++){
                sal[a] = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o salário?"));
                salario += sal[a];
                  
                if(sal[a]>maior){

                maior = sal[a];

                }
                
                 fil[a] = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos filhos tem?"));
                 filho += fil[a];
                
                }

                cont ++;
                repeti = JOptionPane.showInputDialog(null, "Deseja continuar? (s/n)");
                
                }





                JOptionPane.showMessageDialog(null, "A média salarial é R$" + (salario/cont) + ",00 por família." + "\nA média de filhos por familia é " + (filho/cont) + "." + "\nO maior salário é R$" + maior + ",00.");


        }

}
    