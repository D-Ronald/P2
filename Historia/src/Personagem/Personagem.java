package Personagem;

public class Personagem {
  private String nome;
  private int energia;

  /**
   * Constroi um objeto do tipo Personagem
   * @param nome
   * @param energia
   */
  public Personagem(String nome, int energia) {
    this.nome = nome;
    this.energia = energia;
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
  public int getEnergia() {
    return energia;
  }

  /**
   * @param energia
   */
  public void setEnergia(int energia) {
    if (energia > 100) {
      this.energia = 100;
    } else if (energia < 0) {
      this.energia = 0;
    } else {
      this.energia = energia;
    }
  }

}