package Classes;

import javax.swing.*;

public class MediaAritimetica {


    public  void formula() {
        String nome;
        double n1 = 0, n2 = 0;

        while (true) {
            nome = JOptionPane.showInputDialog("Digite o seu nome:");
            if (nome.matches("[a-zA-Z\\s]+")) break;
            JOptionPane.showMessageDialog(null ,"Nome inválido. Digite apenas letras.");
        }

        while (true) {
            String n1String = JOptionPane.showInputDialog("Digite o valor da primeira prova:");
            if (n1String != null && n1String.matches("\\d+,\\d+")) {
                 n1 = Double.parseDouble(n1String.replace("," , "."));
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Digite um número valido!");
            }
        }

        while (true) {
            String n2String = JOptionPane.showInputDialog("Digite o valor da segunda prova:");
            if (n2String != null && n2String.matches("\\d+,\\d+")) {
                 n2 = Double.parseDouble(n2String.replace(",", "."));
                 break;
            }else {
                JOptionPane.showMessageDialog(null,"Digite um número valido!");
            }
        }

        double media = (n1 + n2) / 2.0;
        JOptionPane.showMessageDialog(null, nome + " sua média foi: " + media);
    }
}