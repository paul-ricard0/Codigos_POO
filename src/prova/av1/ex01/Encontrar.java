package prova.av1.ex01;

import atividades.pratica03.ex02.FPadrao;

public class Encontrar {
	
	public static void main(String[] args) {
		
		Usuario usuario = new Usuario("Paulo", "emailPaulo", "senhaPaulo");
		AchadoPerdido achadoPerdido = new AchadoPerdido("tituloPaulo", "descri��oPaulo", "tipoPaulo", "statusPaulo");
		// A quest�o n�o pede para passar o m�todo completaDados
		achadoPerdido.buscarTitulo("tituloPaulo");
		achadoPerdido.visualizarDetalhes();
	}
}
