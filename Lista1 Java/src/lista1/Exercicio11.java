package lista1;

import javax.swing.JOptionPane;
// EX 03 LISTA 05

public class Exercicio11 {

    public static void main(String[] args) {

        int notaProva = 0;
        int qtdProva = 1;

        notaProva = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a nota que voc� tirou na prova!"));
        if (notaProva < 7) { // SE A NOTA DA PROVA FOR MENOR QUE 7 , VAI TER QUE REALIZAR A PROVA NOVAMENTE
                             // AT� ACERTAR A NOTA
            do {
                JOptionPane.showMessageDialog(null, "Voc� pode realizar a prova novamente!");
                notaProva = Integer
                        .parseInt(JOptionPane.showInputDialog(null, "Quanto voc� tirou na prova de recupera��o?"));
                qtdProva = qtdProva + 1; // CONTANDO QUANTAS PROVAS PRECISOU NA RECUPERA��O
            } while (notaProva > 10);
            JOptionPane.showMessageDialog(null, "Voc� foi aprovado!");
        } else {
            JOptionPane.showMessageDialog(null, "Voc� n�o precisou de recupera��o!");

        }

    }

}
