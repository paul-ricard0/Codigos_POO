package prova.av1.ex01;

import atividades.pratica03.ex02.FPadrao;

public class Encontrar {
	
	public static void main(String[] args) {
		
		Usuario usuario = new Usuario("Paulo", "emailPaulo", "senhaPaulo");
		AchadoPerdido achadoPerdido = new AchadoPerdido("tituloPaulo", "descriçãoPaulo", "tipoPaulo", "statusPaulo");
		// A questão não pede para passar o método completaDados
		achadoPerdido.buscarTitulo("tituloPaulo");
		achadoPerdido.visualizarDetalhes();
	}
}
