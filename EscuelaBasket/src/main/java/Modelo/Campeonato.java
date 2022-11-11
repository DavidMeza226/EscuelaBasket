package Modelo;

public class Campeonato {

    private Integer nCampeonato;
    private String fecha;
    private String hInicio, hFin;
    private String lugar;
    private Partido partido;

    public Campeonato() {
    }

    public Campeonato(Integer nCampeonato, String fecha, String hInicio, String hFin, String lugar, Partido partido) {
        this.nCampeonato = nCampeonato;
        this.fecha = fecha;
        this.hInicio = hInicio;
        this.hFin = hFin;
        this.lugar = lugar;
        this.partido = partido;
    }

    public Integer getnCampeonato() {
        return nCampeonato;
    }

    public void setnCampeonato(Integer nCampeonato) {
        this.nCampeonato = nCampeonato;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String gethInicio() {
        return hInicio;
    }

    public void sethInicio(String hInicio) {
        this.hInicio = hInicio;
    }

    public String gethFin() {
        return hFin;
    }

    public void sethFin(String hFin) {
        this.hFin = hFin;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    @Override
    public String toString() {
        return "Campeonato{" + "nCampeonato=" + nCampeonato + ", fecha=" + fecha + ", hInicio=" + hInicio + ", hFin=" + hFin + ", lugar=" + lugar + ", partido=" + partido + '}';
    }

}
