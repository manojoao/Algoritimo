import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int n;

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número."));

        if (ehPrimo(n)) {

            JOptionPane.showMessageDialog(null, n + " é primo.");

        } else {

            JOptionPane.showMessageDialog(null, n + " não é primo.");
        }
    }

    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }

}
