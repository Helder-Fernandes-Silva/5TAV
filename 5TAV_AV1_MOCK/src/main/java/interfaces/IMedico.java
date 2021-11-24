package interfaces;

import model.Medico;

public interface IMedico {
	public boolean ValidaCRM (IMedico medico);
	public boolean ValidaEndereco(IMedico medico);
	public boolean ValidaDataPorEndereco(IMedico medico);
	public boolean ValidaHoraPorData(IMedico medico);
}
