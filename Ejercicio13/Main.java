import java.util.*;
import java.util.stream.DoubleStream;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Limite inferior:");
    double limInf = sc.nextDouble();
    System.out.println("Limite superior:");
    double limSup = sc.nextDouble();
    System.out.println("Paso:");
    double paso = sc.nextDouble();

      double integral = integralEXCuadrado(limInf, limSup, paso);

      System.out.println("La integral de e^x^2 desde " + limInf + " hasta " + limSup + " con un paso de " + paso + " es: " + integral);
  }

  public static double integralEXCuadrado(double limInf, double limSup, double paso) {
      return DoubleStream.iterate(limInf, x -> x + paso)
              .limit((long) ((limSup - limInf) / paso))
              .map(x -> Math.exp(x * x))
              .sum() * paso;
  }
}
