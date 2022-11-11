package Controlador;

import Modelo.*;

public class Main {

    public static void main(String[] args) {

        Persona p = new Persona("David", "Meza", "1004966682", "av1", "322", "26/03/2000", "Hombre");

        System.out.println("" + p.toString());
        System.out.println("" + p.calcularEdad());

        Auxiliar ax = new Auxiliar("Oscar", "Caceres", "1005244156", "av1", "322", "26/02/2001", "Hombre", 2000000);

        ax.mostrarDatos();
        System.out.println("Edad: " + ax.calcularEdad());
        ax.validarCondiciones();

        Auxiliar ax1 = new Auxiliar("Oscar", "Caceres", "1005244156", "av1", "322", "26/02/2001", "Hombre", 2000000);

        ax1.mostrarDatos();
        System.out.println("Edad: " + ax1.calcularEdad());
        ax1.validarCondiciones();

        Trabajador t = new Trabajador("Oscar", "Caceres", "1005244156", "av1", "322", "26/02/2001", "Hombre", 2000000);

        t.mostrarDatos();
        System.out.println("Edad: " + t.calcularEdad());

        Profesor pr = new Profesor("Juan", "Rosas", "1005546211", "av1", "322", "15/06/1993", "Mujer", 2500000, "Matematica Aplicada");
        pr.mostrarDatos();
        System.out.println("Edad: " + pr.calcularEdad());

        Seguro s = new Seguro("10541", "NuevaEps.SAS", "gran colombia", "579", "Nueva EPS");
        Estudiante e = new Estudiante("David", "Meza", "1004966682", "av1", "322", "26/06/2012", "Hombre", s);

        e.mostrarDatos();
        System.out.println("Edad: " + e.calcularEdad());
        e.categoria();

        Partido pa = new Partido("3-0", "Daniel", "Rosas", 14000);
        Campeonato c = new Campeonato(1, "25/09/2022", "1:40 pm", "10 pm", "Ufps", pa);

        System.out.println("" + c.toString());

    }

}
