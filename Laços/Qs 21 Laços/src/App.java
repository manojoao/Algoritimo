import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String letras[] = new String[100];
        int contAB = 0, consa = 0, excla = 0, cont = 0, consa2 = 0;
        String parar = "";
        do {
            cont++;
            letras[cont] = JOptionPane.showInputDialog(null, "Digite uma letra de cada vez.");

            if (letras[cont].equals("a") || letras[cont].equals("z")) {
                contAB++;

            }
            if (letras[cont].equals("!")) {
                excla++;
            }

            if (letras[cont].equals("a") || letras[cont].equals("e") || letras[cont].equals("i")
                    || letras[cont].equals("o") || letras[cont].equals("u")) {
                consa2++;
            }

            parar = JOptionPane.showInputDialog(null, "Deseja parar?(s/n)");

        } while (parar.equals("n") || parar.equals("nao"));

        consa = cont - consa2;

        JOptionPane.showMessageDialog(null, letras[4]);

        JOptionPane.showMessageDialog(null, "As letras A ou Z apareceram = " + contAB
                + "\n Foram apresentadas " + cont + " caracteres"
                + "\n Entraram " + consa + " consoantes"
                + "\n Quantidades de exclamação " + excla);
    }
}
