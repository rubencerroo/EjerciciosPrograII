import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Escriba su cadena:");
        String input = sc.nextLine();
        String output = conCodigoPar(input);
        System.out.println(output); 
    }
    
    public static String conCodigoPar(String str) {
        
        if (str.isEmpty()) {
            return "";
        }
        
        char firstChar = str.charAt(0);
        
        if ((int)firstChar % 2 == 0) {
           
            return firstChar + conCodigoPar(str.substring(1));
        } else {
            
            return conCodigoPar(str.substring(1));
        }
    }
    
}
