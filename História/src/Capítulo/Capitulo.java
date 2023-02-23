package Capítulo;

import Personagem.Personagem;
import Personagem.Personagem;
import java.util.Scanner;

public class Capitulo {
    private String nome;
    private String Texto;
    private String[] escolhas;
    private Personagem personagem;
    private int alteracaoEnergia;
    private int escolhido;
    private Scanner entrada = new Scanner(System.in);

    public Capitulo(String nome, String texto, String[] escolhas, Personagem personagem,
            int alteracaoEnergia, Scanner entrada) {
        setNome(nome);
        setTexto(texto);
        setEscolhas(escolhas);
        setPersonagem(personagem);
        setAlteracaoEnergia(alteracaoEnergia);
        setEntrada(entrada);
    }

    public void mostrar() {
        System.out.println(Texto);
        if (getEscolhas().length == 0) {
            System.out.println("Não há escolhas");
        } else {
            System.out.println("Escolha uma opção: ");
            for (int i = 0; i < escolhas.length; i++) {
                System.out.println(i + 1 + " - " + escolhas[i]);
            }
            int escolha = escolha();
            if (escolha == -1) {
                System.out.println("Opção inválida");
            }
            if (escolha == 0) {
                personagem.setEnergia(personagem.getEnergia()-getAlteracaoEnergia());
            }
            System.out.println("Energia: " + personagem.getEnergia());
        }
    }

    public int escolha() {
        String escolha = entrada.nextLine();
        for (int i = 0; i <getEscolhas().length; i++) {
            if (getEscolhas()[i].equals(escolha)) {
                setEscolhido(i);
                return i;
            }
        }
        return -1;

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

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public int getAlteracaoEnergia() {
        return alteracaoEnergia;
    }

    public void setAlteracaoEnergia(int alteracaoEnergia) {
        this.alteracaoEnergia = alteracaoEnergia;
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