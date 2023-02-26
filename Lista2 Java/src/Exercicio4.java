import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio4 {

    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("0.00");
        double lataokg = 0;
        double cobre = 0;
        double zinco = 0;
        do {
            lataokg = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade de lat�o!"));
        } while (lataokg <= 0);
        cobre = lataokg * 0.7;
        zinco = lataokg * 0.3;
        JOptionPane.showMessageDialog(null, "A quantidade de cobre necessaria � " + formato.format(cobre)
                + "Kg \n A quantidade de zinco necessaria � " + formato.format(zinco) + "kg");

    }

}
