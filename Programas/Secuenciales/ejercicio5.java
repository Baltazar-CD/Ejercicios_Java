/* Instituto Tecnológico de Culiacán
Campos Delgado Baltazar
Unidad 2 Fundamentos de programacion */

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("ingrese el num1: ");
        num1 = teclado.nextInt();
        System.out.print("ingrese el num2: ");
        num2 = teclado.nextInt();
        
        int mayor = Math.max(num1, num2);
        int menor = Math.min(num1, num2);
        
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " +  menor);
        
    }
    
}
