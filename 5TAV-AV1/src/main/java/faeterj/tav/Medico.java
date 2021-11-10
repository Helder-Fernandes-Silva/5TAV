package faeterj.tav;

public class Medico<M1, M2> { // aplicando tupla a classe Medico
	public final M1 nome;
	public final M2 endereco;

	public Medico(M1 mnome, M2 mendereco) {
		this.nome = mnome;
		this.endereco = mendereco;
	}

	public M1 getKey() {
		return nome;
	}

	public M2 getValue() {
		return endereco;
	}

	// Atribuindo informações a Classe Médico: Especialidade, Nome e Endereço
	public static Medico<String, String> Cardiologista() {
		return new Medico<String, String>("Otávio França", "Rua Nossa Senhora da Glória");
	}

	public static Medico<String, String> Urologista() {
		return new Medico<String, String>("Marcelo Novaes", "Rua Buenos Aires");
	}

	public static Medico<String, String> Oncologista() {
		return new Medico<String, String>("Antônio Figueiredo", "Av. Nossa Senhora de Copacabana");
	}

	public static Medico<String, String> Ginecologista() {
		return new Medico<String, String>("Maria Emília", "Rua das Flores");
	}

	public static Medico<String, String> Otorrinolaringologista() {
		return new Medico<String, String>("Luiz Francisco", "Rua Gomes Freire");
	}

	public static Medico<String, String> Pediatra() {
		return new Medico<String, String>("Maria Clara", "Rua Carolina Machado");
	}

	public static Medico<String, String> Laboratorio() {
		return new Medico<String, String>("Laboratório Brownstein", "Rua Dias da Cruz");
	}

	public static Medico<String, String> Internacao() {
		return new Medico<String, String>("Hospital São Vicente", "Rua Dr. Satamini");
	}
}
