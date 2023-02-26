package lista1;

import javax.swing.JOptionPane;

public class Exercicio12 {

    public static void main(String[] args) {

        double hTrabalhadas = 0;
        double valorPh = 0;
        double salarioFuncionario = 0;
        double salarioTotal = 0;
        double qtdHrextra = 0;
        double salarioExtra = 0;

        hTrabalhadas = Double
                .parseDouble(JOptionPane.showInputDialog(null, "Digite o n�mero de horas trabalhadas em um m�s!"));
        valorPh = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor normal pago por hora!"));
        if (hTrabalhadas <= 160) {
            salarioFuncionario = hTrabalhadas * valorPh;
            salarioTotal = salarioFuncionario;

        } else if (hTrabalhadas > 160) {
            salarioFuncionario = valorPh * 160;
            qtdHrextra = hTrabalhadas - 160;
            salarioExtra = qtdHrextra * valorPh * 1.5;
            salarioTotal = salarioFuncionario + salarioExtra;

        }
        JOptionPane.showMessageDialog(null, "Valor do s�lario �:" + salarioTotal);

    }

}
