package proyecto_java;
import java.util.Scanner; // Clase Importada

public class Ejemplo02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        // Declaración de Variables 
        double USD, europa, reinoUnido, australia, canada, moneda, conver1, conver2, conver3, conver4, conver5;
        // Valores Prederteminados
        USD = 1;
        europa = 0.70;
        reinoUnido = 0.61;
        australia = 0.95;
        canada = 0.97;
       
        System.out.println("Ingrese valor monetario: ");
        moneda = leer.nextDouble();
        
        conver1 = moneda * USD;
        conver2 = moneda * europa; 
        conver3 = moneda * reinoUnido;
        conver4 = moneda * australia;
        conver5 = moneda * canada;
        
        System.out.println("En Dolares el valor es de: "+conver1);
        System.out.println("En Europa el valor es de: "+conver2);
        System.out.println("En El U K el valor es de "+conver3);
        System.out.println("En Australia el valor es de: "+conver4);
        System.out.println("En Canada el valor es de: "+conver5);
    }
}
