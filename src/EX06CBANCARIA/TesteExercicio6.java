package EX06CBANCARIA;

public class TesteExercicio6 {
	
	public static void main(String[] args) {
		
		Exercicio6 c1 = new Exercicio6();
		
		c1.banco = "Bradesco";
		c1.cc = 001253.5;
		c1.ag = 84;
		c1.nome = "Credu Papadopulus";
		
		c1.conta_aberta();
		
		System.out.println("Detalhes da Conta\n");
		System.out.println(c1.banco);
		System.out.println("Conta Concorrente: " +c1.cc +  " /" + " Agencia: " + c1.ag);
		System.out.println("Nome do Titular: " + c1.nome);
	}

}
