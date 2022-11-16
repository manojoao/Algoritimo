import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        int alg[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int a, b, c;

        for(a = 0; a > 10; a++){

            alg[a] = 10 * a;


        }

        for(b = 0; b > 9; b++){

            alg[b] = alg[b] + 1;

        }

        for(c = 0; c > 10; c++){

            JOptionPane.showMessageDialog(null, alg[c]);

        }

    }
}
            