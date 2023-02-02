package main;

import java.math.*;
import java.util.*;

public class Main {
	
	    public static void main(String[] args) {
	        int n = 9;
	        System.out.println("Suma de 0 a " + n + ": " + sumaNumeros(n));
	        System.out.println("Factorial de " + n + ": " + factorial(n));
	        int base = 2;
	        int exponente = 10;
	        System.out.println(base + " elevado a " + exponente + ": " + potencia(base, exponente));
	        List<Integer> lista = List.of(1, 2, 3, 4, 5);
	        int suma = sumaLista(lista, lista.size() - 1);
	        System.out.println("Suma de los elementos de la lista: " + suma);
	        double media = mediaAritmetica(lista, lista.size() - 1);
	        System.out.println("Media aritmética de la lista: " + media);
	        double desviacionTipica = desviacionTipica(lista, 0, media, 0);
	        System.out.println("Desviación típica: " + desviacionTipica);
	        int resultado = sumaPares(n);
	        System.out.println("La suma de los primeros " + n + " números pares es " + resultado);
	        int resultado2 = sumaParesLista(lista);
	        System.out.println("La suma de los elementos pares de la lista es " + resultado2);
	        List<Integer> resultado3 = obtenerListaPar(lista);
	        System.out.println("La lista de números pares es " + resultado3);
	        List<Integer> resultado4 = listaPar(n);
	        System.out.println("La lista de los primeros números pares hasta " + n + " es " + resultado4);
	        List<Integer> lista1 = List.of(1, 2, 3);
	        List<Integer> lista2 = List.of(2, 4, 6);
	        System.out.println("El Prducto escalar de la lista1 y la lista2 es: "+ calcularProductoEscalar(lista1, lista2));
	        System.out.println("El elemento n-ésimo(n=9) es: " + 	fibonacci(n));
	        n = 13;
	        double cociente = (double) fibonacci(n) / fibonacci(n - 1);
	        double goldenRatio = (1 + Math.sqrt(5)) / 2;
	        System.out.println("Cociente: " + cociente);
	        System.out.println("Relación dorada: " + goldenRatio);
	        System.out.println("Iguales? " + (cociente == goldenRatio));
	        
	    }


	
	public static int sumaNumeros(int n) {
	    if (n == 0) {
	        return 0;
	    }
	    return n + sumaNumeros(n - 1);
	}
	public static int factorial(int n) {
	    if (n == 0) {
	        return 1;
	    }
	    return n * factorial(n - 1);
	}
	public static int potencia(int base, int exponente) {
	    if (exponente == 0) {
	        return 1;
	    }
	    return base * potencia(base, exponente - 1);
	}
	 private static int sumaLista(List<Integer> lista, int index) {
		    if (index < 0) {
		      return 0;
		    }
		    return lista.get(index) + sumaLista(lista, index - 1);
		  }
	 private static double mediaAritmetica(List<Integer> lista, int index) {
		    if (index < 0) {
		      return 0;
		    }
		    return (sumaLista(lista, index) + mediaAritmetica(lista, index - 1)) / (index + 1);
		  }
	public static double desviacionTipica(List<Integer> lista, int indice, double media, double sumaDesviaciones) {
	    if (indice == lista.size() - 1) {
	        return Math.sqrt((sumaDesviaciones + Math.pow(lista.get(indice) - media, 2)) / (lista.size() - 1));
	    }
	    return desviacionTipica(lista, indice + 1, media, sumaDesviaciones + Math.pow(lista.get(indice) - media, 2));
	}
	public static int sumaPares(int n) {
		  int sum = 0;
		  for (int i = 2; i <= n; i += 2) {
		    sum += i;
		  }
		  return sum;
		}
	public static int sumaParesLista(List<Integer> lista) {
		  int sum = 0;
		  for (int num : lista) {
		    if (num % 2 == 0) {
		      sum += num;
		    }
		  }
		  return sum;
		}
	public static List<Integer> obtenerListaPar(List<Integer> lista) {
		  List<Integer> resultado = new ArrayList<>();
		  for (int num : lista) {
		    if (num >= 2 && num % 2 == 0) {
		      resultado.add(num);
		    }
		  }
		  return resultado;
		}
	public static List<Integer> listaPar(int n) {
		  List<Integer> resultado = new ArrayList<>();
		  for (int i = n; i >= 2; i -= 2) {
		    resultado.add(i-1);
		  }
		  return resultado;
		}
	  public static int calcularProductoEscalar(List<Integer> lista1, List<Integer> lista2) {
		    int resultado = 0;
		    for (int i = 0; i < lista1.size(); i++) {
		      resultado += lista1.get(i) * lista2.get(i);
		    }
		    return resultado;
		  }
	  public static int fibonacci(int n) {
		    if (n <= 1) {
		      return n;
		    }
		    int prev = 0;
		    int curr = 1;
		    for (int i = 2; i <= n; i++) {
		      int sum = prev + curr;
		      prev = curr;
		      curr = sum;
		    }
		    return curr;
		  }
}
	


