import java.util.Scanner;
import Capítulo.Capitulo;
import Personagem.Personagem;

public class App {
        public static void main(String[] args) throws Exception {
                Scanner sc = new Scanner(System.in);
                Personagem Steve = new Personagem("Steve", 100);

                Capitulo cap1 = new Capitulo("Capítulo 1",
                                Steve.getNome()
                                                + "acorda em uma floresta e não sabe como chegou lá. Você se levanta e vê uma casa ao longe. O que "
                                                + Steve.getNome() + " deve fazer?",
                                new String[] { "Ir para a casa", "Continuar andando" },
                                Steve, 50, 50, sc);

                Capitulo cap2 = new Capitulo("Capítulo 2",
                                Steve.getNome() + " pisa num prego enferrujado ao subir as escadas da casa.\n"
                                                + Steve.getNome() + " perde "
                                                + cap1.getAlteracaoEnergia1()
                                                + " pontos de energia.\n Com muito esforço ele consegue subir, Ao chegar na casa, "
                                                + Steve.getNome()
                                                + " vê uma porta aberta. O que " + Steve.getNome() + " deve fazer?",
                                new String[] { "Entrar na casa", "Continuar andando" }, Steve, 50, 50, sc);

                Capitulo cap3 = new Capitulo("Capítulo 3",
                                Steve.getNome() + " Continua andando pela floresta e qunado derrepente cai numa ribanceira quebra a perna.\n"
                                                + Steve.getNome() + " perde " + cap1.getAlteracaoEnergia2()
                                                + " pontos de energia"
                                                + Steve.getNome() + " continua andando e encontra uma caverna. O que "
                                                + Steve.getNome() + " deve fazer?",
                                new String[] { "Entrar na caverna", "Continuar andando" }, Steve, 50, 50, sc);

                Capitulo cap4 = new Capitulo("Capítulo 4",
                                Steve.getNome() + " entra na casa e é pego de surpresa com um golpe certeiro de faca em seu pescoço.\n"
                                                + Steve.getNome() + " perdeu " + cap2.getAlteracaoEnergia1()
                                                + " pontos de energia.",
                                Steve);

                Capitulo cap5 = new Capitulo("Capítulo 5",
                                "Ao descer as escadas " + Steve.getNome() + " cai.\n" + Steve.getNome() + "perdeu "
                                                + cap2.getAlteracaoEnergia2()
                                                + " pontos de energia ",
                                Steve);

                Capitulo cap6 = new Capitulo("Capítulo 6",
                                Steve.getNome() + " entra na caverna e é surpreendido por um urso que o ataca.\n"
                                                + Steve.getNome() + " perdeu "
                                                + cap3.getAlteracaoEnergia1() + " pontos de energia",
                                Steve);

                Capitulo cap7 = new Capitulo("Capítulo 7",
                                Steve.getNome() + " continua andando e é atingitdo por uma bala que saiu de um rifle de um caçador.\n"
                                                + Steve.getNome() + " perdeu " + cap3.getAlteracaoEnergia2()
                                                + " pontos de energia",
                                Steve);

                cap1.setProximoEscolha1(cap2);
                cap1.setProximoEscolha2(cap3);
                cap2.setProximoEscolha1(cap4);
                cap2.setProximoEscolha2(cap5);
                cap3.setProximoEscolha1(cap6);
                cap3.setProximoEscolha2(cap7);
                cap1.mostrar();
                sc.close();
                
                /* main */}
        /* App */}
