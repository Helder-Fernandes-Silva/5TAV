package av2.tav.item2.models;



public class CompraPassagens {
	
private Double valorTotal;
	
	public Integer paradaSaida(Onibus onibus, Rota rota, Passageiro passageiro) {
		if(passageiro.getDestino() != rota.getDestino()) {
			for(String p : rota.getNomeParadas()) {
				if(passageiro.getDestino().equals(p)) {
					onibus.getPassageiros().remove(passageiro);
				}
			}
		}
		return onibus.getPassageiros().size();
	}
	
	public Double venderPassagem (Passageiro passageiro, Onibus onibus, Rota rota) {
		
		if (onibus.getLugares() > onibus.getPassageiros().size()) {
			if (onibus.getTipo() == "Leito") {
				valorTotal = rota.getKm() * 0.7;
			} else if (onibus.getTipo() == "Semi Leito") {
				valorTotal = rota.getKm() * 0.45;
			} else {
				valorTotal = rota.getKm() * 0.50;
			}
			if (rota.getTrajeto() == "C") {
				valorTotal *= 0.95;
			}
			return valorTotal;
		} else {
			return 0.0;
		}
	}

}
