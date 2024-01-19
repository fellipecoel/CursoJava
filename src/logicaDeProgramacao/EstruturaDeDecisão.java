package logicaDeProgramacao;

public class EstruturaDeDecisão {

	public static void main(String[] args) {
		String nome = "João Roberto";
		int idade = 22;
		char sexo = 'M';
		
		System.out.println(nome);
		System.out.println(idade);
		
		
		
		if (sexo == 'M') {
			System.out.println("Alistamento militar obrigatório!");
			}
		
		       
			else {
				System.out.println("Não é necessário se alistar.");
		}
		
		System.out.println("_______________________");
		
		if (sexo == 'M') {
			System.out.println("Alistamento obrigatório!");
		}
		
		else {
			System.out.println("É preciso ser do sexo masculino para"
					+ "com obrigatoriedade!");
		}

	}

	
}