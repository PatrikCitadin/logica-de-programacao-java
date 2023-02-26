package lista1;

import javax.swing.JOptionPane;

public class Exercicio3 {

    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 0; // VARIAVEL INTEIRO
        int n3 = 0;
        JOptionPane.showMessageDialog(null, "Informe 03 n�meros diferentes!"); // APENAS ESCREVENDO A MSG
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro n�mero:")); // LENDO A MSG
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo n�mero:"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro n�mero:"));

        // 17 Se n1 "1" for menor que n2 E n1 for menor que n3 (ent�o o primeiro n�mero
        // vai ser menor)

        if ((n1 < n2) && (n1 < n3)) { // SE
            JOptionPane.showMessageDialog(null, "O primeiro n�mero � menor!");
            // 20 SE N�O SE o n2 for menor que o n3 E n2 menor que n1 , (o primeiro n�mero �
            // menor)
        } else if ((n2 < n3) && (n2 < n1)) {
            JOptionPane.showMessageDialog(null, "O segundo n�mero � o menor!");
            // 22 SE N�O SE o n3 for menor que o n1 E n2 menor que n1 (O terceiro n�mero � o
            // menor)
        } else if ((n3 < n1) && (n3 < n1)) {
            JOptionPane.showMessageDialog(null, "O terceiro n�mero � o menor!");
        }
        // 26 SE n1 for igual a n2 OU n2 = n1 OU n3 = n1 ( vou estar informando n�meros
        // iguais)
        if ((n1 == n2) || (n2 == n1) || (n3 == n1)) { // SE
            JOptionPane.showMessageDialog(null, "Voc� informou n�meros iguais!");
        }
    }

}
