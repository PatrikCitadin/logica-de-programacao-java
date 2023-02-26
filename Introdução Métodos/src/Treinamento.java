import javax.swing.JOptionPane;

public class Treinamento {

    // O m�todo main() � o m�todo que ser� executado primeiro em sua aplica��o.

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int peso = Integer.parseInt(JOptionPane.showInputDialog("Informe seu peso")); // ATRIBUINDO V�RIAVEL VALORES

        while (peso <= 0) { // ENQUANTO.
            mostraErroPeso(); // MOSTRA MSG DE ERRO CASO O VALOR FOR INVALIDO
            peso = Integer.parseInt(JOptionPane.showInputDialog("Informe seu peso")); // VALIDANDO SE O PESO � MENOR QUE
                                                                                      // 0
        }
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));

        while (altura <= 0) {
            mostraErroAltura(); // MOSTRA MSG DE ERRO CASO O VALOR FOR INVALIDO
            altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
        }

        double imc = calculaIndice(peso, altura); // Atribuindo valores a v�riaveis.
        verificaIndice(imc); // Verificando indice do IMC

    }

    public static double calculaIndice(int peso, double altura) {
        double imc = peso / (altura * altura); // Calculando v�riaveis peso / altura
        return imc; // Retorno
    }

    public static void verificaIndice(double imc) { // Void = Sem retorno.
        if (imc < 17) {
            JOptionPane.showMessageDialog(null, "Voc� est� muito abaixo do peso! �ndice: " + imc);
        } else if (imc == 17 || imc <= 18.49) {
            JOptionPane.showMessageDialog(null, "Voc� est� abaixo do peso! �ndice: " + imc);
        } else if (imc <= 24.99) {
            JOptionPane.showMessageDialog(null, "Voc� est� com o peso adequado! �ndice: " + imc);
        } else if (imc <= 29.99) {
            JOptionPane.showMessageDialog(null, "Voc� est� acima do peso! �ndice: " + imc);
        } else if (imc <= 34.99) {
            JOptionPane.showMessageDialog(null, "Voc� est� com obesidade tipo I! �ndice: " + imc);
        } else if (imc <= 39.99) {
            JOptionPane.showMessageDialog(null, "Voc� est� com obesidade tipo II! �ndice: " + imc);
        } else if (imc >= 40) {
            JOptionPane.showMessageDialog(null, "Voc� est� com obesidade tipo III ! �ndice: " + imc);
        }
    }

    public static void mostraErroPeso() { // MOSTRA MSG DE ERRO CASO O VALOR FOR INVALIDO
        JOptionPane.showMessageDialog(null, "O peso digitado � inv�lido!");
    }

    public static void mostraErroAltura() { // MOSTRA MSG DE ERRO CASO O VALOR FOR INVALIDO
        JOptionPane.showMessageDialog(null, "A altura digitada � inv�lida!");
    }
}

// calculaIndice()
// Cont�m 02 par�metros, de tipos diferentes, e possui retorno
// verificaIndice()
// Cont�m 01 par�metro e n�o possui retorno
// mostraErroPeso()
// Sem par�metro e n�o possui retorno
// mostraErroAltura()
// Sem par�metro e n�o possui retorno
// main()
// Cont�m 01 par�metro e n�o possui retorno
