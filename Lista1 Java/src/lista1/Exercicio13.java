package lista1;

import javax.swing.JOptionPane;

public class Exercicio13 {
    // ex 02 lista 02

    public static void main(String[] args) {

        double macasCompradas;
        double custoTotal;

        macasCompradas = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o n�mero de ma�as compradas!"));
        if (macasCompradas < 12) {
            custoTotal = (1.30 * macasCompradas);
            JOptionPane.showMessageDialog(null, "Custo de ma�as compradas:" + custoTotal);
        } else if (macasCompradas >= 12) {
            custoTotal = (1.00 * macasCompradas);
            JOptionPane.showMessageDialog(null, "Custo de ma�as compradas:" + custoTotal);

        }

    }

}
