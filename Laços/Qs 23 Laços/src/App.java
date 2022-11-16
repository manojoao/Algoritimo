import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int candidato[] = new int[30];
        int cont = 0, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;
        String parar = "", numero = "";
        do {
            cont++;
            candidato[cont] = Integer
                    .parseInt(JOptionPane.showInputDialog(null, " Nota do " + cont + "º candidato \n De 0 a 100"));
            if ((candidato[cont] > 0) && (candidato[cont] <= 25)) {
                cont1++;
            } else if ((candidato[cont] >= 26) && (candidato[cont] <= 50)) {
                cont2++;
            } else if ((candidato[cont] >= 51) && (candidato[cont] <= 75)) {
                cont3++;
            } else if ((candidato[cont] >= 76) && (candidato[cont] <= 100)) {
                cont4++;
            } else {
                numero += candidato[cont] + " ";
            }

            parar = JOptionPane.showInputDialog(null, "Deseja encerrar? (s/n)");
        } while (parar.equals("n") || parar.equals("nao"));

        JOptionPane.showMessageDialog(null, "Candidatos que acertaram de 0 a 25 questões = " + cont1 +
                "\n Candidatos que acertaram de 26 a 50 questões = " + cont2 +
                "\n Candidatos que acertaram de 51 a 75 questões = " + cont3 +
                "\n Candidatos que acertaram de 76 a 100 questões = " + cont4 +
                "\n Valores nulos = " + numero);
    }
}
