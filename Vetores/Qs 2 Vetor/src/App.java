import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int num[] = new int[20];
        String mostrar = "";

        for (int a = 0; a < 20; a++) {

            num[a] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + (a + 1) + "º número?"));

        }

        for (int b = 19; b >= 0; b--) {

            mostrar += num[b] + " ";

        }

        JOptionPane.showMessageDialog(null, mostrar);
    }
}