/* Instituto Tecnológico de Culiacán
Campos Delgado Baltazar
Unidad 2 Fundamentos de programacion */

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int edad;
        String nombre;
        float altura;
        
        System.out.print("[*] Digite su edad > ");
        edad = teclado.nextInt();
        System.out.print("[*] Digite su nombre > ");
        nombre = teclado.next();
        System.out.print("[*] Digite su altura > ");
        altura = teclado.nextFloat();
        
        System.out.print("\n[+] Su nombre es: " + nombre);
        System.out.print("[+] Su edad es: " + edad);
        System.out.println("[+] Su altura es: " + altura);
        
    }
    
}