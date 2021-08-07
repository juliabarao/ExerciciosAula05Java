package br.com.generation.poo4;

public class TestaFunc4 {

	public static void main(String[] args) {
		
		FuncExercicio4 funcionario1 = new FuncExercicio4();
		FuncExercicio4 funcionario2 = new FuncExercicio4();
		FuncExercicio4 funcionario3 = new FuncExercicio4();
		
		funcionario1.nome = "Laticia";
		funcionario1.sobrenome = "Gomes";
		funcionario1.cargo = "Gerente Administrativo";
		funcionario1.salario = 5500.00;
		
		funcionario2.nome = "Vinicius";
		funcionario2.sobrenome = "Amaral";
		funcionario2.cargo = "Estagiario";
		funcionario2.salario = 1100.00;
		
		funcionario3.nome = "Gabriel";
		funcionario3.sobrenome = "Tijon";
		funcionario3.cargo = "Desenvolvedor Java Pleno";
		funcionario3.salario = 10000.00;
		
		funcionario1.registrar();
		System.out.println("Nome: " + funcionario1.nome + " - Sobrenome: " + funcionario1.sobrenome + " (CARGO " + funcionario1.cargo + ") ");
		System.out.println("Salário: R$ " + funcionario1.salario);
		System.out.println();
		funcionario2.registrar();
		System.out.println("Nome: " + funcionario2.nome + " - Sobrenome: " + funcionario2.sobrenome + " (CARGO " + funcionario2.cargo + ") ");
		System.out.println("Salário: R$ " + funcionario2.salario);
		System.out.println();
		funcionario3.registrar();
		System.out.println("Nome: " + funcionario3.nome + " - Sobrenome: " + funcionario3.sobrenome + " (CARGO " + funcionario3.cargo + ") ");
		System.out.println("Salário: R$ " + funcionario3.salario);
		System.out.println();

	}

}
