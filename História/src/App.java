import java.util.Scanner;
import Personagem.Personagem;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
//construindo personagens
    Personagem mae = new Personagem("Mãe","branca","mãe(Adotiva)", 40, "Gananciosa");
    Personagem pai = new Personagem("Pai","judeu","Pai(adotivo)", 55, "Rico");
    Personagem filho = new Personagem("Ele","Preto","Filho", 8, "Simples");
    Personagem filha = new Personagem("Amorzinho","branca","irmã(Adotiva)", 15, "Mimada");
    Personagem jardineiro = new Personagem("Jardineiro", "Afro-latino", "Pai", 35, "Honesto");
//iniciando a trama
    System.out.println("O dono de uma mansão foi morto, e a polícia pssui um suspeito (apesar de claramente essa suspeita ser principalmente advinda de seus preconceitos).");
    System.out.println("Porém o filho adotivo dessa família fez uma descoberta que pode mudar o rumo da investigação, '"+filho.nome+"' encontrou a arma do crime.");
    System.out.println("Então, a polícia decidiu continuar na casa buscando por pistas que levassem ao real culpado.");
    System.out.print("Escutando atentamente a conversa da polícia, '"+filho.nome+"' escolhe uma linha de investigação para ajudar a provar a inocência de seu amigo "+jardineiro.nome+".");
    System.out.println("Depois de muito vasculhar e encontar pistas, '"+filho.nome+"' se depara com 3 possibilidades de quem poderia ter matado o"+pai.nome+".");
    System.out.println("Então ele decide ouvir os depoimentos de cada um dos suspeitos.");
    System.out.println("Quem '"+filho.nome+"' deve ouvir primeiro?");
    System.out.println("1 - "+mae.nome);
    System.out.println("2 - "+filha.nome);
    System.out.println("3 - "+jardineiro.nome);
    int investigarCulpado = sc.nextInt();

        if (investigarCulpado == 1){
            System.out.print("O policial pede para a "+mae.nome+" detalhar o que ela fez na noite do crime.");
            System.out.println(mae.nome+" Escolhendo a roupa para um jantar importante que teria no dia seguinte.");
            System.out.println(mae.nome+" Comeu um creme de nozes com torrada e suco de morango.");
            System.out.println("O policial pergunta por que ela não se deu conta do sumiço do marido.");
            System.out.println(mae.nome+" responde que ele sempre dormia em seu escritório, e que não se deu conta do sumiço dele.");
            System.out.println("Ao ouvir isso "+filho.nome+" vai verificar se a "+mae.nome+" estava falando mesmo a verdade.");
            System.out.println("Independente de onde "+filho.nome+" vá primeiro, o álibe da "+mae.nome+" bate. exceto por alguns detalhes.");
            System.out.println("O vestido o qual a "+mae.nome+" escolheu para o jantar era um vestido de festa, era preto e sem brilho nem luxo.");
            System.out.println("O que era algo estranho, pois a "+mae.nome+" amava se exibir e brilhar. além disso, odiava coisas pretas.");
            System.out.println(filho.nome+" ao chegar na cozinha viu que a "+mae.nome+" realmente comeu o creme de nozes com torrada e suco de morango.\n Porém, o estranho dessa vez é que ela devorou toda a comida do prato, \n coisa que ela não costumava fazer por medo de engordar, além disso, havia migalhas de brigadeiro,\n oque era estranho pois a "+mae.nome+" não comia açúcar, \n e por algum motivo detestava muito chocolate, 'parece nojeto' dizia ela sempre que avistava um.");
            System.out.println("seguindo finalmente pro quarto, o que era mais estranho é que a cama estava completamente bagunçada como se um animal tivesse dormido ali.");
            System.out.println("Enquanto procurava por pistas, "+filho.nome+" ele deitou na coberta, e enquanto pensava no que tinha deixado passar percebeu o quadro ridiculamente feio que ela fazia  questão de manter no quarto.");
            System.out.println("O quadro estava torto e havia uma carta. e essa carta uma declaração de amor para clara ( nome verdadeiro da mãe)");
            System.out.println(filho.nome+" cogita entregar a carta para a polícia, ele deve entregar a carta?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            int escolhaCarta = sc.nextInt();
        if (escolhaCarta == 1){
            System.out.println("Ao entregar a carta para a polícia, a "+mae.nome+" é presa por assassinato.");
            System.out.println("A polícia descobre que a "+mae.nome+" tinha um amante e matou o marido para ficar com o dinheiro dele.");
        }
        else if (escolhaCarta == 2){
            System.out.println("Os policias não encontram nada de relevante no quarto, e a "+mae.nome+" é liberada.");
            System.out.println("E leva o "+jardineiro.nome+" preso por assassinato.");
            System.out.println("Pouco tempo depois a "+mae.nome+"foge com a "+filha.nome+" e o dinheiro do marido.");
        }
        else{
            System.out.println("Opção inválida");

        }
    }
        else if (investigarCulpado == 2){
            System.out.println("A polícia pergunta para a "+filha.nome+" o que ela fez na noite do crime.");
            System.out.println(filha.nome+" estava na casa de uma amiga, e não tinha como saber que o marido da sua mãe tinha sido assassinado.");
            System.out.println("A polícia verifica que o álibi da "+filha.nome+" bate, e a libera.");
            System.out.println("A polícia leva o "+jardineiro.nome+" preso por assassinato.");
            System.out.print("FIm");
        }
        else if(investigarCulpado == 3){
            System.out.println("A polícia pergunta para o "+jardineiro.nome+" o que ele fez na noite do crime.");
            System.out.println(jardineiro.nome+" estava em sua casa dormindo.");
            System.out.println("o plicial pergunta se ele percebeu algo estranho no dia do crime.");
            System.out.println(jardineiro.nome+" responde que viu o marido da "+mae.nome+" discutindo com alguem no telefone.");
            System.out.println("O policial pergunta se ele viu quem era a pessoa com quem o marido da "+mae.nome+" estava discutindo.");
            System.out.println(jardineiro.nome+" responde que não, mas que ouviu falar sobre uma carta em no escritório do "+pai.nome+".");
            System.out.println("O policial vai até o escritório do "+pai.nome+" e encontra uma carta.");
            System.out.println("era uma carta de suicídio, e que nela revelava que o "+filho.nome+" era filho do"+jardineiro.nome+" e não do"+pai.nome+".");
            System.out.println("O policial liberar o "+jardineiro.nome+".");
            System.out.println("Fim.");
        }
        else{
            System.out.println("Opção inválida");
        }



    sc.close();
/*main*/}
/*App*/}