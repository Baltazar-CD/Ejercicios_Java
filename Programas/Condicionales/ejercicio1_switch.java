/* Instituto Tecnológico de Culiacán
Campos Delgado Baltazar
Unidad 2 Fundamentos de programacion */

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion, cuadrado, rectangulo, triangulo , circulo;
        
        System.out.print("\n[1] Cuadrado \n[2] Rectangulo \n[3] Triangulo \n[4] Circulo \n >> Escoja la figura geometrica a sacar su area: ");
        opcion = teclado.nextInt();
        
        switch(opcion){
            case 1:
                System.out.print("[*] Ingrese el lado del cuadrado: ");
                float lado = teclado.nextFloat();
                float area = lado*lado;
                System.out.println("[+] El area es: " + area);
                break;
            case 2:
                System.out.print("[*] Ingrese el ancho del rectangulo: ");
                float ancho = teclado.nextFloat();
                System.out.print("[*] Ingrese el largo del rectangulo: ");
                float largo = teclado.nextFloat();
                float area2 = ancho*largo;
                System.out.println("[+] El area es: " + area2);
                break;
            case 3:
                System.out.print("[*] Ingrese la altura del triangulo: ");
                float altura = teclado.nextFloat();
                System.out.print("[*] Ingrese la base del triangulo: ");
                float base = teclado.nextFloat();
                float area3 = (base*altura)/2;
                System.out.println("[+] El area es: " + area3);
            case 4:
                System.out.print("[*] Ingrese el radio del circulo: ");
                float radio = teclado.nextFloat();
                float area4 = 3.141592f * radio * radio;
                System.out.println("[+] El area es: " + area4);
            default:
                System.out.println("Error, Ingreso un dato no valido.");
        }
    }
    
}