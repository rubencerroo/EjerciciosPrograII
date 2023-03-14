package aplicacion;
import java.time.LocalDate;
import dominio.Persona;
import dominio.Personas;

public class Main {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Juan", LocalDate.of(1990, 5, 15));
        Persona persona2 = new Persona("María", LocalDate.of(1985, 3, 21));
        Persona persona3 = new Persona("Pedro", LocalDate.of(2000, 8, 10));
        Persona persona4 = new Persona("Ana", LocalDate.of(1995, 1, 1));

       
        Personas listaPersonas = new Personas();
        listaPersonas.annadirPersona(persona1);
        listaPersonas.annadirPersona(persona2);
        listaPersonas.annadirPersona(persona3);
        listaPersonas.annadirPersona(persona4);

    
        Persona masJoven = listaPersonas.elMasJoven();
        System.out.println("La persona más joven es " + masJoven.getNombre());

       
        long sumaEdades = listaPersonas.calcularSumaEdades();
        System.out.println("La suma de las edades es " + sumaEdades);

       
        long edadMinima = listaPersonas.calcularEdadMinima();
        System.out.println("La edad mínima es " + edadMinima);

        
        double mediaEdades = listaPersonas.calcularMediaDeEdad();
        System.out.println("La media de las edades es " + mediaEdades);
    }
}
