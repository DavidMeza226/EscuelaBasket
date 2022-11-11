package Modelo;

import java.util.Calendar;

public class Administradora extends Trabajador {

    public Administradora() {
    }

    public Administradora(String nombre, String apellido, String id, String direccion, String telefono, String fechaNacimiento, String genero, Integer salario) {
        super(nombre, apellido, id, direccion, telefono, fechaNacimiento, genero, salario);
    }

    public void mostrarDatos() {

        System.out.println("Auxiliar;" + "nombre=" + getNombre() + ", apellido=" + getApellido() + ", id=" + getId() + ", direccion=" + getDireccion() + ", telefono=" + getTelefono() + ", fechaNacimiento=" + getFechaNacimiento() + ", genero=" + getGenero() + ", salario=" + getSalario());

    }

}
