package Modelo;

import java.util.Calendar;

public class Estudiante extends Persona {

    private Seguro seguro;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String id, String direccion, String telefono, String fechaNacimiento, String genero, Seguro seguro) {
        super(nombre, apellido, id, direccion, telefono, fechaNacimiento, genero);
        this.seguro = seguro;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    @Override
    public int calcularEdad() {
        return super.calcularEdad(); //To change body of generated methods, choose Tools | Templates.
    }

    public void categoria() {

        if (calcularEdad() >= 5 && calcularEdad() < 10) {
            System.out.println("Categoria Infantil");
        }
        if (calcularEdad() >= 10 && calcularEdad() < 15) {
            System.out.println("Categoria Juvenil");
        }
        if (calcularEdad() >= 15 && calcularEdad() < 19) {
            System.out.println("Categoria Mayor");
        }

    }

    public void mostrarDatos() {

        System.out.println("Estudiante;" + "nombre=" + getNombre() + ", apellido=" + getApellido() + ", id=" + getId() + ", direccion=" + getDireccion() + ", telefono=" + getTelefono() + ", fechaNacimiento=" + getFechaNacimiento() + ", genero=" + getGenero() + ", seguro=" + seguro);

    }

}
