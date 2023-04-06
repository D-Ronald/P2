package Capítulo;

import Personagem.Personagem;
import Personagem.Personagem;
import java.util.ArrayList;
import java.util.Scanner;
import Escolha.Escolha;


public class Capitulo {
  private String nome;
  private String texto;
  public ArrayList<Escolha> escolhas;
  private Personagem personagem;
  private int alteracaoEnergia;
  private int escolhido;
  private Scanner entrada = new Scanner(System.in);

  /**
   * Constroi um objeto do tipo Capitulo
   * @param nome
   * @param texto
   * @param personagem
   * @param alteracaoEnergia
   * @param entrada
   * 
   */
  public Capitulo(String nome, String texto, Personagem personagem, int alteracaoEnergia, Scanner entrada) {
    this.nome = nome;
    this.texto = texto;
    this.personagem = personagem;
    this.alteracaoEnergia = alteracaoEnergia;
    this.entrada = entrada;
    this.escolhas = new ArrayList<Escolha>();
  }

  /**
   * @return
   * Verifica se o capitulo tem escolhas e retorna a posição da escolha
   */
  public int escolha() {
    String escolha = entrada.nextLine();
    for (int i = 0; i < escolhas.size(); i++) {
      if (escolha.equals(escolhas.get(i).getTexto())) {
        return i;
      }
    }
    return -1;

  }

  /**
   * Mostra as escolhas e pede a 
   */
  public void escolher() {
    mostrarEscolhas();
    int escolha = escolha();
    escolhaInvalida(escolha);
    this.escolhas.get(escolha).getProximo().mostrar();
    mudarEnergia();
  }

  /**
   * Mostra as escolhas do capitulo
   */
  public void mostrarEscolhas() {
    System.out.println("Escolhas:");
    for (int i = 0; i < escolhas.size(); i++) {
      System.out.println("-" + escolhas.get(i).getTexto());
    }
  }

  /**
   * Verifica se a escolha é valida
   * @param escolha
   */
  public void escolhaInvalida(int escolha) {
    if (escolha == -1) {
      System.out.println("Escolha inválida");
      escolher();
    }
  }

  /**
   * Mostra a energia do personagem
   */
  public void mostrarEnegia() {
    System.out.println("Energia: " + personagem.getEnergia());
  }

  /**
   * Verifica se o personagem está sem energia e retorna verdadeiro para personagem com energia 
   * menor ou igual a 0, e falso para personagem com energia maior que 0.
   * @return
   */
  public boolean semEnergia() {
    if (personagem.getEnergia() <= 0) {
      return true;
    }
    return false;
  }

  /**
   * Altera a energia do personagem
   */
  public void mudarEnergia() {
    personagem.setEnergia(personagem.getEnergia() - alteracaoEnergia);
    if (semEnergia()) {
      morreu();
    }
  }

  /**
   * Se o personagem morreu é mostrado uma mensagem e o jogo é encerrado
   */
  public void morreu() {
    System.out.println(personagem.getNome() + "ficou sem energia");
    System.out.println("Fim");
    System.exit(0);
  }

  /**
   * Mostra na tela o nome do capitulo, o texto e as escolhas.
   * Se o capitulo não tiver escolhas, a energia do personagem é diminuida em 100 e 
   * é verificado se o personagem morreu.
   */
  public void mostrar() {
    System.out.println("-----------" + this.nome + "-----------\n" + this.texto);

    if (this.getEscolhas() == null || getEscolhas().length == 0) {
      personagem.setEnergia(personagem.getEnergia() - 100);
      if (semEnergia()) {
        morreu();
      }
    } else {
      mostrarEnegia();
      escolher();
    }
  }

  /**
   * @return
   */
  public String getNome() {
    return nome;
  }

  /**
   * @param nome
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * @return
   */
  public String getTexto() {
    return texto;
  }

  /**
   * @param texto
   */
  public void setTexto(String texto) {
    texto = texto;

  }

  /**
   * @return
   */
  public Escolha[] getEscolhas() {
    return escolhas.toArray(new Escolha[escolhas.size()]);
  }

  /**
   * @param escolhas
   */
  public void setEscolhas(Escolha[] escolhas) {
    for (int i = 0; i < escolhas.length; i++) {
      this.escolhas.add(escolhas[i]);
    }
  }

  /**
   * @return
   */
  public Personagem getPersonagem() {
    return personagem;
  }

  /**
   * @param personagem2
   */
  public void setPersonagem(Personagem personagem2) {
    this.personagem = personagem2;
  }

  /**
   * @return
   */
  public int getAlteracaoEnergia() {
    return alteracaoEnergia;
  }

  /**
   * @param alteracaoEnergia
   */
  public void setAlteracaoEnergia(int alteracaoEnergia) {
    if (alteracaoEnergia < 0) {
      alteracaoEnergia = 0;
    } else if (alteracaoEnergia > 100) {
      alteracaoEnergia = 100;
    } else {
      this.alteracaoEnergia = alteracaoEnergia;
    }
  }

  /**
   * @return
   */
  public int getEscolhido() {
    return escolhido;
  }

  /**
   * @param escolhido
   */
  public void setEscolhido(int escolhido) {
    this.escolhido = escolhido;
  }

  /**
   * @return
   */
  public Scanner getEntrada() {
    return entrada;
  }

  /**
   * @param entrada
   */
  public void setEntrada(Scanner entrada) {
    this.entrada = entrada;
  }

}
