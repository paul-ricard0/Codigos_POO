package exemplo.estoque;

public class ControleEstoque {

	public static void main(String[] args) {
// 		cria o objeto caneta do tipo Estoque e passa os parāmetros para criar este objeto.
		Estoque caneta = new Estoque("caneta",2,100);
		caneta.imprimirEstoque();
		
		Estoque lapis = new Estoque("Lapis",1,100);
		lapis.imprimirEstoque();
	}

}
