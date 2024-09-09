package br.com.banco.contas;

public class ContaCorrente extends Conta {

	private boolean chequeEspecial;
	private final double TAXA = 15.99;
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(int numero, int agencia, String titular, double saldo, boolean chequeEspecial) {
		super(numero, agencia, titular, saldo);
		this.chequeEspecial = chequeEspecial;
	}

	public boolean isChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(boolean chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public double getTAXA() {
		return TAXA;
	}

	@Override
	public String toString() {
		return "ContaCorrente [" + super.toString() + ", chequeEspecial=" + chequeEspecial + ", TAXA=" + TAXA + "]";
	}
	
}
