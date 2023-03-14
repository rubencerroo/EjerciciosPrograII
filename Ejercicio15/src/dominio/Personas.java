package dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import dominio.Persona;
import aplicacion.Main;

public class Personas {
    private ArrayList<Persona> listaPersonas;

    public Personas() {
        listaPersonas = new ArrayList<>();
    }

    public void annadirPersona(Persona persona) {
        listaPersonas.add(persona);
    }

    public Persona elMasJoven() {
        return listaPersonas.stream()
                            .min(Comparator.comparing(Persona::getFechaDeNacimiento).reversed())
                            .orElse(null);
    }

    public long calcularSumaEdades() {
        return listaPersonas.stream()
                            .mapToLong(Persona::calcularEdad)
                            .sum();
    }

    public long calcularEdadMinima() {
        return listaPersonas.stream()
                            .mapToLong(Persona::calcularEdad)
                            .min()
                            .orElse(0);
    }

    public double calcularMediaDeEdad() {
        return listaPersonas.stream()
                            .mapToLong(Persona::calcularEdad)
                            .average()
                            .orElse(0);
    }
}

