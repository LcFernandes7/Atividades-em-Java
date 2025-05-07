import Classes.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        MediaAritimetica media = new MediaAritimetica();
        NumeroInvertido nun = new NumeroInvertido();
        NumeroPositivoOuNegativo positiNegativo = new NumeroPositivoOuNegativo();
        PulverizacaoDeLavoura lavoura = new PulverizacaoDeLavoura();

        int numeroDaOpcao;


        while (true) {
            String opcao = JOptionPane.showInputDialog(
                    "1-) Media aritimética\n" +
                            "2-) Inverção de número\n" +
                            "3-) Leitor de número negativo ou positivo\n" +
                            "4-) Pulverização\n" +
                            "5-) Posto de Gasolina\n" +
                            "6-) Sair"
            );


            if (opcao.matches("\\d+")) {
                numeroDaOpcao = Integer.parseInt(opcao);

                Operacao operacao = null;

                switch (numeroDaOpcao) {
                    case 1:
                        operacao = new MediaAritimetica();
                        break;

                    case 2:
                        operacao = new NumeroInvertido();
                        break;

                    case 3:
                        positiNegativo.valiacaoNumero();
                        break;

                    case 4:
                        lavoura.tipoDePulverizacao();
                        break;

                    case 5:
                        break;

                    case 6:
                        System.exit(0);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida. Escolha uma opção entre 0 e 6.");
                        break;

                }

                if (opcao != null) {
                    operacao.executar();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Digite uma opção válida!");
            }
        }
    }
}