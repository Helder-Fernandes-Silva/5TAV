package tav.Model;

import java.sql.Date;

public class Agendamento {
	public int dia;
	public int hora;
	
	public boolean agendaConsulta(String nomePaciente, String nomeMedico, int dia, int hora) {
		if(nomeMedico.equals("Jorge"))
		{
			return true;
		}
		return false;
	}
	
	public boolean agendaExame(String nomePaciente, int dia, int hora) {
		if(dia == 20) {
			return true;
		}
		return false;
		
	}
	
	public boolean agendaInternacao(String nomePaciente, String nomeMedico, String especialidade, int dia, int hora) {
		if(especialidade.contains("Urologista")) {
			return true;
		}
		return false;
		
	}
}
