package model;

import java.util.List;

public class DateTime {
    public String data;
    public List<String> hora;

    public DateTime() {
    	
    }
    
    void AddHora(String hora) {
    	this.hora.add(hora);
    }
    
    public DateTime(String data, List<String> hora) {
        setData(data);
        setHora(hora);
    }

    public String toString() {
        return String.format("Data: %s\nHorário: %s", getData(), getHora());
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHora(List<String> hora) {
        this.hora = hora;
    }

    public List<String> getHora() {
        return this.hora;
    }

    public String getData() {
        return this.data;
    }
}
