package br.com.generation.poo6;

public class TestaConta6 {

	public static void main(String[] args) {
		
		ContaEX6 pessoa1 = new ContaEX6();
		
		pessoa1.agencia = 1574;
		pessoa1.conta = 000365.4;
		pessoa1.nome = "José Virgulino da Silva";
		pessoa1.banco = "iti - Itaú";
		pessoa1.tipo = "(Conta Corrente)";
		
		pessoa1.transferir();
		System.out.println();
		System.out.println("Nome: " + pessoa1.nome);
		System.out.println("Banco " + pessoa1.banco + " " + pessoa1.tipo);
		System.out.println("Agência: " + pessoa1.agencia + " | Conta: " + pessoa1.conta);
		

	}

}
