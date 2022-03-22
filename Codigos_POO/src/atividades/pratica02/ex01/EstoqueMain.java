package atividades.pratica02.ex01;

public class EstoqueMain {

	public static void main(String[] args) {
		
		Estoque carro = new Estoque("BMW", 2, 2);
		
		System.out.println(carro.mostra());
		
		carro.darBaixa(-1);
		
		System.out.println(carro.mostra());
		
		System.out.println(carro.precisaRepor());
		
		
		
		

	}

}
