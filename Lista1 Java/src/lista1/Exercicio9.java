package lista1;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio9 {

    public static void main(String[] args) {

        double valorCompra = 0;
        double valorParcela = 0;
        int quantasVezes = 0;

        DecimalFormat df = new DecimalFormat("0.00");

        valorCompra = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor total de sua compra!"));
        quantasVezes = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas vezes ele deseja parcelar!"));

        valorParcela = valorCompra / quantasVezes;

        JOptionPane.showMessageDialog(null, "O valor da sua parcela �:" + df.format(valorParcela));

    }

}
