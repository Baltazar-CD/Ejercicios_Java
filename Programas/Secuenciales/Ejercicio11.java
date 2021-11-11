/* Instituto Tecnológico de Culiacán
Campos Delgado Baltazar
Fundamentos de programacion */

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("\n\n\n[+] Ingrese el año actual: ");
        int actual = teclado.nextInt();
        System.out.print("[+] Ingrese el año de vencimiento: ");
        int venci = teclado.nextInt();
        
        if (actual>venci) System.out.println("\n¡CREDENCIAL VENCIDA! debe renovarse de inmediato");

        else if (actual==venci) System.out.println("\nCREDENCIAL VALIDA SOLO POR ESTE AÑO");

             else System.out.println("\nSU CREDENCIAL VALIDA POR " + (venci-actual) + " AÑOS");

    }
}