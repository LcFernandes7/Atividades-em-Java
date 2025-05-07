package CalculoGeral;

public class Calculos {

    public double media(double n1, double n2) {
        return (n1 + n2) / 2.0;
    }

    public double aplicarDesconto(double valor, double percentual){
        return  valor * percentual / 100;

    }

    public double calcularValorPorUnidade(int quantidade, double valorPorUnidade){
        return quantidade * valorPorUnidade;
    }

}