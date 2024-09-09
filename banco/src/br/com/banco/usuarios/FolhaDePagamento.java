package br.com.banco.usuarios;

public class FolhaDePagamento {
	
	 //Método de polimorfismo
    public void calcularFolha(Funcionario funcionario) {
        double salario = funcionario.calcularSalario();
        System.out.println("O salário de " + funcionario.getNome() + " é: " + salario);
    }

    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Luiz", "1234", 2000.0, 1234, "LuizV");
        Gerente gerente1 = new Gerente("Leticia", "9876", 10000.0, 5678, "LeticiaP");

        FolhaDePagamento folha = new FolhaDePagamento();
        folha.calcularFolha(func1);    
        folha.calcularFolha(gerente1); 
    }
	

}
