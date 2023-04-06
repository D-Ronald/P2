import java.util.HashMap;
import java.util.Scanner;
import Capítulo.Capitulo;
import Escolha.Escolha;
import Leitor.Leitor;
import Personagem.Personagem;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    Leitor leitor = new Leitor();
    HashMap<String, Personagem> personagens = leitor.lerPersonagens(
        "Historia\\rsc\\Personagem.txt");

    Personagem steve = personagens.get("Steve");

    HashMap<String, Capitulo> capitulo = leitor.lerCapitulos(
      "Historia\\rsc\\Capitulo.txt", 
        personagens, sc);

    Capitulo cap1 = capitulo.get("Capitulo 1");

    Capitulo cap2 = capitulo.get("Capitulo 2");

    Capitulo cap3 = capitulo.get("Capitulo 3");

    Capitulo cap4 = capitulo.get("Capitulo 4");

    Capitulo cap5 = capitulo.get("Capitulo 5");

    Capitulo cap6 = capitulo.get("Capitulo 6");

    Capitulo cap7 = capitulo.get("Capitulo 7");

    cap1.escolhas.add(new Escolha("Ir para a casa", cap2));
    cap1.escolhas.add(new Escolha("Continuar andando", cap3));
    cap2.escolhas.add(new Escolha("Entrar na casa", cap4));
    cap2.escolhas.add(new Escolha("Continuar andando", cap5));
    cap3.escolhas.add(new Escolha("Entrar na caverna", cap6));
    cap3.escolhas.add(new Escolha("Continuar andando", cap7));
    Capitulo raiz = cap1;
    raiz.mostrar();
    sc.close();

    /* main */}
  /* App */}
