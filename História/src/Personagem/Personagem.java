package Personagem;

public class Personagem {
    public String nome;
    public int energia;

    public Personagem(String nome, int energia) {
        this.nome = nome;
        this.energia = energia;
    }

    public void tiraEnergia(Personagem x, int energia) {
        x.energia = x.energia - energia;
        if (x.energia < 0) {
            x.energia = 0;
        }
        System.out.println(x.nome + "perdeu " + energia + " de energia.");
        if (x.energia > 0) {
            System.out.println(x.nome + " agora tem " + x.energia + " de energia.");
        } else {
            System.out.println(x.nome + " agora está morto.");
        }
    }
}