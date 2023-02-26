package lista1;

import javax.swing.JOptionPane;

public class Exercicio2 {

    public static void main(String[] args) {

        int estadoPais = 0; // INTEIRO
        int idade = 0; // INTEIRO

        estadoPais = Integer.parseInt(JOptionPane.showInputDialog("Digite a maioridade civil do seu estado/pa�s:"));
        // REALIZANDO UM LEIA VARIAVEL ESTADO PA�S

        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade!"));
        if (estadoPais > idade) { // REALIZANDO UM SE
            JOptionPane.showMessageDialog(null, "Ele � menor de idade!");
        } else { // REALIZANDO UM SENAO
            JOptionPane.showMessageDialog(null, "Ele � maior de idade!"); // DIGITANDO APENAS A MSG
            // showInputDialog= Ler
            // showMessageDialog = escrever
        }

    }

}
