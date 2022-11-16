import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int contador, mil = 1;

        JOptionPane.showMessageDialog(null, "1");

        for (contador = 0; contador < 65; contador++) {
            mil = mil * 2;

            JOptionPane.showMessageDialog(null, mil);

        }
    }
}
