import java.util.Scanner;
import Personagem.Personagem;
public class App {public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
//construindo personagens
    Personagem frodo = new Personagem("Frodo","Hobbit","Ladino",100);
    Personagem gandalf = new Personagem("Gandalf","Anjo","Mago",100);
    Personagem dragao = new Personagem("Smaug","Dragão","Dragão",100);
//inicio da aventura
    System.out.println(frodo.nome+" e "+gandalf.nome+" estavam em uma aventura, quando de repente o "+gandalf.classe+ " caiu em um buraco e "+frodo.nome+" foi atrás dele.");
    System.out.println(frodo.nome+" encontrou "+gandalf.nome+" e o ajudou a sair do buraco.");
    System.out.println("Eles continuaram a aventura.");
    System.out.println("E se deparam com um "+dragao.classe+" chamado "+dragao.nome+'.');
    System.out.println("o que "+frodo.nome+" e "+gandalf.nome+" deverão fazer?");
    System.out.println("1 - Atacam o "+dragao.classe+".");
    System.out.println("2 - Fogem do "+dragao.classe+".");
    System.out.println("3 - conversam com o "+dragao.classe+".");
    int opcaoInicio = sc.nextInt();
//ramificação 1 - atacar
    if (opcaoInicio == 1){
        System.out.println("Qual o ataque de "+frodo.nome+" e "+gandalf.nome+"?");
        System.out.println("1 - " +frodo.nome + " ataca com sua espada e " + gandalf.nome+" lança uma bola de fogo");
        System.out.println("2 - "+frodo.nome+" ataca com sua espada e "+gandalf.nome+" lança uma bola de gelo");
        System.out.println("3 - " +frodo.nome+" tenta distrair o "+dragao.classe+" e "+gandalf.nome+" lança uma bola de fogo");
        int opcaoAtaque = sc.nextInt();
        //ramificação 1.1 - ataque 1
        if (opcaoAtaque == 1){
            System.out.println(frodo.nome+" não consegue acertar o "+dragao.classe+" e leva um golpe, porém "+gandalf.nome+" acerta o com a bola de fogo no olho do "+dragao.nome+".");
            Personagem.tiraEnergia(dragao, 15);
            Personagem.tiraEnergia(frodo, 30);
            //ramificação 1.1.1
        }
        //ramificação 1.2 - ataque 2
        else if(opcaoAtaque == 2){
            System.out.println(frodo.nome+" não consegue acertar o "+dragao.classe+" e leva um golpe, porém "+gandalf.nome+" acerta o com a bola de gelo no olho do "+dragao.nome+".");
            Personagem.tiraEnergia(dragao, 15);
            Personagem.tiraEnergia(frodo, 30);
        }
        //ramificação 1.3 - ataque 3
        else if(opcaoAtaque == 3){
            System.out.println(frodo.nome+" consegue distrair o "+dragao.classe+" e "+gandalf.nome+" acerta o com a bola de fogo no olho do "+dragao.nome+".");
            Personagem.tiraEnergia(dragao, 15);
        }
        //invalidando opção
        else{
            System.out.println("Opção inválida!"); 
        }
    }
//ramificação 2 - fugir
    else if (opcaoInicio==2){
        System.out.println(frodo.nome+" e "+gandalf.nome+ " fugiram do "+dragao.classe+".");
        Personagem.tiraEnergia(frodo, 100);
        Personagem.tiraEnergia(gandalf, 100);
    }
//ramificação 3 - conversar
    else if (opcaoInicio == 3){
        System.out.println(frodo.nome+" e "+gandalf.nome+ " tentaram negociar com o "+dragao.nome+".");
        System.out.println("O "+dragao.classe+" atacou e matou "+frodo.nome+" e "+gandalf.nome+".");
        Personagem.tiraEnergia(frodo, 100);
        Personagem.tiraEnergia(gandalf, 100);
    }
    //invalidando opção
    else{
        System.out.println("Opção inválida");
    }
    sc.close();
/*main*/}
/*App*/}