package pooTurma;

public class Funcionários {

	public static void main(String[] args) {
		//Objeto 1
		
		Administrativo funcionário1 = new Administrativo();
		funcionário1.nome = "Carlos";
		funcionário1.emailCorporativo = "carlos";
		funcionário1.redeDominio = "@sp.senac.br";
		funcionário1.acessarSistema();
		
		

		
		//Objeto 2
		Administrativo funcionário2 = new Administrativo();
		funcionário2.nome = "Joelma";
		funcionário2.emailCorporativo = "joelma";
		funcionário2.redeDominio = "@sesi.com.br";
		funcionário2.acessarSistema();
	}

}
