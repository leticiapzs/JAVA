package br.com.banco.usuarios;

public class Funcionario {

	//definição de atributos
	private String nome;
	private String cpf;
	private double salario;
	private int senha;
	private String login;
	
	//Construtor default
	public Funcionario() {
	}

	//Construtor parametrizado	
	public Funcionario(String nome, String cpf, double salario, int senha, String login) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.senha = senha;
		this.login = login;
	}

	public double getBonificacao() {
		return this.salario * 0.1;
	}
	
	//Get e Set
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + ", senha=" + senha + ", login="
				+ login + "]";
	}
	
}
