package EX02Clientes;

public class TesteExercicio2 {
	
	public static void main(String [] args) {
		
		Exercicio2 Cliente1 = new Exercicio2 ();
		Exercicio2 Cliente2 = new Exercicio2 ();
		
		Cliente1.nome = "Vinicius";
		Cliente1.companhia = "Azul";
		Cliente1.origem = "Paris";
		Cliente1.destino = "London";
		Cliente1.Assento = "A7";
		Cliente1.qtd_bagagem = 2;
		Cliente1.Peso_Bagagem = 20.0;
		
		Cliente2.nome = "Julia";
		Cliente2.companhia = "Azul";
		Cliente2.origem = "London";
		Cliente2.destino = "Santorine";
		Cliente2.Assento = "A2 Classe 1";
		Cliente2.qtd_bagagem = 4;
		Cliente2.Peso_Bagagem = 35.0;
		
		Cliente1.IrViajar ();
		
		System.out.println("Nome: " + Cliente1.nome);
		System.out.println("Companhia: " + Cliente1.companhia);
		System.out.println("Origem: " + Cliente1.origem);
		System.out.println("Destino: " + Cliente1.destino);
		System.out.println("Assento: " + Cliente1.Assento);
		System.out.println("Quantidade de Bagagem: " + Cliente1.qtd_bagagem);
		System.out.println("Peso_Bagagem: " + Cliente1.Peso_Bagagem + "\n");
		
		Cliente2.IrViajar ();
		
		System.out.println("\nNome: " + Cliente2.nome);
		System.out.println("Companhia: " + Cliente2.companhia);
		System.out.println("Origem: " + Cliente2.origem);
		System.out.println("Destino: " + Cliente2.destino);
		System.out.println("Assento: " + Cliente2.Assento);
		System.out.println("Quantidade de Bagagem: " + Cliente2.qtd_bagagem);
		System.out.println("Peso_Bagagem: " + Cliente2.Peso_Bagagem);

}
}