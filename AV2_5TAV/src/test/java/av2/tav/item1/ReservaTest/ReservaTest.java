 package av2.tav.item1.ReservaTest;

import static org.junit.Assert.*;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import av2.tav.item1.reserva.Reserva;

public class ReservaTest {

	@Test
	public void testOnibusCheio() {
		// Arrange
				Reserva onibusCheio = new Reserva();
				int qtdPassageiros = 23;
				boolean esperado = true;
				
				// Act
				boolean resultado = onibusCheio.estaCheio(qtdPassageiros);
				
				// Assert
				Assert.assertEquals(esperado, resultado);
	}
	
	@Test
	public void testOnibusVazio() {
		// Arrange
				Reserva onibusVazio = new Reserva();
				int qtdPassageiros = 25;
				boolean esperado = true;
				
				// Act
				boolean resultado = onibusVazio.estaVazio(qtdPassageiros);
				
				// Assert
				Assert.assertEquals(esperado, resultado);
	}
	
	@Test
	public void testDestino() {
		// Arrange
				Reserva destino = new Reserva();
				String destinoViagem = "S�o Paulo";
				boolean esperado = true;
				
				// Act
				boolean resultado = destino.destinoViagem(destinoViagem);
				
				// Assert
				Assert.assertEquals(esperado, resultado);
	}
	
	@Test
	public void testDestinoErrado() {
		// Arrange
				Reserva destino = new Reserva();
				String destinoViagem = "Minas Gerais";
				boolean esperado = false;
				
				// Act
				boolean resultado = destino.destinoViagem(destinoViagem);
				
				// Assert
				Assert.assertEquals(esperado, resultado);// para dar um teste falso
	}
	
	@Test
	public void testTamOnibusDestinoGrande() {
		// Arrange
				Reserva tamOnibusDestino = new Reserva();
				String destinoViagem = "S�o Paulo";
				int tamOnibus = 32;
				boolean esperado = true;
				
				// Act
				boolean resultado = tamOnibusDestino.capOnibus(destinoViagem, tamOnibus);
				
				// Assert
				Assert.assertEquals(esperado, resultado);
	}
	
	@Test
	public void testTamOnibusMedioDestino() {
		// Arrange
				Reserva tamOnibusDestino = new Reserva();
				String destinoViagem = "Campos";
				int tamOnibus = 24;
				boolean esperado = false;
				
				// Act
				boolean resultado = tamOnibusDestino.capOnibus(destinoViagem, tamOnibus);
				
				// Assert
				System.out.println("�nibus n�o est� completamente cheio.");
				Assert.assertEquals(esperado, resultado);// para dar um teste falso	
	}
	
	@Test
	public void testTipoOnibus() {
		// Arrange
				Reserva tipoOnibus = new Reserva();
				int estiloOnibus = 1;
				String esperado = "tipo leito";
				
				// Act
				String resultado = tipoOnibus.tipoOnibus(estiloOnibus);
				
				// Assert
				Assert.assertEquals(esperado, resultado);
				System.out.println("�nibus " + esperado);
	}
	
	@Test
	public void testMelhorOnibus() {
		// Arrange
				Reserva tipoOnibus = new Reserva();
				String destino = "Natal";
				int qtPassageiro = 30;
				String esperado = "tipo leito";
				
				// Act
				String resultado = tipoOnibus.melhorOnibus(destino, qtPassageiro);
				
				// Assert
				Assert.assertEquals(esperado, resultado);
				System.out.println("O melhor �nibus para viajar a " + destino + " � o " + esperado);
	}
}
