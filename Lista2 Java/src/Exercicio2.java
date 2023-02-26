import javax.swing.JOptionPane;

public class Exercicio2 {

    public static void main(String[] args) {
        double media = 0;
        String conceito = "";
        double[] notas = new double[4];

        for (int i = 0; i < 4; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a " + (i + 1) + " nota"));
            media += notas[i];
        }
        media = media / 4;
        System.out.println(media);
        if (media >= 9) {
            conceito = "A";
        } else if ((media >= 8) && (media < 9)) {
            conceito = "B";
        } else if ((media > 7) && (media < 8)) {
            conceito = "C";
        } else if (media < 7) {
            conceito = "D";
        }

        JOptionPane.showMessageDialog(null, "Sua media: " + media + "\n Conceito: " + conceito);

    }
}
