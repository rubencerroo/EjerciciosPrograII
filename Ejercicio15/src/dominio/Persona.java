package dominio;

import java.time.LocalDate;
import java.time.Period;


import dominio.Personas;
import aplicacion.Main;


public class Persona {
    private String nombre;
    private LocalDate fechaDeNacimiento;

    public Persona(String nombre, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public long calcularEdad() {
        LocalDate ahora = LocalDate.now();
        return fechaDeNacimiento.until(ahora).getYears();
    }

}
