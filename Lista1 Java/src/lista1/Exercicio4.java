package lista1;

import javax.swing.JOptionPane;

public class Exercicio4 {

    public static void main(String[] args) {

        int numero = 0;
        int somaPar = 0;
        int contarPar = 0; // VARIAVEL INTEIRO
        int somaImpar = 0;
        int contarImpar = 0;

        for (int i = 0; i < 10; i++) { // REALIZANDO UM PARA COM VARIAVEL INT
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero:" + (i + 1)));
            if (numero % 2 == 0) { // REALIZANDO UM SE
                contarPar = contarPar + 1; // REALIZANDO A CONTAGEM DOS N�MEROS PARES
                somaPar = somaPar + numero; // SOMA TOTAL DOS N�MEROS PARES
            } else {
                contarImpar = contarImpar + 1; // REALIZANDO A CONTAGEM DOS N�MEROS IMPARES
                somaImpar = numero + somaImpar; // SOMA TOTAL DOS N�MEROS IMPARES
            }
        }

        if (contarImpar == 0) { // SE
            JOptionPane.showMessageDialog(null, "N�o foram informados n�meros impares:");
            JOptionPane.showMessageDialog(null, "A quantidade de n�meros pares �:" + contarPar);
            JOptionPane.showMessageDialog(null, "A soma dos n�meros Pares �:" + somaPar);
        } else { // SENAO

            JOptionPane.showMessageDialog(null, "A quantidade de n�meros pares �:" + contarPar);
            JOptionPane.showMessageDialog(null, "A soma dos n�meros pares �:" + somaPar);
            JOptionPane.showMessageDialog(null, "A quantidade de n�meros �mpares �:" + contarImpar);
            JOptionPane.showMessageDialog(null, "A soma dos n�meros �mpares �:" + somaImpar);

        }

    }

}
