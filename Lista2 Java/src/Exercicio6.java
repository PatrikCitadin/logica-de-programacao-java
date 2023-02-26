
import javax.swing.JOptionPane;

public class Exercicio6 {

    public static void main(String[] args) {

        double[] vendas = new double[12];
        double maiorVenda = 0;
        double menorVenda = 0;
        double mediaVendasAno = 0;
        double mediaPares = 0;
        double media2Semestre = 0;
        int opcao = 0;
        double totalVendas = 0;
        double mesesPares = 0;

        for (int i = 0; i < 12; i++) {
            vendas[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor das vendas dos 12 meses?"));
            totalVendas += vendas[i];
            if (i % 2 == 0) {
                mesesPares += vendas[i];

            }

            if (vendas[i] > maiorVenda) {
                maiorVenda = vendas[i];
            }

            if (i == 0) {
                menorVenda = vendas[i];
            } else if (vendas[i] < menorVenda) {
                menorVenda = vendas[i];
            }
            mediaVendasAno += vendas[i];

            if (i % 2 == 0) {
                mediaPares += vendas[i];

                if (i > 5)
                    media2Semestre += vendas[i];

            }
        }
        media2Semestre = totalVendas / 12; // AJUSTAR MESES PARES
        mediaPares = mesesPares / 6; // AJUSTAR MESES PARES
        mediaVendasAno = totalVendas / 12; // OK
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "|-------------------------------------------------------------------------------------------|\n"
                            + "| Op��o 1 - O m�s com a maior venda:|\n" + "|"
                            + "| Op��o 2 - O m�s com a menor venda:|\n"
                            + "| Op��o 3 - A m�dia das vendas do ano todo:\n"
                            + "| Op��o 4 - A m�dia das vendas dos meses pares:|\n"
                            + "| Op��o 5 - A m�dia das vendas do 2� semestre:|\n" + "| Op��o 6 - Digite 6 para sair"
                            + "|------------------------------------------------------------------------------------|\n"));
            switch (opcao) {
                case 1:
                    JOptionPane.showMessageDialog(null, "O m�s com a maior venda � R$" + maiorVenda);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "O m�s com a menor venda � R$" + menorVenda);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "A m�dia das vendas do ano � R$" + mediaVendasAno);
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "A m�dia das vendas dos meses pares � R$" + mediaPares);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "� m�dia das vendas do 2� semestre � R$" + media2Semestre);

            }
        } while (opcao != 6);
    }
}
