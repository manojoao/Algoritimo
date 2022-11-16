import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        double contador, num = 0, fah = 0, kel = 0;
        String mostrar = "";

        for (contador = 0; contador < 101; contador++) {

            num = contador;
            fah = (num * 1.8) + 32;
            kel = num + 273.15;

            mostrar = mostrar + num + " | " + fah + " | " + kel + "\n";

            JOptionPane.showMessageDialog(null, "Celsius  |  Fahrenheit  |  Kelvin " + " \n\n " + mostrar);
        }

    }
}
