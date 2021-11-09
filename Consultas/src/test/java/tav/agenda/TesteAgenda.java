package tav.agenda;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import tav.Model.Agendamento;
import tav.Model.Cadastrar;
import tav.Model.Paciente;

public class TesteAgenda {

	@Test
	public void testConsultaNomeMedico() {
	// Arrange
	Agendamento agenda = new Agendamento();
	String nomeMedico= "Jorge";
	String nomePaciente = "Paulo";
	int dia = 20;
	int hora = 10;
	boolean esperado = true;
			
	// Act
	boolean resultado = agenda.agendaConsulta(nomePaciente, nomeMedico, dia, hora);
			
	// Assert
	assertEquals(nomeMedico, esperado);
	}
	
	@Test
	public void testdiaExame() {
	// Arrange
	Agendamento agenda = new Agendamento();
	String nomePaciente = "Carlos";
	int dia = 10;
	int hora = 10;
	boolean esperado = true;
			
	// Act
	boolean resultado = agenda.agendaExame(nomePaciente, dia, hora);
			
	// Assert
	assertEquals(dia, esperado);
	}
	
	@Test
	public void testEspecialidade() {
	// Arrange
	Agendamento agenda = new Agendamento();
	String nomePaciente = "Carlos";
	String nomeMedico = "Otávio";
	String especialidade = "Cardiologista";
	int dia = 10;
	int hora = 10;
	boolean esperado = true;
		
				
	// Act
	boolean resultado = agenda.agendaInternacao(nomePaciente, nomeMedico, especialidade, dia, hora);
			
	// Assert
	assertEquals(dia, esperado);
	}

}
