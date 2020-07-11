package proyecto_java;
import java.util.Scanner;      // Clase Importada

public class Ejemplo03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        // Declaracion de Variables
        double sueldo, horasTrabajadas, descuentoRenta, sueldoFinal, salarioTotal, descuento;
        descuentoRenta = 0.10;
        
        // Inicialización de Variables 
        System.out.println("Ingrese sueldo: $");
        sueldo = leer.nextDouble();
        System.out.println("Ingrese Horas Trabajadas: ");
        horasTrabajadas = leer.nextDouble();
        
        salarioTotal = sueldo * horasTrabajadas;
        descuento = salarioTotal * descuentoRenta;
        sueldoFinal = salarioTotal - descuento;
        
        System.out.println("El sueldo final es de: $"+sueldoFinal + " Con su respectivo descuentpo del 10% de renta");
        
    }
}
