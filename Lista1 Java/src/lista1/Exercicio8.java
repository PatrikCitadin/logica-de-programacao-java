package lista1;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio8 {

    public static void main(String[] args) {
        double[][] matriz = new double[6][4]; // MATRIZ VARIAVEL REAL
        double[] somaMeses = new double[6]; // VETOR
        double soma = 0;
        double somaFinal = 0;

        DecimalFormat df = new DecimalFormat("0.00");
        for (int l = 0; l < 6; l++) { // PARA // para linha de 0 at� 06 passo 1 faca , l++ acrescentando um n�mero a
                                      // mais
            for (int c = 0; c < 4; c++) { // para coluna de 0 at� 10 passo 1 faca , l++ acrescentando um n�mero a mais
                matriz[l][c] = Double.parseDouble(JOptionPane
                        .showInputDialog("Quanto foi vendido na semana" + (c + 1) + "� do m�s" + (l + 1) + "�:R$"));
                soma = soma + (matriz[l][c]); // VAI REALIZAR A SOMA DAS VENDAS DE TODAS AS SEMANAS DE CADA M�S NA
                                              // MATRIZ.
            }
            somaMeses[l] = soma; // REALIZANDO A SOMA DE TODOS OS MESES
            somaFinal = somaFinal + soma; // REALIZANDO A SOMA FINAL DE TODOS OS MESES
            soma = 0;
        }
        for (int l = 0; l < 6; l++) { // PARA
            JOptionPane.showMessageDialog(null, "Total de vendas do" + (l + 1) + "�m�s!" + somaMeses[l]);

        }
        JOptionPane.showMessageDialog(null, "Total de vendas do semestre!" + df.format(somaFinal));

    }
}
