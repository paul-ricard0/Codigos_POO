package atividades.pratica04.ex01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {
	
	ContaPoupanca(){}
	
	public void setSaldo(double saldo) {
		setSaldo(saldo);
	}
	
	public void imprimeExtrato() {
		System.out.println("### Extrato Cona ###");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/aaaa");
		Date date = new Date();
		
		System.out.println("Saldo: "+ this.getSaldo());
		System.out.println("Data: "+ sdf.format(date));
	};
	
	
}
