package Personagem;

public class Personagem {
    private String nome;
    private int energia;

    public Personagem(String nome, int energia) {
        this.nome = nome;
        this.energia = energia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if (energia > 100) {
            this.energia = 100;
        } else if (energia < 0) {
            this.energia = 0;
        } else {
            this.energia = energia;
        }
    }

}