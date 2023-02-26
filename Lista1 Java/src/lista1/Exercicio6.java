package lista1;

import javax.swing.JOptionPane;

public class Exercicio6 {

    public static void main(String[] args) {

        double numero = 0; // REAL
        String simbolo = ""; // CARACTERE
        String opcao = ""; // CARACTERE
        double num = 0; // REAL
        boolean calculo = false; // LOGICO

        numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero!"));

        do { // REPITA
            simbolo = JOptionPane.showInputDialog(null, "Digite um operador b�sico" + "\n Adi��o:+" + "\n Subtra��o:-"
                    + "\n Multiplica��o:*" + "\n Divis�o:/" + "\n Qual a sua escolha?");
            // 19 REALIZANDO UMA VERIFICA��O EM SE " SE DIGITAR ALGUM OPERADOR B�SICO
            // CONFORME ABAIXO O CALCULO VAI SER VDD
            if ((simbolo.equals("+")) || (simbolo.equals("-")) || (simbolo.equals("*")) || (simbolo.equals("/"))) {
                calculo = true;
            } else { // SE N�O ESCOLHER NENHUM SIMBOLO A OP��O SER� INVALIDA
                JOptionPane.showMessageDialog(null, "Op��o invalida!");
                calculo = false;
            }

            if (calculo == true) { // VERIFICANDO SE CALCULO � VERDADEIRO
                num = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um n�mero!"));
            }
            switch (simbolo) { // ESCOLHA
                case "+": // CASO
                    numero = numero + num;
                    break; // FIMESCOLHA
                case "-":
                    numero = numero - num;
                    break;
                case "*":
                    numero = numero * num;
                    break;
                case "/":
                    if (num == 0) {
                        JOptionPane.showMessageDialog(null, "N�o � poss�vel dividir por zero!");
                    } else {
                        numero = numero / num;

                    }

            }

            opcao = JOptionPane.showInputDialog("Gostaria de continuar calculando? n=para sair!");

        } while (!opcao.equals("n")); // ENQUANTO
        JOptionPane.showMessageDialog(null, numero, "Resultado calculado", JOptionPane.INFORMATION_MESSAGE);

    }
}
