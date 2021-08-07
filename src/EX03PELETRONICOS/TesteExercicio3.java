package EX03PELETRONICOS;

public class TesteExercicio3 {
	
	public static void main (String [] args) {
		
		Exercicio3 Produto1 = new Exercicio3();
		Exercicio3 Produto2 = new Exercicio3();
		
		Produto1.tipo = "TV";
		Produto1.marca = "Samsung";
		Produto1.preco = 3.500;
		Produto1.status = "Lançamento";
		
		Produto2.tipo = "Celular";
		Produto2.marca = "Iphone";
		Produto2.preco = 2.500;
		Produto2.status = "Em estoque";
				
	
		Produto1.Vender_Produto();
		
		System.out.println("Detalhes do Produto 1. \n");
		System.out.println("Produto: " + Produto1.tipo + "  marca - " + Produto1.marca);
		System.out.println("Preço: " + Produto1.marca);	
		System.out.println("Status: " + Produto1.status + "\n" + "\n");
		
        Produto2.Vender_Produto();
		
        System.out.println("Detalhes do Produto 2. \n");
		System.out.println("Produto: " + Produto2.tipo + "  marca - " + Produto2.marca);
		System.out.println("Preço: " + Produto2.marca);	
		System.out.println("Status: " + Produto2.status);
}
}

