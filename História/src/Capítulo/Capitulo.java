package Capítulo;

import Personagem.Personagem;
import Personagem.Personagem;
import java.util.Scanner;

public class Capitulo {
    String nome;
    String Texto;
    String[] escolhas;
    Personagem personagem;
    int alteracaoEnergia;
    public int escolhido;
    Scanner entrada= new Scanner(System.in);

    public Capitulo(String nome, String texto,String[] escolhas, Personagem personagem,
            int alteracaoEnergia, Scanner entrada) {
        this.nome = nome;
        Texto = texto;
        this.escolhas = escolhas;
        this.personagem = personagem;
        this.alteracaoEnergia = alteracaoEnergia;
        this.entrada = entrada;
    }

    public void mostrar() {
        System.out.println(Texto);
        if (escolhas.length == 0) {
            System.out.println("Não há escolhas");
        }
        else{
            System.out.println("Escolha uma opção: ");
        for (int i = 0; i < escolhas.length; i++) {
            System.out.println(i+1 + " - " + escolhas[i]);
        }
        int escolha= escolha();
        if(escolha == -1){
            System.out.println("Opção inválida");
        }
        if (escolha == 0) {
            personagem.energia -= alteracaoEnergia;
        }
        System.out.println("Energia: " + personagem.energia);
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
    
}