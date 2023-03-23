package Capítulo;

import Personagem.Personagem;
import Personagem.Personagem;
import java.util.Scanner;

import Escolha.Escolha;

public class Capitulo {
    private String nome;
    private String Texto;
    private String[] escolhas;
    private Capitulo proximoEscolha1;
    private Capitulo proximoEscolha2;
    private Personagem personagem;
    private int alteracaoEnergia1;
    private int alteracaoEnergia2;
    private int escolhido;
    private Scanner entrada = new Scanner(System.in);

    public Capitulo(String nome, String texto,String[] escolhas, Personagem personagem,
            int alteracaoEnergia1, int alteracaoEnergia2, Scanner entrada) {
        setNome(nome);
        setTexto(texto);
        setPersonagem(personagem);
        setAlteracaoEnergia1(alteracaoEnergia1);
        setAlteracaoEnergia2(alteracaoEnergia2);
        setEntrada(entrada);
        setEscolhas(escolhas);
    }

    public Capitulo(String nome, String texto, Personagem personagem, int i, int j, Scanner sc) {
        setNome(nome);
        setTexto(texto);
        setPersonagem(personagem);
    }

    public Capitulo(String nome, String texto, Personagem personagem) {
        setNome(nome);
        setTexto(texto);
        setPersonagem(personagem);
    }

    public void comEscolhas() {
        mostrarEscolhas();
        int escolha = escolha();
        escolhaInvalida(escolha);
        if (escolha == 0) {
            personagem.setEnergia(personagem.getEnergia() - alteracaoEnergia1);

            proximoEscolha1.mostrar();
            if (semEnergia()) {
                morreu();
            }
        } else if (escolha == 1) {
            personagem.setEnergia(personagem.getEnergia() - alteracaoEnergia2);

            proximoEscolha2.mostrar();
            if (semEnergia()) {
                morreu();
            }
        }
    }

    public int escolha() {
        String escolha = entrada.nextLine();
        for (int i = 0; i < getEscolhas().length; i++) {
            if (escolhas[i].equals(escolha)) {
                setEscolhido(i);
                return i;
            }
        }
        return -1;

    }

    public void mostrarEscolhas() {
        System.out.println("Escolhas:");
        for (int i = 0; i < getEscolhas().length; i++) {
            System.out.println(getEscolhas()[i]);
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
        System.out.println("Energia: " + personagem.getEnergia());
    }

    public boolean semEnergia() {
        if (personagem.getEnergia() == 0) {
            return true;
        }
        return false;
    }

    public void morreu() {
        System.out.println(personagem.getNome() + "ficou sem energia");
        System.out.println("Fim");
        System.exit(0);
    }

    public void mostrar() {
        System.out.println("-----------" + getNome() + "-----------\n" + getTexto());

        if (getEscolhas() == null || getEscolhas().length == 0) {
            personagem.setEnergia(personagem.getEnergia() - 100);
            if (semEnergia()) {
                morreu();
            }
        } else {
            mostrarEnegia();
            comEscolhas();

        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String texto) {
        Texto = texto;
    }

    public String[] getEscolhas() {
        return escolhas;
    }

    public void setEscolhas(String[] escolhas) {
        this.escolhas = escolhas;
    }

    public Capitulo getProximoEscolha1() {
        return proximoEscolha1;
    }

    public void setProximoEscolha1(Capitulo proximoEscolha1) {
        this.proximoEscolha1 = proximoEscolha1;
    }

    public Capitulo getProximoEscolha2() {
        return proximoEscolha2;
    }

    public void setProximoEscolha2(Capitulo proximoEscolha2) {
        this.proximoEscolha2 = proximoEscolha2;
    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public int getAlteracaoEnergia1() {
        return alteracaoEnergia1;
    }

    public void setAlteracaoEnergia1(int alteracaoEnergia1) {
        if (alteracaoEnergia1 < 0) {
            alteracaoEnergia1 = 0;
        } else if (alteracaoEnergia1 > 100) {
            alteracaoEnergia1 = 100;
        } else {
            this.alteracaoEnergia1 = alteracaoEnergia1;
        }
    }

    public int getAlteracaoEnergia2() {
        return alteracaoEnergia2;
    }

    public void setAlteracaoEnergia2(int alteracaoEnergia2) {
        if (alteracaoEnergia2 < 0) {
            alteracaoEnergia2 = 0;
        } else if (alteracaoEnergia2 > 100) {
            alteracaoEnergia2 = 100;
        } else {
            this.alteracaoEnergia2 = alteracaoEnergia2;
        }
    }

    public int getEscolhido() {
        return escolhido;
    }

    public void setEscolhido(int escolhido) {
        this.escolhido = escolhido;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

}
