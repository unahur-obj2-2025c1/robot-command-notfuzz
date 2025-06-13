package me.gonzager.domain;

public class Habitacion {
    private Boolean luz = false;
    private Integer metrosCuadrados;

    public Integer getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public Habitacion(Integer metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public Boolean luzEstaPrendida(){
        return luz;
    }

    public void encenderLuz(){
        luz = true;
    }
    public void apagarLuz(){
        luz = false;
    }
}
