package dominio;

import java.util.List;
import java.util.stream.Collectors;

public class Matematicas {

  
    public static List<Double> obtenerCuadrados(List<Double> numeros) {
        return numeros.stream()
                      .map(num -> num * num)
                      .collect(Collectors.toList());
    }
    
    
    public static double obtenerSuma(List<Double> numeros) {
        return numeros.stream()
                      .mapToDouble(Double::doubleValue)
                      .sum();
    }
    
    
    public static int obtenerSumaPares(List<Integer> numeros) {
        return numeros.stream()
                      .filter(num -> num % 2 == 0)
                      .mapToInt(Integer::intValue)
                      .sum();
    }
    
    
    public static List<Integer> obtenerNumerosPares(List<Integer> numeros) {
        return numeros.stream()
                      .filter(num -> num % 2 == 0)
                      .collect(Collectors.toList());
    }
    
    
    public static double obtenerMedia(List<Double> numeros) {
        return numeros.stream()
                      .mapToDouble(Double::doubleValue)
                      .average()
                      .orElse(Double.NaN);
    }
    
    
    public static double obtenerDesviacionTipica(List<Double> numeros) {
        double media = obtenerMedia(numeros);
        double sum = numeros.stream()
                            .mapToDouble(num -> Math.pow(num - media, 2))
                            .sum();
        return Math.sqrt(sum / numeros.size());
    }
    

    public static double obtenerMinimo(List<Double> numeros) {
        return numeros.stream()
                      .mapToDouble(Double::doubleValue)
                      .min()
                      .orElse(Double.NaN);
    }
    
    
    public static List<String> aMinusculas(List<String> lista) {
        return lista.stream()
                    .map(String::toLowerCase)
                    .collect(Collectors.toList());
    }
    
   
    public static String concatenarCadenas(List<String> al) {
        return al.stream()
                 .reduce("", (cadena, elemento) -> cadena + elemento);
    }

    public static List<String> transformarAMinusculas(List<String> al) {
        return al.stream()
                 .map(String::toLowerCase)                                      //Diferncia con aMinusculas ??
                 .collect(Collectors.toList());
    }
    
    
    public static List<String> noEmpiezaPorA(List<String> al) {
        return al.stream()
                 .filter(s -> !s.startsWith("A"))
                 .collect(Collectors.toList());
    }
    
    
    public static List<Integer> por2MayorQue6(List<Integer> lista) {
        return lista.stream()
                    .map(n -> n * 2)
                    .filter(n -> n > 6)
                    .collect(Collectors.toList());
    }
}

