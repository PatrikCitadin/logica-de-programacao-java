import javax.swing.JOptionPane;

public class Exercicio3 {

    public static void main(String[] args) {

        int numero = 0;
        int menu = 0;
        int numero02 = 0;
        String msg = "";

        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero inteiro!"));
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "|-------------------------------------------------------------------------------------------|\n"
                            + "| Op��o 1 - Verificar se o n�mero � m�ltiplo de algum outro n�mero!|\n"
                            + "| Op��o 2 - Verifique se o n�mero � par!|\n"
                            + "| Op��o 3 - Verificar se o n�mero est� entre 0 e 1000|\n"
                            + "| Op��o 4 - Sair              |\n"
                            + "|------------------------------------------------------------------------------------|\n"));

            switch (menu) {
                case 1:
                    numero02 = Integer.parseInt(JOptionPane.showInputDialog("Informe um novo n�mero!"));

                    if ((numero % numero02) == 0) {

                        msg = "Ele � multiplo";
                        JOptionPane.showMessageDialog(null, msg);
                    } else {
                        msg = "Ele n�o � multiplo";
                        JOptionPane.showMessageDialog(null, msg);

                    }
                    break;
                case 2:
                    if (numero % 2 == 0) {
                        msg = "Sim, ele � par.";
                        JOptionPane.showMessageDialog(null, msg);
                    }
                    break;

                case 3:
                    if ((numero >= 0) && (numero < 1000)) {
                        msg = "O n�mero " + numero + " se encontra entre 0 e 1000";
                        JOptionPane.showMessageDialog(null, msg);
                        break;
                    }
                case 4:
                    System.exit(4);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
                    break;
            }
        } while (menu != (4));
    }
}
