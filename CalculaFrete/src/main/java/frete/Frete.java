package frete;

public class Frete {
	
	public double CalculaFreteNacional(String cep) {
		if (Integer.parseInt(cep) >= 20000 && Integer.parseInt(cep) < 30000) {
			return 10.0;
		}else if (Integer.parseInt(cep) >= 10000 && Integer.parseInt(cep) < 20000) {
			return 12.0;
		}else {
			return 15.0;
		}
	}
	
	public double CalculaFreteIntl(String pais) {
		if (pais == "US") {
			return 15.0;
		}
		else {
			return 20.0;
		}
	}
}
