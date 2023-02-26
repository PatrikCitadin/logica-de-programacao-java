package lista1;

import javax.swing.JOptionPane;

public class Exercicio5 {

    public static void main(String[] args) {

        int inicioIntervalo = 0; // VARIAVEL INTEIRO
        int finalIntervalo = 0;
        double somaPares = 0; // VARIAVEL REAL
        inicioIntervalo = Integer.parseInt(JOptionPane.showInputDialog("Informe o �nicio do intervalo:")); // LEIA
        finalIntervalo = Integer.parseInt(JOptionPane.showInputDialog("Informe o final do intervalo")); // LEIA
        // i <- inicioIntervalo , i � menor = do que finalIntervalo i ++ esta
        // acrescentando o n�mero a mais
        for (int i = inicioIntervalo; i <= finalIntervalo; i++) { // SE O INICIO DO INTERVALO FOR MENOR OU IGUAL AO
                                                                  // FINAL DO INTERVALO
            // VAI ACRESCENTAR +1
            // I / 2 = 0
            if (i % 2 == 0) {
                //
                somaPares = (i + somaPares); // INICIO DO INTERVALO + SOMA DOS PARES

            }

        }
        JOptionPane.showMessageDialog(null, "A soma dos valores pares:" + somaPares); // MOSTRANDO A MSG

    }

}
