package EX04Funcionarios;

public class TesteExercicio4 {
	
	public static void main(String[] args) {
		
		Exercicio4 Registrado1 = new Exercicio4();
		Exercicio4 Registrado2 = new Exercicio4();
		Exercicio4 Registrado3 = new Exercicio4();
		Exercicio4 Registrado4 = new Exercicio4();
		
		Registrado1.nome = "Vera";
		Registrado1.sobrenome = "Fcachenko";
		Registrado1.cargo = "Gerente";
		Registrado1.sal�rio = 15000.0;
		
		Registrado2.nome = "Cristiane";
		Registrado2.sobrenome = "Gomes";
		Registrado2.cargo = "Consultor";
		Registrado2.sal�rio = 12000.0;
		
		Registrado3.nome = "Carol";
		Registrado3.sobrenome = "Gomes";
		Registrado3.cargo = "Team Leader";
		Registrado3.sal�rio = 8000.0;
		
		Registrado4.nome = "Vinicius";
		Registrado4.sobrenome = "Amaral";
		Registrado4.cargo = "CEO";
		Registrado4.sal�rio = 1500000.0;
		
		
		Registrado1.registrado();
		
		System.out.println("Registros Funcion�rios \n" + "\n");
		System.out.println("Nome completo: " + Registrado1.nome + " " + Registrado1.sobrenome);
		System.out.println("Cargo - " + Registrado1.cargo);
		System.out.println("Sal�rio: R$" + Registrado1.sal�rio);
		
		
		Registrado2.registrado();
		
		System.out.println("\nNome completo: " + Registrado2.nome + " " + Registrado2.sobrenome);
		System.out.println("Cargo - " + Registrado2.cargo);
		System.out.println("Sal�rio: R$" + Registrado2.sal�rio);
		
		Registrado3.registrado();
		
		System.out.println("\nNome completo: " + Registrado3.nome + " " + Registrado3.sobrenome);
		System.out.println("Cargo - " + Registrado3.cargo);
		System.out.println("Sal�rio: R$" + Registrado3.sal�rio);
		
		Registrado4.registrado();
		
		System.out.println("\nNome completo: " + Registrado4.nome + " " + Registrado4.sobrenome);
		System.out.println("Cargo - " + Registrado4.cargo);
		System.out.println("Sal�rio: R$" + Registrado4.sal�rio);
		
		
	}

}
