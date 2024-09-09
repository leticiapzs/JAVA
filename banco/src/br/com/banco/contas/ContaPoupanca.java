package br.com.banco.contas;

public class ContaPoupanca extends Conta {

	private double rendimento;
	private final double TAXA = 0.005;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(int numero, int agencia, String titular, double saldo) {
		super(numero, agencia, titular, saldo);
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	public double getTAXA() {
		return TAXA;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [" + super.toString() + ", rendimento=" + rendimento + ", TAXA=" + TAXA + "]";
	}
	
}
