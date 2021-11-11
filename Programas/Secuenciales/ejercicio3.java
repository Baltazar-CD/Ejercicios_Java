/* Instituto Tecnológico de Culiacán
Campos Delgado Baltazar
Unidad 2 Fundamentos de programacion */

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int fecha, fecha2, edad;
        
        System.out.print("Ingrese el año actual: ");
        fecha = teclado.nextInt();
        System.out.print("Ingrese el año de su nacimiento: ");
        fecha2 = teclado.nextInt();
        
        edad = fecha-fecha2;
        System.out.println("Su edad es de " + edad + " años");
        
    }
    
}