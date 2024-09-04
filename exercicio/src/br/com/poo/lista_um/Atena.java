package br.com.poo.lista_um;
import java.util.Scanner;  //Importação da classe Scanner do pacote java util

public class Atena {

	public static void main(String[] args) {
		
		//Cria um objeto Scanner para ler entradas do usuário 
		Scanner sc = new Scanner(System.in);
	
		//Solicita ao usuário a entrada 
		System.out.print("Insira a temperatura em Celsius: ");
		double temperaturaEmCelsius = sc.nextDouble();
		
		//Conversão de Celsius para Fahrenheit
		double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8 + 32);
		
		//Exibe a conversão
		System.out.printf("A temperatura %.2f°C é equivalente a %.2f°F ", temperaturaEmCelsius, temperaturaEmFahrenheit);
		
		//Encerramento do Scanner
		sc.close();
		
		
		
		
	}

}
