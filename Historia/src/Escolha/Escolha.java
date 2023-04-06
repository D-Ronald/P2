package Escolha;

import Capítulo.Capitulo;

public class Escolha {
  private String texto;
  private Capitulo Proximo;

  /**
   * Constroi um objeto do tipo Escolha
   * @param texto
   * @param proximo
   */
  public Escolha(String texto, Capitulo proximo) {
    this.texto = texto;
    Proximo = proximo;
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
    this.texto = texto;
  }

  /**
   * @return
   */
  public Capitulo getProximo() {
    return Proximo;
  }

  /**
   * @param proximo
   */
  public void setProximo(Capitulo proximo) {
    Proximo = proximo;
  }

}
