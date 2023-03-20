package Capítulo;

import Personagem.Personagem;
import Personagem.Personagem;
import java.util.Scanner;

public class Capitulo {
    String nome;
    String Texto;
    String[] escolhas;
    public Capitulo proximoEscolha1;
    public Capitulo proximoEscolha2;
    Personagem personagem;
    public int alteracaoEnergia1;
    public int alteracaoEnergia2;
    public int escolhido;
    Scanner entrada = new Scanner(System.in);

    public Capitulo(String nome, String texto, String[] escolhas, Personagem personagem,
            int alteracaoEnergia1, int alteracaoEnergia2, Scanner entrada) {
        this.nome = nome;
        this.Texto = texto;
        this.escolhas = escolhas;
        this.personagem = personagem;
        this.alteracaoEnergia1 = alteracaoEnergia1;
        this.alteracaoEnergia2 = alteracaoEnergia2;
        this.entrada = entrada;
    }

    public Capitulo(String nome, String texto, Personagem personagem) {
        this.nome = nome;
        this.Texto = texto;
        this.personagem = personagem;
    }

    public Capitulo(String nome, String texto, Personagem personagem, int alteracaoEnergia) {
        this.nome = nome;
        this.Texto = texto;
        this.personagem = personagem;
    }

    public void comEscolhas() {
        mostrarEscolhas();
        int escolha = escolha();
        escolhaInvalida(escolha);
        if (escolha == 0) {
            personagem.energia -= alteracaoEnergia1;

            proximoEscolha1.mostrar();
            if (semEnergia()) {
                morreu();
            }
        } else if (escolha == 1) {
            personagem.energia -= alteracaoEnergia2;

            proximoEscolha2.mostrar();
            if (semEnergia()) {
                morreu();
            }
        }
    }

    public int escolha() {
        String escolha = entrada.nextLine();
        for (int i = 0; i < escolhas.length; i++) {
            if (escolhas[i].equals(escolha)) {
                this.escolhido = i;
                return i;
            }
        }
        return -1;

    }

    public void mostrarEscolhas() {
        System.out.println("Escolhas:");
        for (int i = 0; i < this.escolhas.length; i++) {
            System.out.println(this.escolhas[i]);
        }
        System.out.print("opção: ");
    }

    public void escolhaInvalida(int escolha) {
        if (escolha == -1) {
            System.out.println("Escolha inválida");
            mostrar();
            escolha = escolha();
            escolhaInvalida(escolha);
        }
    }

    public void mostrarEnegia() {
        System.out.println("Energia: " + personagem.energia);
    }

    public boolean semEnergia() {
        if (personagem.energia <= 0) {
            return true;
        }
        return false;
    }

    public void morreu() {
        System.out.println(personagem.nome + "ficou sem energia");
        System.out.println("Fim");
        System.exit(0);
    }

    public void mostrar() {
        System.out.println("-----------" + this.nome + "-----------\n" + this.Texto);

        if (this.escolhas == null || this.escolhas.length == 0) {
            personagem.energia -= 100;
            if (semEnergia()) {
                morreu();
            }
        } else {
            mostrarEnegia();
            comEscolhas();

        }

    }

}
