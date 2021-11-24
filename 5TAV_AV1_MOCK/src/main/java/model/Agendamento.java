package model;

import interfaces.IMedico;

public class Agendamento {
	public int id;
	public int idFuncionario;
	public int CRM;
	public String endereco;
	public String data;
	public String hora;
	String tipo;
	
	public Agendamento() {};
	
	public Agendamento (int _id, int _idFuncionario, String _tipo, int _CRM, String _endereco, String _data, String _hora) {
		id = _id;
		idFuncionario = _idFuncionario;
		CRM = _CRM;
		endereco = _endereco;
		data = _data;
		hora = _hora;
		tipo = _tipo;
	}
	
	public String carteirinhaFuncionario (int _idFuncionario, String _nomeFuncionario, String _possuiPlano) {
		return "ID:" + _idFuncionario + "\n" + "Nome:" + _nomeFuncionario + "\n" + "Possui plano?" + _possuiPlano;
	}	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public int getCRM() {
		return CRM;
	}

	public void setCRM(int cRM) {
		CRM = cRM;
	}
	
	Agenda agendar = new Agenda();
	Medico medico = new Medico();
	Endereco enderecos = new Endereco();	
    DateTime dataAg = new DateTime();
	
	public boolean ValidaCRM(IMedico medico) {
		medico = agendar.AddAgenda();
		boolean retVal = true;
		 for(Medico m : medico.getMedicos()) {
	        	if(!m.getCRM().equals(CRM) || medico == null) {
	        		retVal = false;
	        		break;
	        	}
		 }
		 return retVal;
	}
	
	public boolean ValidaEndereco(IMedico medico) {
		medico = agendar.AddAgenda();
        enderecos = agendar.getEndereco();
        
		boolean retVal = true;
		 for(Medico m : medico.getMedicos()) {
	        	if(m.getCRM().equals(CRM)){
	        		for(Endereco e: enderecos.getEnderecos()) {
	        			if(!e.getEnderecoadd().equals(endereco)) {
	        				retVal = false;
	        				break;
	        			}
	        	}
	        	}
		 }
		 return retVal;
	}
	
	public boolean ValidaDataPorEndereco(IMedico medico) {
		medico = agendar.AddAgenda();
        enderecos = agendar.getEndereco();
        dataAg = agendar.getData();
        
		boolean retVal = true;
		for(Medico m : medico.getMedicos()) {
        	if(m.getCRM().equals(CRM)) {
        		for(Endereco e: enderecos.getEnderecos()) {
        			if(e.getEnderecoadd().equals(endereco)) {
        				if(!dataAg.getData().equals(data)) {
        						retVal = false;
        						break;
	        			}
        			}
        		}
        	}
		}
    	return retVal;
	}
	
	public boolean ValidaHoraPorData(IMedico medico) {
		medico = agendar.AddAgenda();
        enderecos = agendar.getEndereco();
        dataAg = agendar.getData();
        
        boolean retVal;
        retVal = true;
		for(Medico m : medico.getMedicos()) {
        	if(m.getCRM().equals(CRM)) {
        		for(Endereco e: enderecos.getEnderecos()) {
        			if(e.getEnderecoadd().equals(endereco)) {
        				if(dataAg.getData().equals(data)) {
        					for(String d : dataAg.getHora()) {
        						if(!d.equals(hora)) {
        							retVal = false;
        						}
        					}
        				}
        			}
        		}
        	}	
        }
		return retVal;
	}
	public boolean ValidaCobertura(String planoTipo) {
		boolean retVal = false;
		if(planoTipo.equals("Completo")) {
			retVal = true;
		} else {
			if (planoTipo.equals(tipo)) {
				retVal = true;
			}
		}
		return retVal;
	}
}
