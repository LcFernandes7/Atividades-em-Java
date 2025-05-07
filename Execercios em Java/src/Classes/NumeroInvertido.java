package Classes;

import javax.swing.*;

public class NumeroInvertido extends Operacao {
    StringBuilder numeroBuilder;
    String numeroInvertido;
    StringBuilder builder = new StringBuilder();

    @Override
    public void executar() {
        while (true) {
            String numero = JOptionPane.showInputDialog("Bem vindo " + nome + " digite apenas 3 números: ");

            if (numero != null && numero.matches("\\d{3}")) {
                numeroBuilder = builder.append(numero);
                numeroInvertido = numeroBuilder.reverse().toString();
                JOptionPane.showMessageDialog(null, "O número digitado pelo usuário " + numero + ", invertido ficaria: " + numeroInvertido);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Digite apenas números inteiros.");
            }
        }
    }
}
