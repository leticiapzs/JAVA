package br.com.pessoaserie;

public class Serie {
    private int id;
    private String nome;
    private String genero;
    private int temporadas;

    public Serie(int id, String nome, String genero, int temporadas) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.temporadas = temporadas;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getGenero() {
        return this.genero;
    }

    public int getTemporadas() {
        return this.temporadas;
    }

    public String toString() {
        return "ID: " + this.id + "\nNome: " + this.nome + "\nGênero: " + this.genero + "\nTemporadas: " + this.temporadas + "\n";
    }
}
