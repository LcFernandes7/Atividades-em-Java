package Classes;

import CalculoGeral.Calculos;

public abstract class Operacao {
    protected Calculos calculos = new Calculos();

    public abstract void executar();
}
