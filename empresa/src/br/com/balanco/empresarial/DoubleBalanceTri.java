package br.com.balanco.empresarial;

public class DoubleBalanceTri {

	public static void main(String[] args) {
		// Gastos dos meses de Janeiro, Fevereiro e Março
		double gastosJaneiro = 15000.00;
		double gastosFevereiro = 23000.00;
		double gastosMarco = 17000.00;

		// Calculo do gasto trimestral
		double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

		// Exibe os gastos do Trimestre
		System.out.printf("O gasto do trimeste foi de %.2f", gastosTrimestre);

	}

}
