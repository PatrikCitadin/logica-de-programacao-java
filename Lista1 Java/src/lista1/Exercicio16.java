package lista1;

import javax.swing.JOptionPane;

public class Exercicio16 {
    // LISTA 05 EX 06
    public static void main(String[] args) {

        int idade = 0;
        int qtdPessoas = 0;
        int qtdMulheres = 0;
        double salario = 0;
        double mediaSalario = 0;
        double mediaIdade = 0;
        String genero = "";
        String opcao = "";
        double salarioSoma = 0;
        double somaIdade = 0;

        do {
            qtdPessoas = qtdPessoas + 1;
            idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua idade!"));
            somaIdade = somaIdade + idade;
            salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o seu salario!"));
            salarioSoma = salario + salarioSoma;
            genero = JOptionPane.showInputDialog(null, "Digite o seu sexo!");
            if (genero.equals("feminino") && (salario <= 1000)) {
                qtdMulheres = qtdMulheres + 1;
            }

            opcao = JOptionPane.showInputDialog("Teria mais algu�m para digitar? s para sim n para n�o");
        } while ((opcao.equals("S")) || (opcao.equals("s")));
        mediaSalario = (salarioSoma / qtdPessoas);
        mediaIdade = (somaIdade / qtdPessoas);
        JOptionPane.showMessageDialog(null, "M�dia de salario das pessoas �!R$" + mediaSalario);
        JOptionPane.showMessageDialog(null, "M�dia de idade das pessoas �!" + mediaIdade);
        JOptionPane.showMessageDialog(null, "A quantidade de mulheres �!" + qtdMulheres);

    }
}
