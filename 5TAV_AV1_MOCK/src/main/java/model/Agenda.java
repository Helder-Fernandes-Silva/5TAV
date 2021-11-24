package model;

import java.util.LinkedList;

public class Agenda {
	
	Medico medicos = new Medico();
   
    
    LinkedList<String> horario = new LinkedList<String>();
    Endereco endereco = new Endereco();
    DateTime data = new DateTime("2022/05/30", horario);
    
    Medico AddAgenda() {
         
       
        data.AddHora("09:00");
        data.AddHora("15:00");
        
        
        endereco.adicionarEnderecos("Rua das Flores, 10", data);
        medicos.adicionarMedico(1, "Antônio Carlos", "Cardiologista", endereco);
		
        return medicos;
    }
    
    DateTime getData() {
    	return data;
    }
    
    Endereco getEndereco() {
    	return endereco; 
    }
}
