package br.com.generation.poo;

public class TesteExercicio1 {

	public static void main(String[] args) {
		
		ClientesExercicio1 cliente1 = new ClientesExercicio1();
		ClientesExercicio1 cliente2 = new ClientesExercicio1();
		ClientesExercicio1 cliente3 = new ClientesExercicio1();
		ClientesExercicio1 cliente4 = new ClientesExercicio1();
		ClientesExercicio1 cliente5 = new ClientesExercicio1();
		
		cliente1.nome = "Júlia";
		cliente1.produto = "Conjunto de Taças";
		cliente1.quantidade = 6;
		cliente1.valor= 59.99;
		
		cliente2.nome = "Gabriel";
		cliente2.produto = "Fone de Ouvido Sem Fio" ;
		cliente2.quantidade = 1;
		cliente2.valor= 159.00;
		
		cliente3.nome = "Giulia";
		cliente3.produto = "Jogo de pincéis de Maquiagem";
		cliente3.quantidade = 1;
		cliente3.valor = 54.70;
		
		cliente4.nome = "Vinicius";
		cliente4.produto = "Caneca Git/GitHub";
		cliente4.quantidade = 1;
		cliente4.valor= 24.50;
		
		cliente5.nome = "Beatriz";
		cliente5.produto = "Quadro Decorativo";
		cliente5.quantidade = 2;
		cliente5.valor = 45.00;
		
		cliente1.pagarProduto();
		System.out.println("Nome: " + cliente1.nome);
		System.out.println("Produto: " + cliente1.produto);
		System.out.println("Quantidade: " + cliente1.quantidade);
		System.out.println("Valor: R$ " + cliente1.valor);
		System.out.println();
		cliente2.pagarProduto();
		System.out.println("Nome: " + cliente2.nome);
		System.out.println("Produto: " + cliente2.produto);
		System.out.println("Quantidade: " + cliente2.quantidade);
		System.out.println("Valor: R$ " + cliente2.valor);
		System.out.println();
		cliente3.pagarProduto();
		System.out.println("Nome: " + cliente3.nome);
		System.out.println("Produto: " + cliente3.produto);
		System.out.println("Quantidade: " + cliente3.quantidade);
		System.out.println("Valor: R$ " + cliente3.valor);
		System.out.println();
		cliente4.pagarProduto();
		System.out.println("Nome: " + cliente4.nome);
		System.out.println("Produto: " + cliente4.produto);
		System.out.println("Quantidade: " + cliente4.quantidade);
		System.out.println("Valor: R$ " + cliente4.valor);
		System.out.println();
		cliente5.pagarProduto();
		System.out.println("Nome: " + cliente5.nome);
		System.out.println("Produto: " + cliente5.produto);
		System.out.println("Quantidade: " + cliente5.quantidade);
		System.out.println("Valor: R$ " + cliente5.valor);


	}

}
