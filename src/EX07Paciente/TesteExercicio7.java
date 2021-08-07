package EX07Paciente;

public class TesteExercicio7 {

	public static void main(String[] args) {
		
		Exercicio7 paciente = new Exercicio7();
		
		paciente.convenio= "Albert Einstein";
		paciente.nome= "Levi Osa";
		paciente.idade= 82;
		paciente.sexo= "masculino";
		paciente.diagnóstico="Enxaqueca";
		
		paciente.dodoizinho();
		
		System.out.println("Abertura de Ficha\n");
		System.out.println(paciente.convenio);
		System.out.println("\nnome: " + paciente.nome + "\nidade: " + paciente.idade);
		System.out.println("Sexo: " + paciente.sexo);
		System.out.println("Diagnóstico " + paciente.diagnóstico);
	}
}
