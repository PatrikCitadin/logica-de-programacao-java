import javax.swing.JOptionPane;

public class Exercicio1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int valores;
        int contar = 0;
        valores = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o tamanho do vetor"));
        int[] vetUsuario = new int[valores];
        for (int i = 0; i < valores; i++) {
            vetUsuario[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe os n�meros!"));
            if (vetUsuario[i] < 0)
                ;
            {
                contar = contar + 1;
                JOptionPane.showMessageDialog(null, "A quatidade de valores negativos �" + contar + ".");

            }
        }

    }

}
