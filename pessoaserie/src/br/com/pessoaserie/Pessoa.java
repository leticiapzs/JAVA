package br.com.pessoaserie;

public class Pessoa {
    private int id;
    private String nome;
    private int idade;
    private int serieId;

    public Pessoa(int id, String nome, int idade, int serieId) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.serieId = serieId;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public int getSerieId() {
        return this.serieId;
    }

    public String toString() {
        return "Pessoa [id=" + this.id + ", nome=" + this.nome + ", idade=" + this.idade + ", serieId=" + this.serieId + "]";
    }
}
