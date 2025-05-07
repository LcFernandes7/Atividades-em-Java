package Classes;

import CalculoGeral.Calculos;

public abstract class Operacao {
    protected String nome;
    protected Calculos calculos = new Calculos();

    public abstract void executar();

    public void setNome(String nomeUsuario) {
        this.nome = nomeUsuario;

    }

}
