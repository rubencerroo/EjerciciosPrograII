package aplicacion;

import java.util.Arrays;
import java.util.List;

import dominio.Matematicas;
                               
public class Main {

    public static void main(String[] args) {

                
        
        List<Double> numeros = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Integer> numerosEnteros = Arrays.asList(1, 2, 3, 4, 5);
        List<String> cadenas = Arrays.asList("Hola", "Adios", "Prueba", "Java");
        System.out.println("Lista numeros:" + numeros);
        System.out.println("Lista numeros enteros:" + numerosEnteros);
        System.out.println("Lista cadenas:" + cadenas);


        
        List<Double> cuadrados = Matematicas.obtenerCuadrados(numeros);
        System.out.println("Cuadrados: " + cuadrados);
        
       
        double suma = Matematicas.obtenerSuma(numeros);
        System.out.println("Suma: " + suma);
        
        
        int sumaPares = Matematicas.obtenerSumaPares(numerosEnteros);
        System.out.println("Suma de pares: " + sumaPares);
        
       
        List<Integer> numerosPares = Matematicas.obtenerNumerosPares(numerosEnteros);
        System.out.println("Numeros pares: " + numerosPares);
        
        
        double media = Matematicas.obtenerMedia(numeros);
        System.out.println("Media: " + media);
        
        
        double desviacion = Matematicas.obtenerDesviacionTipica(numeros);
        System.out.println("Desviación típica: " + desviacion);
        
       
        double minimo = Matematicas.obtenerMinimo(numeros);
        System.out.println("Mínimo: " + minimo);
        
       
        List<String> cadenasMinusculas = Matematicas.aMinusculas(cadenas);
        System.out.println("Cadenas en minúsculas: " + cadenasMinusculas);
        
       
        String concatenacion = Matematicas.concatenarCadenas(cadenas);
        System.out.println("Concatenación: " + concatenacion);

        /* List<String> lista1Minusculas = Matematicas.transformarAMinusculas(cadenas);
        System.out.println("Lista a minúsculas: " + lista1Minusculas); */ // Diferencia con aMinusculas?
        
        
        List<String> lista1SinA = Matematicas.noEmpiezaPorA(cadenas);
        System.out.println("Lista sin palabras que empiezan por A: " + lista1SinA);
        
        
        List<Integer> lista2Por2MayorQue6 = Matematicas.por2MayorQue6(numerosEnteros);
        System.out.println("Lista de números multiplicados por 2 y mayores que 6: " + lista2Por2MayorQue6);
    }

}
