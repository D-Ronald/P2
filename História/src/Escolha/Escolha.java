package Escolha;

import Capítulo.Capitulo;

public class Escolha {

    private String texto;
    private Capitulo proximo;

    public Escolha(String texto, Capitulo proximo) {
        setTexto(texto);
        setProximo(proximo);
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Capitulo getProximo() {
        return proximo;
    }

    public void setProximo(Capitulo proximo) {
        this.proximo = proximo;
    }

}
