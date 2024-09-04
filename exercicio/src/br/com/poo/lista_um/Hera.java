package br.com.poo.lista_um;
import java.util.Scanner; //Importação da classe Scanner do pacote java util
public class Hera {

	 public static void main(String[] args) {
		 
	// Cria um objeto Scanner para ler entradas do usuário
		 Scanner sc = new Scanner(System.in);

	// Declaração das variáveis para armazenar as idades
		 int idadeColega1, idadeColega2, idadeColega3, idadeColega4, idadeColega5, minha_idade;
		 int soma;

   // Solicita e lê a idade do colega 1
		 System.out.print("Qual é a idade do colega 1?\n");
		 idadeColega1 = sc.nextInt();

	// Solicita e lê a idade do colega 2
		 System.out.print("Qual é a idade do colega 2?\n");
		 idadeColega2 = sc.nextInt();

	// Solicita e lê a idade do colega 3
		 System.out.print("Qual é a idade do colega 3?\n");
		 idadeColega3 = sc.nextInt();
	// Solicita e lê a idade do colega 4
		 System.out.print("Qual é a idade do colega 4?\n");
		 idadeColega4 = sc.nextInt();

	// Solicita e lê a idade do colega 5
		 System.out.print("Qual é a idade do colega 5?\n");
		 idadeColega5 = sc.nextInt();
	// Solicita e lê a sua própria idade
		 System.out.print("Qual é a sua idade?\n");
		 minha_idade = sc.nextInt();

	// Calcula a soma das idades
		 soma = idadeColega1 + idadeColega2 + idadeColega3 + idadeColega4 + idadeColega5 + minha_idade;

	// Exibe o resultado
		 System.out.println("O tempo de vida meu e dos meus colegas é: " + soma);

	// Fecha o scanner
		 sc.close();
	    }
	}