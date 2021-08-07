package EX01Clientes;

public class TesteExercicio1 {

			public static void main(String[] args) {
				
				Exercicio1 cliente1 = new Exercicio1();
				Exercicio1 cliente2 = new Exercicio1();
				Exercicio1 cliente3 = new Exercicio1();
				Exercicio1 cliente4 = new Exercicio1();
				Exercicio1 cliente5 = new Exercicio1();
				
				cliente1.nome = "Júlia";
				cliente1.produto = "Conjunto de roupas";
				cliente1.quantidade = 10;
				cliente1.valor= 799.99;
				
				cliente2.nome = "Talissa";
				cliente2.produto = "Fone de Ouvido Sem Fio Gamer" ;
				cliente2.quantidade = 1;
				cliente2.valor= 559.00;
				
				cliente3.nome = "Vini";
				cliente3.produto = "Touca";
				cliente3.quantidade = 5;
				cliente3.valor = 350.00;
				
				cliente4.nome = "Jeff";
				cliente4.produto = "Caneca Git/GitHub";
				cliente4.quantidade = 1;
				cliente4.valor= 24.50;
				
				cliente5.nome = "Natasha";
				cliente5.produto = "Kit esmalte";
				cliente5.quantidade = 2;
				cliente5.valor = 645.00;
				
				cliente1.pagarProduto();
				System.out.println("Nome: " + cliente1.nome);
				System.out.println("Produto: " + cliente1.produto);
				System.out.println("Quantidade: " + cliente1.quantidade);
				System.out.println("Valor: R$ " + cliente1.valor);
				System.out.println();
				cliente2.pagarProduto();
				System.out.println("Nome: " + cliente2.nome);
				System.out.println("Produto: " + cliente2.produto);
				System.out.println("Quantidade: " + cliente2.quantidade);
				System.out.println("Valor: R$ " + cliente2.valor);
				System.out.println();
				cliente3.pagarProduto();
				System.out.println("Nome: " + cliente3.nome);
				System.out.println("Produto: " + cliente3.produto);
				System.out.println("Quantidade: " + cliente3.quantidade);
				System.out.println("Valor: R$ " + cliente3.valor);
				System.out.println();
				cliente4.pagarProduto();
				System.out.println("Nome: " + cliente4.nome);
				System.out.println("Produto: " + cliente4.produto);
				System.out.println("Quantidade: " + cliente4.quantidade);
				System.out.println("Valor: R$ " + cliente4.valor);
				System.out.println();
				cliente5.pagarProduto();
				System.out.println("Nome: " + cliente5.nome);
				System.out.println("Produto: " + cliente5.produto);
				System.out.println("Quantidade: " + cliente5.quantidade);
				System.out.println("Valor: R$ " + cliente5.valor);


			}
		

	

}
