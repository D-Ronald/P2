package Capítulo;

import Personagem.Personagem;
import Personagem.Personagem;

public class Capitulo {
    String nome;
    String Texto;
    String[] escolhas;
    Personagem personagem;
    int alteracaoEnergia;

    public Capitulo(String nome, String texto,String[] escolhas, Personagem personagem,
            int alteracaoEnergia) {
        this.nome = nome;
        Texto = texto;
        this.escolhas = escolhas;
        this.personagem = personagem;
        this.alteracaoEnergia = alteracaoEnergia;
    }

    public void mostrar() {
        for (int i = 0; i < escolhas.length; i++) {
            System.out.println(i + " - " + escolhas[i]);
        }
    }

    public int escolha(String escolha) {
        for (int i = 0; i < escolhas.length; i++) {
            if (escolhas[i].equals(escolha)) {
                return i;
            }
        }
        return -1;
    }
}