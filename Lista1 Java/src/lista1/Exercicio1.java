package lista1;

import javax.swing.JOptionPane;

public class Exercicio1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        double horas = 0; // REAL
        double minutos = 0;
        double segundos = 0;
        double soma = 0;

        horas = Double.parseDouble(JOptionPane.showInputDialog("Digite uma quantidade de horas")); // REALIZANDO UM LEIA
        minutos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade em minutos"));
        segundos = Double.parseDouble(JOptionPane.showInputDialog("Digite uma quantidade de segundos"));
        soma = horas * 60 * 60 + minutos * 60 + segundos;
        JOptionPane.showMessageDialog(null, "Total de segundo �: " + soma);

    }
}
