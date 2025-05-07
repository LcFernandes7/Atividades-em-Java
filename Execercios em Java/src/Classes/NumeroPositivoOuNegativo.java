package Classes;

import javax.swing.*;

public class NumeroPositivoOuNegativo extends Operacao {
    int numInt;

    @Override
    public void executar() {
        while (true) {
            String num = JOptionPane.showInputDialog("Bem vindo " + nome + " digite um número inteiro: ");

            if (num != null && num.matches("-?\\d+")) {
                numInt = Integer.parseInt(num);
                if (numInt >= 0) {
                    JOptionPane.showMessageDialog(null, "O número digitado é positivo!");
                } else {
                    JOptionPane.showMessageDialog(null, "O número digitado é negativo!");
                }
                break;
            }
        }
    }
}
