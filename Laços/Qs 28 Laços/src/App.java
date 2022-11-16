import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        double n, i, k, fat, cte = 1;

        n = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Informe o número que deseja ser calculado a constante matemática."));

        for (i = 1; i <= n; i++) {

            fat = 1;

            for (k = 1; k <= i - 1; k++) {

                fat = fat + fat * k;

            }

            cte = cte + (1 / fat);

        }

        JOptionPane.showMessageDialog(null, "Resultado: " + cte);

    }
}
