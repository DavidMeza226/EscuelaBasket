package Modelo;

import java.util.Calendar;

public class Auxiliar extends Trabajador {

    public Auxiliar() {
    }

    public Auxiliar(String nombre, String apellido, String id, String direccion, String telefono, String fechaNacimiento, String genero, Integer salario) {
        super(nombre, apellido, id, direccion, telefono, fechaNacimiento, genero, salario);
    }

    @Override
    public int calcularEdad() {
        return super.calcularEdad(); //To change body of generated methods, choose Tools | Templates.
    }

    public void mostrarDatos() {

        System.out.println("Auxiliar;" + "nombre=" + getNombre() + ", apellido=" + getApellido() + ", id=" + getId() + ", direccion=" + getDireccion() + ", telefono=" + getTelefono() + ", fechaNacimiento=" + getFechaNacimiento() + ", genero=" + getGenero() + ", salario=" + getSalario());

    }

    public void validarCondiciones() {

        if (calcularEdad() >= 25 && getGenero().equals("Mujer")) {
            System.out.println("Promovida a Administradora");
        } else {
            System.out.println("Sigue como Auxiliar");
        }

    }

}
