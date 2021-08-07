package br.com.generation.poo3;

public class TestaProdEletr3 {

	public static void main(String[] args) {
		
		ProdutoEletronico3 produto1 = new ProdutoEletronico3();
		ProdutoEletronico3 produto2 = new ProdutoEletronico3();
		
		produto1.marca = "DELL";
		produto1.tipo = "Notebook Inspiron 15500";
		produto1.status = "Lançamento";
		produto1.preço = 5699.99;
		
		produto2.marca = "Apple";
		produto2.tipo = "iPhone 13 Pro Max";
		produto2.status = "Pré-lançamento";
		produto2.preço = 9999.99;
		
		produto1.venderProdutos();
		
		System.out.println("Produto: " + produto1.tipo + " - Marca: " + produto1.marca + " (" + produto1.status + ") ");
		System.out.println("Valor: R$ " + produto1.preço);
		System.out.println();
		System.out.println("Produto: " + produto2.tipo + " - Marca: " + produto2.marca + " (" + produto2.status + ") ");
		System.out.println("Valor: R$ " + produto2.preço);
		System.out.println();


	}

}
