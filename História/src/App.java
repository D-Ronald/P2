import java.util.Scanner;
import Capítulo.Capitulo;
import Personagem.Personagem;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Personagem Steve = new Personagem("Steve", 100);

        Capitulo cap1 = new Capitulo("Capítulo 1",
                Steve.nome
                        + "acorda em uma floresta e não sabe como chegou lá. Você se levanta e vê uma casa ao longe. O que "
                        + Steve.nome + " deve fazer?",
                new String[] { "Ir para a casa", "Continuar andando" },
                Steve, 50, 50, sc);

        Capitulo cap2 = new Capitulo("Capítulo 2",
                Steve.nome + " pisa num prego enferrujado ao subir as escadas da casa.\n" + Steve.nome + " perde "
                        + cap1.alteracaoEnergia1
                        + " pontos de energia.\n Com muito esforço ele consegue subir, Ao chegar na casa, " + Steve.nome
                        + " vê uma porta aberta. O que " + Steve.nome + " deve fazer?",
                new String[] { "Entrar na casa", "Continuar andando" }, Steve, 50, 50, sc);

        Capitulo cap3 = new Capitulo("Capítulo 3",
                Steve.nome + " Continua andando pela floresta e qunado derrepente cai numa ribanceira quebra a perna.\n"
                        + Steve.nome + " perde " + cap1.alteracaoEnergia2 + " pontos de energia"
                        + Steve.nome + " continua andando e encontra uma caverna. O que " + Steve.nome + " deve fazer?",
                new String[] { "Entrar na caverna", "Continuar andando" }, Steve, 50, 50, sc);

        Capitulo cap4 = new Capitulo("Capítulo 4", String.format(
                Steve.nome + " entra na casa e é pego de surpresa com um golpe certeiro de faca em seu pescoço.\n"
                        + Steve.nome + " perdeu " + cap2.alteracaoEnergia1 + " pontos de energia",
                Steve.nome, Steve.nome, cap2.alteracaoEnergia1), Steve);

        Capitulo cap5 = new Capitulo("Capítulo 5",
                "Ao descer as escadas " + Steve.nome + " cai.\n" + Steve.nome + "perdeu " + cap2.alteracaoEnergia2
                        + " pontos de energia ",
                Steve);

        Capitulo cap6 = new Capitulo("Capítulo 6",
                Steve.nome + " entra na caverna e é surpreendido por um urso que o ataca.\n" + Steve.nome + " perdeu "
                        + cap3.alteracaoEnergia1 + " pontos de energia",
                Steve);

        Capitulo cap7 = new Capitulo("Capítulo 7",
                Steve.nome + " continua andando e é atingitdo por uma bala que saiu de um rifle de um caçador.\n"
                        + Steve.nome + " perdeu " + cap3.alteracaoEnergia2 + " pontos de energia",
                Steve);

        cap1.proximoEscolha1 = cap2;
        cap1.proximoEscolha2 = cap3;
        cap2.proximoEscolha1 = cap4;
        cap2.proximoEscolha2 = cap5;
        cap3.proximoEscolha1 = cap6;
        cap3.proximoEscolha2 = cap7;
        cap1.mostrar();
        sc.close();
        /* main */}
    /* App */}
