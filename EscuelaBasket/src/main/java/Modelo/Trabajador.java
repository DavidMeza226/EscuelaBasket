package Modelo;

import java.util.Calendar;

public class Trabajador extends Persona {

    private Integer salario;

    public Trabajador() {
    }

    public Trabajador(String nombre, String apellido, String id, String direccion, String telefono, String fechaNacimiento, String genero, Integer salario) {
        super(nombre, apellido, id, direccion, telefono, fechaNacimiento, genero);
        this.salario = salario;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public void mostrarDatos() {

        System.out.println("Trabajador(a){" + "nombre=" + getNombre() + ", apellido=" + getApellido() + ", id=" + getId() + ", direccion=" + getDireccion() + ", telefono=" + getTelefono() + ", fechaNacimiento=" + getFechaNacimiento() + ", genero=" + getGenero() + ", salario=" + salario);

    }

}
