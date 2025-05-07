package Classes;

import javax.swing.*;

public class MediaAritimetica extends Operacao {

    @Override
    public void executar() {
        double n1 = obterNota("Digite o valor da primeira prova:");
        double n2 = obterNota("Digite o valor da segunda prova:");

        // Usando o método da classe Calculos para calcular a média
        double media = calculos.media(n1, n2);
        JOptionPane.showMessageDialog(null, "Sua média foi: " + media);
    }

    // Método para obter a nota com validação
    private double obterNota(String mensagem) {
        double nota = 0;
        while (true) {
            String notaString = JOptionPane.showInputDialog(mensagem);
            if (notaString != null && notaString.matches("\\d+,\\d+")) {
                nota = Double.parseDouble(notaString.replace(",", "."));
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Digite um número válido!");
            }
        }
        return nota;
    }
}
