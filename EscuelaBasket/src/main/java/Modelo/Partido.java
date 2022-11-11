package Modelo;

public class Partido {

    private String marcador, arbitro, equipoContr;
    private Integer valorArbitraje;

    public Partido() {
    }

    public Partido(String marcador, String arbitro, String equipoContr, Integer valorArbitraje) {
        this.marcador = marcador;
        this.arbitro = arbitro;
        this.equipoContr = equipoContr;
        this.valorArbitraje = valorArbitraje;
    }

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }

    public String getArbitro() {
        return arbitro;
    }

    public void setArbitro(String arbitro) {
        this.arbitro = arbitro;
    }

    public String getEquipoContr() {
        return equipoContr;
    }

    public void setEquipoContr(String equipoContr) {
        this.equipoContr = equipoContr;
    }

    public Integer getValorArbitraje() {
        return valorArbitraje;
    }

    public void setValorArbitraje(Integer valorArbitraje) {
        this.valorArbitraje = valorArbitraje;
    }

    @Override
    public String toString() {
        return "Partido{" + "marcador=" + marcador + ", arbitro=" + arbitro + ", equipoContr=" + equipoContr + ", valorArbitraje=" + valorArbitraje + '}';
    }

}
