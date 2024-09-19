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
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getSerieId() {
        return serieId;
    }

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", idade=" + idade + ", serieId=" + serieId + "]";
	}

    
}
