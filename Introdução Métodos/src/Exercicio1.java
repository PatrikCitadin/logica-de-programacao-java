import javax.swing.JOptionPane;

public class Exercicio1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int nascimento = solicitaAnoNascimento(); // RECEBENDO METODO SOLICITANASCIMENTO
        recebeAnoNascimento(nascimento);
    }

    public static int solicitaAnoNascimento() { // REALIZANDO METODO SOLICITA NASCIMENTO
        int nascimento = Integer.parseInt(JOptionPane.showInputDialog("Qual seu ano de nascimento?"));
        return nascimento; // RETORNANDO
    }

    public static void recebeAnoNascimento(int nascimento) {
        int calculoIdade = (2021 - nascimento); // CALCULO PARA SABER A IDADE
        JOptionPane.showMessageDialog(null, "A sua idade atual �!" + calculoIdade);
    }

}
