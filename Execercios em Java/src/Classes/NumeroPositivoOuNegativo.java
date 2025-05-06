package Classes;

import javax.swing.*;

public class NumeroPositivoOuNegativo {
    int numInt;

    public void valiacaoNumero(){

        while (true) {
            String num = JOptionPane.showInputDialog("Digite um número inteiro: ");
            if (num != null && num.matches("-?\\d+")){
                numInt = Integer.parseInt(num);
                if (numInt >= 0){
                    JOptionPane.showMessageDialog(null, "O número digitado é positivo!");
                }else {
                    JOptionPane.showMessageDialog(null, "O número digitado é negativo!");
                }
                break;
            }
        }
    }
}
