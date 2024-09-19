package br.com.pessoaserie;

public class Serie {
    private int id;
    private String nome;
    private String genero;
    private int temporadas;

    // Construtor
    public Serie(int id, String nome, String genero, int temporadas) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.temporadas = temporadas;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getTemporadas() {
        return temporadas;
    }

    // Método toString
    @Override
    public String toString() {
        return "ID: " + id + "\nNome: " + nome + "\nGênero: " + genero + "\nTemporadas: " + temporadas + "\n";
    }
}