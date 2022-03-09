package atividades.pratica01.ex03;

public class Main {

	public static void main(String[] args) {
		
		Aluno paulo = new Aluno("Paulo", "121A", 19, 40, 80, "ADS", 4);
		
		System.out.println(paulo.notaAV1);
		paulo.alteraNotaAV1(15);
		System.out.println(paulo.notaAV1);
		
		paulo.avaliar(paulo.notaAV1, paulo.notaAV2);
		
		paulo.avaliarRecuperação(paulo.notaAV1, paulo.notaAV2, paulo.notaAE);
		
		paulo.DESAFIO(paulo.notaAE);
	}

}
