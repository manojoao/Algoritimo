import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        int soma1[] = new int [20];
        int soma2[] = new int [20];
        int res[] = new int [20];
        String mostrar="", mostrar2 ="", mostrar3 ="";

        for ( int a = 0; a < 20; a++){

            soma1[a] = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o " + (a + 1) + "º número?"));

            mostrar += soma1[a] + " | ";
            
        }

        for ( int b = 0; b < 20; b++){

            soma2[b] = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o " + (b + 1) + "º número a ser somado?"));

            mostrar2 += soma2[b] + " | ";
            
        }

        for ( int c = 0; c < 20; c++){

            res[c] = soma1[c] + soma2[c];

            mostrar3 += res[c] + " | ";
            
        }

        JOptionPane.showMessageDialog(null, "Os primeiros números foram: " + mostrar + "\nOs segundos números inseridos foram: " + mostrar2 + "\nA soma desses números é: " + mostrar3);

    }
}
    