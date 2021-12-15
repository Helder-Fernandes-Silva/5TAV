package av2.tav.item2.TesteIntegracao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import av2.tav.item2.models.CompraPassagens;
import av2.tav.item2.models.Onibus;
import av2.tav.item2.models.Passageiro;
import av2.tav.item2.models.Rota;


class CompraDePassagensTest {

	@Test
	public void validaCompra() {
		//Arrange
		
		Set<Passageiro> passageiros = new HashSet<Passageiro>(23);
		Onibus onibus = new Onibus();
		
		onibus.setLugares(23);
		onibus.setTipo("Leito");
		
		Passageiro passageiro = new Passageiro();
		
		passageiro.setCpf("114.115.131-13");
		passageiro.setNome("Maria");
		passageiro.setDestino("Minas Gerais");
		
		passageiros.add(passageiro);
		
		onibus.setPassageiros(passageiros);
		
		Rota rota = new Rota();
		
		Set<String> paradas = new HashSet <String>();
		paradas.add("São Lourenço");
		paradas.add("Sete Lagoas");
		paradas.add("Poços de Caldas");
		
		
		rota.setKm(530.7);
		rota.setTrajeto("C");
		rota.setParadas(3);
		rota.setDestino("Minas Gerais");
		rota.setNomeParadas(paradas);
		
		CompraPassagens compraPassagem = new CompraPassagens();
		
		Double esperado = (530.7 * 0.7) * 0.95;
		
		//Act
		var resultado = compraPassagem.venderPassagem(passageiro, onibus, rota);
		
		
		//Assert
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void saidaParada () {
		Set<Passageiro> passageiros = new HashSet<Passageiro>(28);
		Onibus onibus = new Onibus();
		
		onibus.setLugares(28);
		onibus.setTipo("Leito");
		
		Passageiro p = new Passageiro();
		
		
		p.setCpf("711.141.114-11");
		p.setNome("Maria");
		p.setDestino("Minas Gerais");
		
		
		passageiros.add(p);
		
		Passageiro p1 = new Passageiro();
		p1.setCpf("232.522.425-22");
		p1.setNome("José");
		p1.setDestino("São Paulo");
		
		passageiros.add(p1);
		
		Passageiro p2 = new Passageiro();
		p2.setCpf("743.142.533-58");
		p2.setNome("Carlos");
		p2.setDestino("Resende");
		
		passageiros.add(p2);
		
		onibus.setPassageiros(passageiros);
				
		Rota rota = new Rota();
		
		Set<String> paradas = new HashSet <String>();
		paradas.add("Que Luz");
		paradas.add("Resende");
		paradas.add("Graal");
		
		
		rota.setKm(530.7);
		rota.setTrajeto("C");
		rota.setParadas(3);
		rota.setDestino("São Paulo");
		rota.setNomeParadas(paradas);
		
		CompraPassagens validaSaida = new CompraPassagens();

		
		Integer esperado = 2;
		
		//Act
		var resultado = validaSaida.paradaSaida(onibus, rota, p2);
		

		//Assert
		assertEquals(resultado, esperado);

	}
	
	@Test
	public void validaEntrada() {
		//Arrange

		Set<Passageiro> passageiros = new HashSet<Passageiro>(2);
		Onibus onibus = new Onibus();

		onibus.setLugares(2);
		onibus.setTipo("Semi Leito");

		Passageiro passageiro = new Passageiro();
		Passageiro passageiro1 = new Passageiro();
		Passageiro passageiro2 = new Passageiro();

		passageiro.setCpf("141.571.577-12");
		passageiro.setNome("José");
		passageiro.setDestino("Bahia");

		passageiro1.setCpf("114.115.547-10");
		passageiro1.setNome("Maria");
		passageiro1.setDestino("Espírito Santo");
		
		passageiro2.setCpf("113.114.447-33");
		passageiro2.setNome("Miguel");
		passageiro2.setDestino("Vitória");
		
		passageiros.add(passageiro);
		passageiros.add(passageiro1);
		passageiros.add(passageiro2);


		onibus.setPassageiros(passageiros);

		Rota rota = new Rota();

		Set<String> paradas = new HashSet <String>();
		paradas.add("Volta Redonda");
		paradas.add("Resende");
		paradas.add("Graal");


		rota.setKm(530.7);
		rota.setTrajeto("C");
		rota.setParadas(3);
		rota.setDestino("São Paulo");
		rota.setNomeParadas(paradas);

		CompraPassagens compraPassagem = new CompraPassagens();

		Double esperado = 0.0;

		//Act
		var resultado = compraPassagem.venderPassagem(passageiro, onibus, rota);


		//Assert
		assertEquals(resultado, esperado);
	}
}
