import javax.swing.JOptionPane;

public class Exercicio2 {

    public static void main(String[] args) {
        double[] nota = new double[3];
        for (int i = 0; i < 3; i++) {
            nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (i + 1) + "� nota do aluno"));
            while (nota[i] < 0 || nota[i] > 10) {
                erroNota();
                nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (i + 1) + "� nota do aluno"));
            }
        }

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a m�dia que deseja calcular"
                + "\n 1 - M�dia aritm�tica" + "\n 2 - M�dia aritm�tica ponderada"));

        switch (opcao) {
            // M�dia aritmetica
            case 1:
                double mediaAritmetica = mediaAritmetica(nota);
                resultadoFinal(mediaAritmetica);
                break;
            // realizando um for para solicitar os pesos das notas
            case 2:
                double[] peso = new double[3];
                for (int i = 0; i < 3; i++) {
                    peso[i] = Double.parseDouble(JOptionPane.showInputDialog("Qual o peso da " + (i + 1) + "� prova."));
                }

                double mediaPonderada = mediaPonderada(nota, peso);
                resultadoFinal(mediaPonderada);
        }
    }

    public static double mediaAritmetica(double nota[]) {
        double media = 0;
        for (int i = 0; i < 3; i++) {
            media += nota[i];
        }
        media = media / 3;
        return media;
    }

    public static double mediaPonderada(double nota[], double peso[]) {
        double media = 0;
        double somaPeso = 0;
        for (int i = 0; i < 3; i++) {
            media += peso[i] * nota[i];
            somaPeso += peso[i];
        }
        media = media / somaPeso;
        return media;
    }

    public static void resultadoFinal(double media) {
        if (media >= 7) {
            JOptionPane.showMessageDialog(null, "Aluno aprovado!");
        } else
            JOptionPane.showMessageDialog(null, "Aluno reprovado!");
    }

    public static void erroNota() {
        JOptionPane.showMessageDialog(null, "Informe a nota entre 0 e 10!", "Erro!", JOptionPane.WARNING_MESSAGE);
    }
}
