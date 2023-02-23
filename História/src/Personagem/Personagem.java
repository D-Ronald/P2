package Personagem;

public class Personagem {
    private String nome;
    private int energia;

    public Personagem(String nome, int energia) {
        setNome(nome);
        setEnergia(energia);
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
        this.energia = energia;
    }

}