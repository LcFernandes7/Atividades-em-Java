package Classes;

import javax.swing.*;

import static java.util.stream.DoubleStream.builder;

public class NumeroInvertido {
    StringBuilder numeroBuilder;
    String numeroInvertido;
    StringBuilder builder = new StringBuilder();

    public void invercao() {


        while (true) {
            String numero = JOptionPane.showInputDialog("Digite apenas 3 números");
            if (numero != null && numero.matches("\\d+")) {
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
