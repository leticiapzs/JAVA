package br.com.balanco.empresarial;
import java.math.BigDecimal;
public class BigDecimalBalancoTri {

	public static void main(String[] args) {
		
		//Gastos dos meses de Janeiro, Fevereiro e Março
		BigDecimal gastosJaneiro = new BigDecimal("15000");
		BigDecimal gastosFevereiro = new BigDecimal("23000");
		BigDecimal gastosMarco = new BigDecimal("17000");
		
		//Calculo do gasto trimestral 
		BigDecimal gastosTrimestre = gastosJaneiro.add(gastosFevereiro).add(gastosMarco);
		
		//Exibe os gastos do Trimestre
		System.out.println(gastosTrimestre);

	}

}
