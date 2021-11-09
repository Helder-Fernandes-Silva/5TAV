package tav.Model;


public class Medico extends Pessoa {
	
	private String crm;
	private String siglaEstado;
	private String especialidade;
	
	public Medico(String nome, String cpf, String endereco, String sexo, int idade, String crm, String siglaEstado,
			String especialidade) {
		super(nome, cpf, endereco, sexo, idade);
		this.crm = crm;
		this.siglaEstado = siglaEstado;
		this.especialidade = especialidade;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getSiglaEstado() {
		return siglaEstado;
	}

	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public String toString() {
		return "\n--------- MEDICO ADICIONADO ---------\n Nome: " + getNome() + "\n CPF: " + getCpf() + " \n CRM: " + crm + "\n Sigla do Estado: " + siglaEstado + "\n Endereco: " + getEndereco() +
				"\n Sexo: " + getSexo() + "\n Idade: " + getIdade() + "\n Especialidade: " + especialidade + "\n";
	}
	
}
