/* Instituto Tecnológico de Culiacán
Campos Delgado Baltazar
Unidad 2 Fundamentos de programacion */

import java.util.Scanner;

public class ejercicio2_if {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        float num;
        System.out.print("[*] Ingrese el numero: ");
        num = teclado.nextFloat();
        
        if (num >= 0){
            System.out.println("El numero es positivo");
        }
        else if (num < 0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("Ingreso un dato no valido");
        }
        
    }
    
}