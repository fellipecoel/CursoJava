package pooTurma;

public class Alunos {

	
	public static void main(String[] args) {
		//Objeto 1
		Turma aluno1 = new Turma();
		aluno1.nome = "Nathan";
		aluno1.telefone = "11992682158";
		aluno1.email = "nathan.martins2004@gmail.com";
		System.out.println("Nome do aluno:" + aluno1.nome);
		System.out.println("Telefone:" + aluno1.telefone);
		System.out.println("Email:" + aluno1.email);
		aluno1.ligarPc();
		aluno1.logar();
		aluno1.beberÁguaAluno();
		
		//Objeto 2
		Turma aluno2 = new Turma();
		aluno2.nome = "Victoria";
		aluno2.telefone = "11986080091";
		aluno2.email = "victoriacardoso545@gmail.com";
		System.out.println("Nome do aluno:" + aluno2.nome);
		System.out.println("Telefone:" + aluno2.telefone);
		System.out.println("Email:" + aluno2.email);
		aluno2.ligarPc();
		aluno2.desligarPc();
		
		
	}
	

}
