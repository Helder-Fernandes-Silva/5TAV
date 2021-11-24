package teste;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

import interfaces.IMedico;
import model.Agendamento;
import model.Funcionario;
import model.Medico;

public class AgendamentoUnitTest {
	
	@Test
	public void ValidaMedico(){
		//Arrange
		IMedico mockMedico = mock(IMedico.class);
		Agendamento agendar = new Agendamento(0, 0, "Consulta", 0, "Rua das Flores, 10","2022/05/30", "13:00");
		boolean esperado = false;
		IMedico medico = new Medico();
		
        when(mockMedico.ValidaCRM(medico)).thenReturn(true);
		
        //Act
        boolean resultado = agendar.ValidaCRM(medico);

        //Assert
        assertEquals(resultado, esperado);
		
	}
	
	@Test
	public void ValidaExame() {
		//Arrange
		IMedico mockMedico = mock(IMedico.class);
		Agendamento agendar = new Agendamento(0, 0, "Exame", 1, "Rua das Graças, 20", "2022/02/13", "11:00");
		boolean esperado = true;
		IMedico medico = new Medico();
		
        when(mockMedico.ValidaEndereco(medico)).thenReturn(true);
		
        //Act
        boolean resultado = agendar.ValidaEndereco(medico);

        //Assert
        assertEquals(resultado, esperado);
	}
	
	@Test
	public void ValidaInternacao() {
		//Arrange
		IMedico mockMedico = mock(IMedico.class);
		Agendamento agendar = new Agendamento(0, 0, "Internação", 1, "Rua dos Louros, 5", "2020/05/03", "09:00");
		boolean esperado = false;
		IMedico medico = new Medico();
				
		when(mockMedico.ValidaDataPorEndereco(medico)).thenReturn(true);
				
		//Act
		boolean resultado = agendar.ValidaDataPorEndereco(medico);

        //Assert
        assertEquals(resultado, esperado);
	}
	
	@Test
	public void ValidaConsulta() {
		//Arrange
		IMedico mockMedico = mock(IMedico.class);
		Agendamento agendar = new Agendamento(0, 0, "Consulta", 1, "Rua das Flores, 10", "2020/05/30", "13:00");
		boolean esperado = true;
		IMedico medico = new Medico();
				
		when(mockMedico.ValidaHoraPorData(medico)).thenReturn(true);
				
		//Act
		boolean resultado = agendar.ValidaHoraPorData(medico);

        //Assert
        assertEquals(resultado, esperado);
	}
	
	@Test
	public void ValidaCarteirinha() {
		//Arrange
		Agendamento agendar = new Agendamento();
		Funcionario funcionario = new Funcionario(1, "André Esteves", "Completo");
		String esperado = "ID:" + funcionario.getIdFuncionario() + "\n" + "Nome:" + funcionario.getNomeFuncionario() 
		+ "\n" + "Possui plano?" + funcionario.planoTipo;
		
								
		//Act
		String resultado = agendar.carteirinhaFuncionario(1, "André Esteves", "Completo");
		
		//Assert
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void ValidaCoberturaConsulta() {
		Agendamento agendar = new Agendamento(0, 0, "Consulta", 1, "Rua das Flores, 10", "2020/05/23", "14:00");
		boolean esperado = false;
		Funcionario funcionario = new Funcionario(2, "Maria da Conceição", "Exame");
				
		//Act
		boolean resultado = agendar.ValidaCobertura(funcionario.planoTipo);
		
		//Assert
		assertEquals(resultado, esperado);
	}
}