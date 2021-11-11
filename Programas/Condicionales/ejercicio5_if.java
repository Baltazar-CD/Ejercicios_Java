/* Instituto Tecnológico de Culiacán
Campos Delgado Baltazar
Unidad 2 Fundamentos de programacion */

import java.util.Scanner;

public class ejercicio5_if {

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        float num1, num2, num3, num4;
        System.out.print("[*] Ingrese el num1: ");
        num1 = teclado.nextInt();
        System.out.print("[*] Ingrese el num2: ");
        num2 = teclado.nextInt();
        System.out.print("[*] Ingrese el num3: ");
        num3 = teclado.nextInt();
        System.out.print("[*] Ingrese el num4: ");
        num4 = teclado.nextInt();
        
        if (num1 > num2 && num1 > num3 && num1 > num4){
            System.out.println("El numero meyor es " + num1);
        }else if (num2 > num1 && num2 > num3 && num2 > 4){
            System.out.println("El numero mayor es " + num2);
        }else if (num3 > num1 && num3 > num2 && num3 > 4){
            System.out.println("El numero mayor es " + num3);
        }else if (num4 > num1 && num4 > num2 && num4 > 3){
            System.out.println("El numero mayor es " + num3);
        }else{
            System.out.println("Algunos o todos los numeros son iguales");
        }
    }
    
}