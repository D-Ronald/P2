package Personagem;
public class Personagem{
    public String nome;
    public String raca;
    public String classe;
    public int energia;
    public Personagem(String nome,String raca, String classe, int energia){
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;
        this.energia = energia;
    }
public static void verificaEnergia(Personagem x,Persongem y){
    if(x.energia == 0 && y.energia == 0){
        System.out.println(x.nome+" e "+y.nome+" estão mortos!");
    }
    else if(y.energia == 0){
        System.out.println(y.nome+" está morto!");
    }
    else if(x.energia == 0){
        System.out.println(x.nome+" está morto!");
    } 
}
public static void tiraEnergia(Personagem x, int energia){
    x.energia -= energia;
    system.outprintln(x.nome+" perdeu "+energia+" de energia!");
}
}