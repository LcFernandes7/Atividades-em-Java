import Classes.MediaAritimetica;
import Classes.NumeroInvertido;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        MediaAritimetica media = new MediaAritimetica();
        NumeroInvertido nun = new NumeroInvertido();

        int numeroDaOpcao;


        while (true) {
            String opcao = JOptionPane.showInputDialog(
                    "1-) Media aritimética\n" +
                            "2-) Inverção de número\n" +
                            "3-) Leitor de número negativo ou positivo\n" +
                            "4-) Pulverização\n"
            );



            if (opcao.matches("\\d+")) {
                numeroDaOpcao = Integer.parseInt(opcao);

                switch (numeroDaOpcao){
                    case 1:
                        media.formula();
                        break;

                    case 2:
                        nun.invercao();
                        break;

                    case 3:

                        break;

                    case 4:
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida. Escolha uma opção entre 0 e 4.");
                        break;

                }
            }
        }
//        media.formula();

    }
}