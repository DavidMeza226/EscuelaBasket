package Modelo;

public class Seguro {

    private String NIT, razonSocial, direccion, telefono, EPS;

    public Seguro() {
    }

    public Seguro(String NIT, String razonSocial, String direccion, String telefono, String EPS) {
        this.NIT = NIT;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.telefono = telefono;
        this.EPS = EPS;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEPS() {
        return EPS;
    }

    public void setEPS(String EPS) {
        this.EPS = EPS;
    }

    @Override
    public String toString() {
        return "Seguro{" + "NIT=" + NIT + ", razonSocial=" + razonSocial + ", direccion=" + direccion + ", telefono=" + telefono + ", EPS=" + EPS + '}';
    }

}
