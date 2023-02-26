package lista1;

import javax.swing.JOptionPane;

public class Exercicio7 {

    public static void main(String[] args) {
        int valor = 0; // INTEIRO
        boolean validadora = false; // LOGICO
        int posicao = 0; // INTEIRO
        int n1 = 0; // INTEIRO

        int[] solucao = new int[10]; // VETOR COM 10 POSI��O
        for (int i = 0; i < 10; i++) { // REALIZANDO UM PARA ( se o i for menor do que 10 vai contar mais 1)
            n1 = n1 + 10; // posi��o n1 est� sendo atribuida a posi��o n1 +10
            solucao[i] = n1; //
        }

        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor inteiro!"));
        for (int i = 0; i < 10; i++) { // PARA

            if (valor == solucao[i]) { // VALOR = SOLUCAO
                posicao = i; // POSICAO <- I
                validadora = true; // VALIDADORA <- VERDADEIRO
            }
        }
        if (validadora == true) { // SE VALIDADORA = VERDADEIRO
            JOptionPane.showMessageDialog(null, "Foi encontrado na posi��o: " + posicao);
        } else {
            JOptionPane.showMessageDialog(null, "N�o foi encontrado!");
        }

    }

}
