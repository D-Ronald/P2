package Leitor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

import Capítulo.Capitulo;
import Escolha.Escolha;
import Personagem.Personagem;

public class Leitor {

  /**
   * Faz a leitura dos dados contidos no arquivo de personagens
   * @param caminhoArquivoPersonagens
   */
  public HashMap<String, Personagem> lerPersonagens(String caminhoArquivoPersonagens) {
    HashMap<String, Personagem> personagens = new HashMap<String, Personagem>();
    File arquivoPersonagens = new File(caminhoArquivoPersonagens);

    try {
      Scanner escaneadorPersonagem = new Scanner(arquivoPersonagens, "UTF-8");
      String linhaEscaneada = "";
      String nomePersonagem = "";
      int energiaPersonagem = 0;

      while (escaneadorPersonagem.hasNextLine()) {

        while (!linhaEscaneada.equals("PERSONAGEM")) {

          linhaEscaneada = escaneadorPersonagem.nextLine();
        }
        linhaEscaneada = escaneadorPersonagem.nextLine();
        nomePersonagem = escaneadorPersonagem.nextLine();
        linhaEscaneada = escaneadorPersonagem.nextLine();
        energiaPersonagem = Integer.parseInt(escaneadorPersonagem.nextLine());
        personagens.put(nomePersonagem, new Personagem(nomePersonagem, energiaPersonagem));

      }
    } catch (FileNotFoundException exception) {
      exception.printStackTrace();
    }
    return personagens;

  }

  /**
   * Faz a leitura dos dados contidos no arquivo de capitulos
   * @param caminhoArquivoCapitulos
   * @param personagens
   * @param scanConsole
   * @return
   */
  public HashMap<String, Capitulo> lerCapitulos(String caminhoArquivoCapitulos,
      HashMap<String, Personagem> personagens, Scanner scanConsole) {

    HashMap<String, Capitulo> capitulos = new HashMap<String, Capitulo>();
    File arquivoCapitulos = new File(caminhoArquivoCapitulos);

    try {
      Scanner escaneadorCapitulos = new Scanner(arquivoCapitulos, "UTF-8");
      String linhaEscaneada = "";
      String nomeCapitulo = "";
      String textoCapitulo = "";
      String personagemCapitulo = "";
      int alteracaoEnergia = -1;

      while (escaneadorCapitulos.hasNextLine()) {
        while (!linhaEscaneada.equals("CAPITULO") || !linhaEscaneada.equals("ESCOLHA")) {
          linhaEscaneada = escaneadorCapitulos.nextLine();
        }
        if (linhaEscaneada.equals("CAPITULO")) {
          linhaEscaneada = escaneadorCapitulos.nextLine();// NOME
          nomeCapitulo = escaneadorCapitulos.nextLine();
          linhaEscaneada = escaneadorCapitulos.nextLine();// TEXTO
          textoCapitulo = escaneadorCapitulos.nextLine();
          linhaEscaneada = escaneadorCapitulos.nextLine();// PERSONAGEM
          personagemCapitulo = escaneadorCapitulos.nextLine();
          linhaEscaneada = escaneadorCapitulos.nextLine();// ALTERACAO_ENERGIA
          alteracaoEnergia = Integer.parseInt(escaneadorCapitulos.nextLine());
          capitulos.put(nomeCapitulo, new Capitulo(nomeCapitulo,
              textoCapitulo,
              personagens.get(personagemCapitulo),
              alteracaoEnergia,
              scanConsole));
        } else if (linhaEscaneada.equals("ESCOLHA")) {
          linhaEscaneada = escaneadorCapitulos.nextLine();// CAPITULO_SAIDA
          String capituloSaida = escaneadorCapitulos.nextLine();
          linhaEscaneada = escaneadorCapitulos.nextLine();// TEXTO
          String textoEscolha = escaneadorCapitulos.nextLine();
          linhaEscaneada = escaneadorCapitulos.nextLine();// CAPITULO_POSTERIOR
          String capituloPosterior = escaneadorCapitulos.nextLine();

          capitulos.get(nomeCapitulo).escolhas
              .add(new Escolha(textoEscolha, capitulos.get(capituloPosterior)));
        }
      }

    } catch (FileNotFoundException exception) {
      exception.printStackTrace();
    }
    return capitulos;
  }

}
