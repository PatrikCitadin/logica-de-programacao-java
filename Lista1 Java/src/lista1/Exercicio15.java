package lista1;

import javax.swing.JOptionPane;

public class Exercicio15 {
    // EX 05 LISTA 05

    public static void main(String[] args) {

        int soma = 0;
        int primeiroNumero = 0;
        int segundoNumero = 0;
        int resposta = 0;

        primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog(null, "Voc� precisa digitar o primeiro n�mero!"));
        segundoNumero = Integer.parseInt(JOptionPane.showInputDialog(null, "Voc� precisa digitar o segundo n�mero!"));
        soma = (primeiroNumero + segundoNumero);
        resposta = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual seria a soma desses dois n�meros!"));
        while (resposta != soma) {
            resposta = Integer.parseInt(JOptionPane.showInputDialog(null, "Tente novamente!"));
        }
        if (resposta == soma) {
            JOptionPane.showMessageDialog(null, "Parab�ns resultado correto!");

        }

    }

}
