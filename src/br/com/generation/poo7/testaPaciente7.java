package br.com.generation.poo7;

public class testaPaciente7 {

	public static void main(String[] args) {
		
		pacienteEX7 paciente = new pacienteEX7();
		
		paciente.nome = "Maria Antônia Barão Santos";
		paciente.idade = 61;
		paciente.sexo = "F";
		paciente.diagnostico = "Covid-19";
		paciente.convenio = "Amil";
		
		paciente.internacao();
		
		System.out.println();
		System.out.println("Convenio " + paciente.convenio);
		System.out.println("Nome: " + paciente.nome + "     Idade: " + paciente.idade + " anos    Sexo: " + paciente.sexo);
		System.out.println("Diagnóstico: " + paciente.diagnostico);

	}

}
