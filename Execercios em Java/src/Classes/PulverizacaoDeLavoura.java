package Classes;

import javax.swing.*;
import java.awt.color.ICC_ColorSpace;

public class PulverizacaoDeLavoura extends Operacao {
    String opcao;
    int intAcre, opcaoInt;
    double valorDoDescontoDe5 = 0, valorDoDescontoDe10 = 0, valorComDescontoDe5 = 0, valorFinal = 0;

    @Override
    public void executar() {
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
                double valor = calculos.calcularValorPorUnidade(intAcre, 50.0);

                if (intAcre >= 1000) {
                    valorDoDescontoDe5 = calculos.aplicarDesconto(valor, 5);
                }

                valorComDescontoDe5 = valor - valorDoDescontoDe5;

//              VALIDAÇÃO DOS 10%
                if (valorComDescontoDe5 >= 750.00) {
                    valorDoDescontoDe10 = calculos.aplicarDesconto(valorComDescontoDe5, 10);
                }

                valorFinal = valorComDescontoDe5 - valorDoDescontoDe10;
                JOptionPane.showMessageDialog(null, nome + ", o valor final para a pulverização da sua lavoura ficou em R$: " + valorFinal + "."+
                        "\n- Pacote Ervas Daninhas;");
                break;

            case 2:
                valor = calculos.calcularValorPorUnidade(intAcre, 100.0);
                if (intAcre >= 1000) {
                    valorDoDescontoDe5 = calculos.aplicarDesconto(valor, 5.0);
                }

                valorComDescontoDe5 = valor - valorDoDescontoDe5;

//              VALIDAÇÃO DOS 10%
                if (valorComDescontoDe5 >= 750.00) {
                    valorDoDescontoDe10 = calculos.aplicarDesconto(valorComDescontoDe5, 10.0);
                }
                valorFinal = valorComDescontoDe5 - valorDoDescontoDe10;
                JOptionPane.showMessageDialog(null, nome + ", o valor final para a pulverização da sua lavoura ficou em R$: " + valorFinal + "." +
                        "\n- Pacote Gafanhotos.");
                break;


            case 3:
                valor = calculos.calcularValorPorUnidade(intAcre, 150.0);
                if (intAcre >= 1000) {
                    valorDoDescontoDe5 = calculos.aplicarDesconto(valor, 5.0);
                }
                valorComDescontoDe5 = valor - valorDoDescontoDe5;

//              VALIDAÇÃO DOS 10%
                if (valorComDescontoDe5 >= 750.00) {
                    valorDoDescontoDe10 = calculos.aplicarDesconto(valorComDescontoDe5, 10.0);
                }
                valorFinal = valorComDescontoDe5 - valorDoDescontoDe10;
                JOptionPane.showMessageDialog(null, nome + ", o valor final para a pulverização da sua lavoura ficou em R$: " + valorFinal + "." +
                        "\n- Pacote Broca.");
                break;


            case 4:
                valor = calculos.calcularValorPorUnidade(intAcre, 250.0);
                if (intAcre >= 1000) {
                    valorDoDescontoDe5 = calculos.aplicarDesconto(valor, 5.0);
                }
                valorComDescontoDe5 = valorAcreMultiplicado250 - valorDoDescontoDe5;

//              VALIDAÇÃO DOS 10%
                if (valorComDescontoDe5 >= 750.00) {
                    valorDoDescontoDe10 = calculos.aplicarDesconto(valorComDescontoDe5, 10.0);
                }
                valorFinal = valorComDescontoDe5 - valorDoDescontoDe10;
                JOptionPane.showMessageDialog(null, nome + ", o valor final para a pulverização da sua lavoura ficou em R$: " + valorFinal + "." +
                        "\n- Pacote Exterminador do futuro.");
                break;

        }


    }
}
