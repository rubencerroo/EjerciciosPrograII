package main;

import dominio.Matematicas;
import java.util.*;

public class Main {
	
	    public static void main(String[] args) {
	        int n = 9;
	        System.out.println("Suma de 0 a " + n + ": " + Matematicas.sumaNumeros(n));
	        System.out.println("Factorial de " + n + ": " + Matematicas.factorial(n));
	        int base = 2;
	        int exponente = 10;
	        System.out.println(base + " elevado a " + exponente + ": " + Matematicas.potencia(base, exponente));
	        List<Integer> lista = List.of(1, 2, 3, 4, 5);
	        int suma = Matematicas.sumaLista(lista, lista.size() - 1);
	        System.out.println("Suma de los elementos de la lista: " + suma);
	        double media = Matematicas.mediaAritmetica(lista, lista.size() - 1);
	        System.out.println("Media aritmética de la lista: " + media);
	        double desviacionTipica = Matematicas.desviacionTipica(lista, 0, media, 0);
	        System.out.println("Desviación típica: " + desviacionTipica);
	        int resultado = Matematicas.sumaPares(n);
	        System.out.println("La suma de los primeros " + n + " números pares es " + resultado);
	        int resultado2 = Matematicas.sumaParesLista(lista);
	        System.out.println("La suma de los elementos pares de la lista es " + resultado2);
	        List<Integer> resultado3 = Matematicas.obtenerListaPar(lista);
	        System.out.println("La lista de números pares es " + resultado3);
	        List<Integer> resultado4 = Matematicas.listaPar(n);
	        System.out.println("La lista de los primeros números pares hasta " + n + " es " + resultado4);
	        List<Integer> lista1 = List.of(1, 2, 3);
	        List<Integer> lista2 = List.of(2, 4, 6);
	        System.out.println("El Prducto escalar de la lista1 y la lista2 es: "+ Matematicas.calcularProductoEscalar(lista1, lista2));
	        System.out.println("El elemento n-ésimo(n=9) es: " + 	Matematicas.fibonacci(n));
	        n = 13;
	        double cociente = (double) Matematicas.fibonacci(n) / Matematicas.fibonacci(n - 1);
	        double goldenRatio = (1 + Math.sqrt(5)) / 2;
	        System.out.println("Cociente: " + cociente);
	        System.out.println("Relación dorada: " + goldenRatio);
	        System.out.println("Iguales? " + (cociente == goldenRatio));
	        
	    }
	}


