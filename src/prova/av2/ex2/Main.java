package prova.av2.ex2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		
		int idaluno = Integer.parseInt(JOptionPane.showInputDialog("Id_aluno: "));
		String nome = JOptionPane.showInputDialog("nome aluno: ");
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
		
		AlunoEnem AlunoEnem = new AlunoEnem(idaluno, nome, ano);
		
		
		
		ArrayList<ProvaEnem>provas = new ArrayList<> ();
		
		double notaFinal=0;
		for(int i=0; i<=5; i++) {
			int idProva = Integer.parseInt(JOptionPane.showInputDialog("IdProva: "));
			String titulo = JOptionPane.showInputDialog("titulo: ");
			int nota = Integer.parseInt(JOptionPane.showInputDialog("nota: "));
			
			ProvaEnem prova = new ProvaEnem (idProva, titulo, nota);
			provas.add(prova);
			notaFinal += prova.getNota();
		}
		
	
		JOptionPane.showMessageDialog(null, "Nota final: "+ notaFinal);
		
		
	}
}
