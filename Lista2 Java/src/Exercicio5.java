import javax.swing.JOptionPane;

public class Exercicio5 {

    public static void main(String[] args) {

        int mediaIdade = 0;
        int pessoaFumante = 0;
        int qtdeDeFumantes = 0;
        int qtdeDeNaoFumantes = 0;
        int pessoa = 0;
        int qtdeCadastros = 0;
        double salario = 0;
        double porcentagem = 0;
        String encerrar = "";
        do {

            mediaIdade += Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua idade?"));
            pessoaFumante = Integer
                    .parseInt(JOptionPane.showInputDialog(null, "Voc� � fumante? 1 - Fumante 2 - N�o fumante"));
            switch (pessoaFumante) {
                case 1:
                    qtdeDeFumantes += 1;
                    break;
                case 2:
                    qtdeDeNaoFumantes += 1;
                    break;
            }
            salario += Double.parseDouble(JOptionPane.showInputDialog(null, "Qual seu salario liquido?"));
            int tempoClube = Integer
                    .parseInt(JOptionPane.showInputDialog(null, "Quanto tempo voc� frequenta o clube?(em m�ses)"));
            if (tempoClube > 3) {
                pessoa += 1;

            }
            qtdeCadastros += 1;
            encerrar = JOptionPane.showInputDialog(null, "Voc� deseja encerrar?");
        } while (encerrar.equalsIgnoreCase("n�o"));

        mediaIdade /= qtdeCadastros;
        salario /= qtdeCadastros;
        porcentagem = ((pessoa / qtdeCadastros) * 100);
        JOptionPane.showMessageDialog(null, "A m�dia da idade das pessoas � " + mediaIdade);
        JOptionPane.showMessageDialog(null, "A m�dia salarial das pessoas � " + salario);
        JOptionPane.showMessageDialog(null, "Quantidade de fumantes � " + qtdeDeFumantes);
        JOptionPane.showMessageDialog(null, "Quantidade de n�o fumantes � " + qtdeDeNaoFumantes);
        JOptionPane.showMessageDialog(null,
                "Porcentagem de pessoas que frequentam o clube h� mais de 03 mesees �" + porcentagem + "%");
    }

}
