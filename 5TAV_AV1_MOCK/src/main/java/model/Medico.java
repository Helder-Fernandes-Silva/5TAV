package model;

import java.util.LinkedList;

import interfaces.IMedico;

public class Medico implements IMedico {

    public Integer CRM;
    public String nome;
    public String especialidade;
    public Endereco enderecoMedico;

	LinkedList<Endereco> endereco = new LinkedList<Endereco>();
    LinkedList<Medico> medico = new LinkedList<Medico>();

    public Medico(Integer CRM, String nome, String especialidade, Endereco enderecoMedico) {
        this.CRM = CRM;
        this.nome = nome;
        this.especialidade = especialidade;
        this.enderecoMedico = enderecoMedico;
    }

    public Medico() {
	
	}

	public void adicionarMedico(Integer CRM, String nome, String especialidade, Endereco enderecoMedico) {
        this.medico.add(new Medico(CRM, nome, especialidade, enderecoMedico));
        this.setCRM(CRM);
        this.setNome(nome);
        this.setEspecialidade(especialidade);
        this.endereco.add(enderecoMedico);
        this.setEnderecoMedico(enderecoMedico); 
    }

    public LinkedList<Medico> getMedico() {
        return medico;
    }

    public void adicionarEndereco(Endereco enderecoMedico) {
        this.endereco.add(enderecoMedico);
        setEnderecoMedico(enderecoMedico);
    }

    public String toString() {
        return String.format("\nCRM: %d\nNome: %s\nEspecialidade: %s\n%s",
        getCRM(), getNome(), getEspecialidade(), getEnderecoMedico());
    }
    
    public void setCRM(Integer CRM) {
        this.CRM = CRM;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setEnderecoMedico(Endereco enderecoMedico) {
        this.enderecoMedico = enderecoMedico;
    }

    public Integer getCRM() {
        return this.CRM;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public Endereco getEnderecoMedico() {
        return enderecoMedico;
    }
	public boolean ValidaCRM (IMedico medico){
		return true;
	}

	public boolean ValidaEndereco(IMedico medico) {
		return true;
	}

	public boolean ValidaDataPorEndereco(IMedico medico) {
		return true;
	}

	public boolean ValidaHoraPorData(IMedico medico) {
		return true;
	}
}