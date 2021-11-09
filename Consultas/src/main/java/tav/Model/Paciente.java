package tav.Model;


public class Paciente extends Pessoa{
		
		public Paciente(String nome, String cpf, String endereco, String sexo, int idade) {
			super(nome, cpf, endereco, sexo, idade);
			
		}

		@Override
		public String toString() {
			return "\n--------- PACIENTE ADICIONADO ---------\n Nome: " + getNome() + "\n CPF: " + getCpf() + "\n Endereco: " + getEndereco()
					+ "\n Sexo: " + getSexo() + "\n Idade: " + getIdade() + "\n\n";
		}
		
	}

