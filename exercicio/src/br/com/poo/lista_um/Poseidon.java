package br.com.poo.lista_um;
import java.util.Scanner; // importação da classe Scanner do pacote java.util

public class Poseidon {
	
	//declaração do método main, que dá início ao programa
	public static void main(String[] args) {
		
		// Prepara a entrada de dados
		Scanner sc = new Scanner(System.in);
		//Declaração variável nome
			String nome;
		//Declaração variável sobrenome
			String sobrenome;
		
	//Mensagem inicial
		System.out.println("Olá!");
	// Exibe a mensagem e pede ao usuário escrever o seu nome
		System.out.print("Qual é o seu nome? ");
		nome = sc.nextLine();
	//Exibe a mensagem e pede ao usuário para escrever o sobrenome
		System.out.println("Qual é o seu sobrenome? ");
		sobrenome = sc.nextLine();
	//Exibe o nome e o sobrenome
		System.out.printf("\n Olá "  + nome + " " + sobrenome + ". Seja bem-vindo(a) ao programa Poseidon!");
	//Fechar o scanner
		sc.close();
		

	}

}
