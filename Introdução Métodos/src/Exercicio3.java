import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exercicio3 {

    public static void main(String[] args) { // metodo sem retorno
        DecimalFormat df = new DecimalFormat("###.00");
        double compra = solicitaCompra();
        double desconto = calculaDesconto(compra);

        JOptionPane.showMessageDialog(null, "Valor total da compra: " + df.format(desconto));

    }

    public static double solicitaCompra() { // metodo com retorno

        double compra = 0;
        compra = Double
                .parseDouble(JOptionPane.showInputDialog("Insira o valor da compra para saber se tem desconto:"));
        while (compra < 0) {
            mostraErroValor();
            compra = Double
                    .parseDouble(JOptionPane.showInputDialog("Insira o valor da compra para saber se tem desconto:"));
        }
        return compra;
    }

    public static double calculaDesconto(double valor) {

        double compra = valor;
        if (valor <= 100) {
            compra = valor;
        } else if (valor >= 100.01 && valor <= 200) {
            valor = 20 * valor / 100;
            compra -= valor;
        } else if (valor > 200) {
            valor = 30 * valor / 100;
            compra -= valor;
        }
        return compra;
    }

    public static void mostraErroValor() {
        JOptionPane.showMessageDialog(null, "Insira um valor positivo", "Erro!", JOptionPane.WARNING_MESSAGE);
    }

}
