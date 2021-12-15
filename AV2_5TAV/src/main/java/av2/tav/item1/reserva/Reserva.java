package av2.tav.item1.reserva;

public class Reserva {
	
	public boolean estaCheio(int passageiros) {
		if (passageiros == 23) {
			return true;
		}
		return false;
	}
	
	public boolean estaVazio(int passageiros) {
		if(passageiros < 28) {
			return true;
		}
		return false;
	}
	
	public boolean destinoViagem(String destino) {
		if(destino == "S�o Paulo" || destino == "Bahia") {
			return true;
		}
		return false;
	}
	
	public boolean capOnibus(String destino, int qtdPassageiros) {
		if (destino == "S�o Paulo" && qtdPassageiros == 32) {
			return true;
		}
		return false;
	}
	
	public boolean capOnibusMedio(String destino, int qtdPassageiros) {
		if (destino == "Campos" && qtdPassageiros == 28) {
			return true;
		}
		return false;
	}
	
	public String tipoOnibus(int tipo) {
		String onibus1 = "tipo leito";
		String onibus2 = "tipo semi leito";
		String onibus3 = "tipo executivo";
		
		if (tipo == 1) {
			return onibus1;
		}
		else {
			if (tipo == 2) {
				return onibus2;
			}
			else {
				return onibus3;
			}
		}
	}
	
	public String melhorOnibus(String destino, int qtdPassageiro) {
		String onibus1 = "tipo leito";
		String onibus2 = "tipo semi leito";
		String onibus3 = "tipo executivo";
		
		if (destino == "Porto Alegre" || destino == "Natal" && qtdPassageiro > 28) {
			return onibus1;
		}
		else {
			if (destino == "S�o Paulo" || destino == "Belo Horizonte" && qtdPassageiro == 28) {
				return onibus2;
			}
			else {
				return onibus3;
			}
		}
	}
}
