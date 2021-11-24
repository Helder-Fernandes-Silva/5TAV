package model;

import java.util.LinkedList;

public class Endereco {
    
    public String enderecoadd;
    public DateTime data;
    public LinkedList<String> hora;

    LinkedList<Endereco> endereco = new LinkedList<Endereco>();

    public Endereco() { 
    }

    public Endereco(String enderecoadd, DateTime data) {
        this.setEnderecoadd(enderecoadd);
        this.setData(data);
    }

    public void adicionarEnderecos(String enderecoadd, DateTime data) {
        this.endereco.add(new Endereco(enderecoadd, data));
        setEnderecoadd(enderecoadd);
        setData(data);
    }

    public LinkedList<Endereco> getEnderecos() {
        return this.endereco;
    }

    public String toString() {
        return String.format("Endereços: %s\n%s", getEnderecoadd(), getData());
    }

    public String getEnderecoadd() {
        return this.enderecoadd;
    }

    public DateTime getData() {
        return this.data;
    }

    public LinkedList<String> getHora() {
        return this.hora;
    }

    public void setEnderecoadd(String enderecoadd){
        this.enderecoadd = enderecoadd; 
    }

    public void setData(DateTime data){
        this.data = data;
    }

    public void setHora(LinkedList<String> hora) {
        this.hora = hora;
    }
}