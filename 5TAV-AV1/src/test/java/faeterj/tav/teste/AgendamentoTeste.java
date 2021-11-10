package faeterj.tav.teste;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.Test;

import faeterj.tav.Agendamento;
import faeterj.tav.Medico;
import faeterj.tav.Funcionario;

public class AgendamentoTeste {

	//Testando a marca��o de consulta com o Oncologista
	@Test
	public void MarcarConsultaOncologista(){
		//Arrange
		Agendamento agendar = new Agendamento();
		String esperado = "Consulta marcada com sucesso!";
		
		LocalTime hora = LocalTime.of(10,0);
		LocalDate data = LocalDate.of(2021, 12, 15);
		
        Medico<String, String> doutor = Medico.Oncologista();

		//Act
		String resultado = agendar.Consulta(1, doutor.getKey(), doutor.getValue(), 1, hora, data);
		
		//Assert
		assertEquals(esperado, resultado);
	}
	
	//Testando a marca��o de consulta com o Ginecologista
	@Test
	public void MarcarConsultaGinecologista(){
		//Arrange
		Agendamento agendar = new Agendamento();
		String esperado = "Consulta marcada com sucesso!";
		
		LocalTime hora = LocalTime.of(15,0);
		LocalDate data = LocalDate.of(2022, 01, 10);
		
        Medico<String, String> doutor = Medico.Ginecologista();

		//Act
		String resultado = agendar.Consulta(2, doutor.getKey(), doutor.getValue(), 2, hora, data);
		
		//Assert
		assertEquals(esperado, resultado);
	}
	
	//Testando a marca��o de consulta com o Cardiologista
		@Test
		public void MarcarConsultaCardiologista(){
			//Arrange
			Agendamento agendar = new Agendamento();
			String esperado = "Consulta marcada com sucesso!";
			
			LocalTime hora = LocalTime.of(10,0);
			LocalDate data = LocalDate.of(2022, 03, 30);
			
	        Medico<String, String> doutor = Medico.Cardiologista();

			//Act
			String resultado = agendar.Consulta(1, doutor.getKey(), doutor.getValue(), 3, hora, data);
			
			//Assert
			assertEquals(esperado, resultado);
		}
		
		//Testando a marca��o de exame
		@Test
		public void MarcarExame() {
			//Arrange
			Agendamento agendar = new Agendamento();
			String esperado = "Exame marcado com sucesso!";
			
			LocalTime hora = LocalTime.of(8,0);
			LocalDate data = LocalDate.of(2021, 12, 5);
			
	        Medico<String, String> doutor = Medico.Laboratorio();

			//Act
			String resultado = agendar.Exame(1, doutor.getKey(), doutor.getValue(), 1, hora, data);
			
			//Assert
			assertEquals(esperado, resultado);
		}
		
		//Testando a marca��o de interna��o
		@Test
		public void MarcarInternacao() {
			//Arrange
			Agendamento agendar = new Agendamento();
			String esperado = "Interna��o realizada!";
					
			LocalTime hora = LocalTime.of(8,0);
			LocalDate data = LocalDate.of(2022, 8, 5);
					
	        Medico<String, String> doutor = Medico.Internacao();
	
			//Act
			String resultado = agendar.Internacao(1, doutor.getKey(), doutor.getValue(), 1, hora, data);
					
			//Assert
			assertEquals(esperado, resultado);
		}
		
		// Testando se funcion�rio tem acesso ao plano de sa�de
		@Test
		public void VerificarPlano() {
			//Arrange
			Funcionario Funcionario = new Funcionario();
			
			int id = 3;
			String nome = "Jos�";
			String temPlano = "Sim";
			
			// Dados gerais do funcion�rio
			String esperado = "ID:" + id + "\n" + "Nome:" + nome + "\n" + "Possui plano: " + temPlano;
									
			//Act
			String resultado = Funcionario.carteirinhaFuncionario(id, nome, true);
			
			//Assert
			assertEquals(esperado,resultado);
		}

}
