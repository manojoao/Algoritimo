import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        int numeros[] = new int[31];
        int contador = 1, res;
        String mostrar = " ";

        for (int a = 2; a < 31; a++) {
            contador++;

            res = contador * contador;

            numeros[a] = res;

            mostrar = mostrar + numeros[a] + " ";

        }

        JOptionPane.showMessageDialog(null, "0 1" + mostrar);
    }
}