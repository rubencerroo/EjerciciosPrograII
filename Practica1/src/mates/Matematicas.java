package mates;
import java.util.*;
public class Matematicas {
	  /**
	   * Genera una aproximación al número pi mediante el método de Montecarlo.
	   * El parámetro ‘pasos‘ indica el número de puntos generado.
	   */
	  public static double generarNumeroPi(long pasos) {
	    int aciertos = 0;
	    double areaCuadrado = 4;
	    Random rand = new Random();
	    
	    for (int i = 0; i < pasos; i++) {
	      double x = rand.nextDouble() * 2 - 1;
	      double y = rand.nextDouble() * 2 - 1;
	      if (x * x + y * y <= 1) {
	        aciertos++;
	      }
	    }
	    
	    return areaCuadrado * (aciertos / (double) pasos);
	  }
	}

