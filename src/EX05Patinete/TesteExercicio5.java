package EX05Patinete;

public class TesteExercicio5 {
	
	public static void main (String[] args) {
		
		Exercicio5 pat1 = new Exercicio5();
		Exercicio5 pat2 = new Exercicio5();
		
		pat1.cor = "Black";
		pat1.tamanho = 1.5;
		pat1.preço = 150.0;
		
		pat2.cor = "Orange";
		pat2.tamanho = 1.75;
		pat2.preço = 250;
		
		pat1.vender();
		
		System.out.println("Welcome to the store!\n");
		System.out.println("\nProduct color - " + pat1.cor);
		System.out.println("Product size: " + pat1.tamanho);
		System.out.println("Sale price: " + pat1.preço);
		
		pat2.vender();
		
		System.out.println("\nProduct color - " + pat2.cor);
		System.out.println("Product size: " + pat2.tamanho);
		System.out.println("Sale price: " + pat2.preço);
		
		
	}

}
