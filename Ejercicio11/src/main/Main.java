package main;

import dominio.Matematicas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("La suma de los primeros " + n + " numeros naturales es: " + Matematicas.sumaNaturales(n));

        int m = 4;
        System.out.println("El factorial de " + m + " es: " + Matematicas.factorial(m));

        int base = 2;
        int exponente = 3;
        System.out.println(base + " elevado a la " + exponente + " es: " + Matematicas.potencia(base, exponente));

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("La suma de los numeros " + numeros + " es: " + Matematicas.sumaLista(numeros));
        System.out.println("La media de los numeros " + numeros + " es: " + Matematicas.mediaLista(numeros));
        System.out.println("La desviacion tipica de los numeros " + numeros + " es: " + Matematicas.desviacionTipica(numeros));

        int p = 9;
        System.out.println("La suma de los primeros numeros pares hasta " + p + " es: " + Matematicas.sumaPares(p));

        List<Integer> numerosPares = Arrays.asList(1, 2, 3, 4);
        System.out.println("La suma de los numeros pares de " + numerosPares + " es: " + Matematicas.sumaParesLista(numerosPares));
        System.out.println("La lista de numeros pares hasta " + p + " es: " + Matematicas.listaPares(p));

        List<Integer> listaNumeros = Arrays.asList(1, 2, 6, 11);
        System.out.println("La lista de numeros pares de " + listaNumeros + " es: " + Matematicas.obtenerListaPares(listaNumeros));

        List<Integer> lista1 = Arrays.asList(1, 2, 3);
        List<Integer> lista2 = Arrays.asList(2, 4, 6);
        System.out.println("El producto escalar de " + lista1 + " y " + lista2 + " es: " + Matematicas.calcularProductoEscalar(lista1, lista2));
    }
}
