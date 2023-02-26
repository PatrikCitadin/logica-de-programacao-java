package lista1;

import javax.swing.JOptionPane;

public class Exercicio14 {
    // EX 05 lista 04

    public static void main(String[] args) {

        int pessoa = 0;
        int idade = 0;

        for (int i = 0; i < 12; i++) {
            idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade da " + (1 + i) + "� pessoa"));
            if (idade >= 18) {
                pessoa = pessoa + 1;
            }

        }
        JOptionPane.showMessageDialog(null, "Quantidade de pessoas com 18 anos ou mais �" + pessoa);
    }
}
