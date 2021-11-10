package faeterj.tav;

public class Funcionario {
	public int idFuncionario;
	public String nomeFuncionario;
	public boolean possuiPlano;
	
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public boolean isPossuiPlano() {
		return possuiPlano;
	}
	public void setPossuiPlano(boolean possuiPlano) {
		this.possuiPlano = possuiPlano;
	}
	
	public String planoFuncionario (int idFuncionario, String nomeFuncionario, boolean possuiPlano) {
		int id = idFuncionario;
		String nome = nomeFuncionario;
		String temPlano;
		
		if (possuiPlano == true) { // verificando se o funcion�rio se encontra como benefici�rio do plano de sa�de
			temPlano = "Sim";
		} else {
			temPlano = "N�o";
		}
		return "ID:" + id + "\n" + "Nome:" + nome + "\n" + "Possui plano: " + temPlano;
	}	
}
