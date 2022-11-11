package Modelo;

import java.util.Calendar;

public class Responsable extends Persona {

    private String email;

    public Responsable() {
    }

    public Responsable(String nombre, String apellido, String id, String direccion, String telefono, String fechaNacimiento, String genero, String email) {
        super(nombre, apellido, id, direccion, telefono, fechaNacimiento, genero);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void mostrarDatos() {

        System.out.println("Padre Responsable;" + "nombre=" + getNombre() + ", apellido=" + getApellido() + ", id=" + getId() + ", direccion=" + getDireccion() + ", telefono=" + getTelefono() + ", fechaNacimiento=" + getFechaNacimiento() + ", genero=" + getGenero() + ", email=" + email);

    }

}
