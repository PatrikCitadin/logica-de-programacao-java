package lista1;

import javax.swing.JOptionPane;

public class Exercicio10 {

    public static void main(String[] args) {

        int nInteiro = 0;
        int nAntecessor = 0;
        int nSucessor = 0;

        nInteiro = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero inteiro"));
        nAntecessor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero antecessor"));
        nSucessor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero sucessor"));
        if ((nAntecessor == nSucessor - 1) && (nSucessor == nInteiro + 1)) {
            JOptionPane.showMessageDialog(null, "Voc� informou os n�meros corretamente!");
        } else {
            JOptionPane.showMessageDialog(null, "Voc� informou os n�meros errados!");
        }

    }

}
