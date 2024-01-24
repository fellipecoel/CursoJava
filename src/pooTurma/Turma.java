package pooTurma;


public class Turma {
//Atributos da classe
	String nome;
	String telefone;
	String email;
	
	//Construtor
	public Turma() {
		System.out.println("____________________");
		
		
	}
	
	public void beberÁguaAluno() {
		beberÁgua();
		
	}
	
	//Métodos
	
    void ligarPc() {
    	System.out.println("Computador ligado");
    }
    
    
    

       void logar() {
    	System.out.println("Login feito com sucesso"); 
    	
       }
    	
        void desligarPc() {
        	System.out.println("Computador desligado");   
           
       }
    	private void beberÁgua() {
    		System.out.println("Ir ao bebedouro para beber água");
    		
    	}
}

