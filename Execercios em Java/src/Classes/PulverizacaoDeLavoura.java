package Classes;

import javax.swing.*;
import java.awt.color.ICC_ColorSpace;

public class PulverizacaoDeLavoura {
    String nome, opcao;
    int intAcre, opcaoInt;
    double valorDoDescontoDe5, valorDoDescontoDe10, valorComDescontoDe5, valorFinal;

    public void tipoDePulverizacao() {

        while (true) {
            nome = JOptionPane.showInputDialog("Digite seu nome: ");
            if (nome.matches("[a-zA-Z\\s]+")) break;
            JOptionPane.showMessageDialog(null, "Digite um nome válido!");
        }

        while (true) {
            opcao = JOptionPane.showInputDialog("Bem vindo " + nome + "!\n" + "Escolha qual pacote você gostaria: \n\n" +
                    "1-) Ervas daninhas R$50,00 por acre\n" +
                    "2-) Gafanhotos R$100,00 por acre\n" +
                    "3-) Broca R$ 150,00 por acre\n" +
                    "4-) Exterminador do Futuro R$250,00 por acre\n");
            opcaoInt = Integer.parseInt(opcao);
            if (opcao != null && opcao.matches("[1-4]")) break;
            JOptionPane.showMessageDialog(null, "Digite uma opção valida!");
        }

        while (true) {
            String acre = JOptionPane.showInputDialog("Digite número em acres que deseja fazer a pulverização: ");
            if (acre != null && acre.matches("\\d+")) {
                intAcre = Integer.parseInt(acre);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Digite um número válido!");
            }
        }


//        MULTIPLICAÇÃO DO ACRE POR VALOR COBRADO
        double valorAcreMultiplicado50 = intAcre * 50.00;
        double valorAcreMultiplicado100 = intAcre * 100.00;
        double valorAcreMultiplicado150 = intAcre * 150.00;
        double valorAcreMultiplicado250 = intAcre * 250.00;


        switch (opcaoInt) {
            case 1:
//              VALIDAÇÃO DO DESCONTO DE 5%
                if (intAcre >= 1000) {
                    valorDoDescontoDe5 = valorAcreMultiplicado50 * 5.00 / 100;
                }
                valorComDescontoDe5 = valorAcreMultiplicado50 - valorDoDescontoDe5;

//              VALIDAÇÃO DOS 10%
                if (valorComDescontoDe5 >= 750.00) {
                    valorDoDescontoDe10 = valorComDescontoDe5 * 10.00 / 100;
                }
                valorFinal = valorComDescontoDe5 - valorDoDescontoDe10;
                JOptionPane.showMessageDialog(null, nome + ", o valor final para a pulverização da sua lavoura ficou em R$: " + valorFinal + "."+
                        "\n- Pacote Ervas Daninhas;");
                break;

            case 2:
                if (intAcre >= 1000) {
                    valorDoDescontoDe5 = valorAcreMultiplicado100 * 5.00 / 100;
                }
                valorComDescontoDe5 = valorAcreMultiplicado100 - valorDoDescontoDe5;

//              VALIDAÇÃO DOS 10%
                if (valorComDescontoDe5 >= 750.00) {
                    valorDoDescontoDe10 = valorComDescontoDe5 * 10.00 / 100;
                }
                valorFinal = valorComDescontoDe5 - valorDoDescontoDe10;
                JOptionPane.showMessageDialog(null, nome + ", o valor final para a pulverização da sua lavoura ficou em R$: " + valorFinal + "." +
                        "\n- Pacote Gafanhotos.");
                break;


            case 3:
                if (intAcre >= 1000) {
                    valorDoDescontoDe5 = valorAcreMultiplicado150 * 5.00 / 100;
                }
                valorComDescontoDe5 = valorAcreMultiplicado150 - valorDoDescontoDe5;

//              VALIDAÇÃO DOS 10%
                if (valorComDescontoDe5 >= 750.00) {
                    valorDoDescontoDe10 = valorComDescontoDe5 * 10.00 / 100;
                }
                valorFinal = valorComDescontoDe5 - valorDoDescontoDe10;
                JOptionPane.showMessageDialog(null, nome + ", o valor final para a pulverização da sua lavoura ficou em R$: " + valorFinal + "." +
                        "\n- Pacote Broca.");
                break;


            case 4:
                if (intAcre >= 1000) {
                    valorDoDescontoDe5 = valorAcreMultiplicado250 * 5.00 / 100;
                }
                valorComDescontoDe5 = valorAcreMultiplicado250 - valorDoDescontoDe5;

//              VALIDAÇÃO DOS 10%
                if (valorComDescontoDe5 >= 750.00) {
                    valorDoDescontoDe10 = valorComDescontoDe5 * 10.00 / 100;
                }
                valorFinal = valorComDescontoDe5 - valorDoDescontoDe10;
                JOptionPane.showMessageDialog(null, nome + ", o valor final para a pulverização da sua lavoura ficou em R$: " + valorFinal + "." +
                        "\n- Pacote Exterminador do futuro.");
                break;

        }


    }
}
