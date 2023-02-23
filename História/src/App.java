import java.util.Scanner;

import Capítulo.Capitulo;
import Personagem.Personagem;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    Personagem Steve = new Personagem(" Steve ", 100);
    Capitulo cap1 = new Capitulo("Capítulo 1", "Você acorda em uma floresta e não sabe como chegou lá. Você se levanta e vê uma casa ao longe. O que você faz?", new String[]{"Ir para a casa", "Continuar andando"}, Steve, 10, sc);
    cap1.mostrar();
    sc.close();
/*main*/}
/*App*/}