package faeterj.tav;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agendamento {
	public int idAgendamento;
	public int idFuncionario;
	public String nomeMedico;
	public String endereco;
	public LocalDate dataAgendamento;
	public LocalTime hora;
	
	public int getIdAgendamento() {
		return idAgendamento;
	}
	public void setIdAgendamento(int idAgendamento) {
		this.idAgendamento = idAgendamento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	public LocalDate getDataAgendamento() {
		return dataAgendamento;
	}
	public void setDataAgendamento(LocalDate dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	
	// M�todo para verificar se a consulta foi marcada
	public String Consulta (int idAgendamento, String nomeMedico, String endereco, int idFuncionario, LocalTime hora, LocalDate DataAgendamento) {
		return "Consulta marcada!"; // confirma��o da marca��o da consulta
	}
	
	// M�todo para verificar se o(s) exame(s) foram marcados
	public String Exame (int idAgendamento, String nomeMedico, String endereco, int idFuncionario, LocalTime hora, LocalDate DataAgendamento) {
		return "Exame marcado com �xito!"; // confirma��o da marca��o do(s) exame(s)
	}
	
	// M�todo para verificar se a interna��o foi realizada
	public String Internacao (int idAgendamento, String nomeMedico, String endereco, int idFuncionario, LocalTime hora, LocalDate DataAgendamento) {
		return "Interna��o realizada com sucesso!"; // confirma��o  da interna��o
	}
}
