/* Instituto Tecnológico de Culiacán
Campos Delgado Baltazar
Unidad 2 Fundamentos de programacion */

package empezandojava;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int velocidad, distancia;
        
        System.out.print("[*] Ingrese la velocidad: ");
        velocidad = teclado.nextInt();
        System.out.print("[*] Ingrese la distancia: ");
        distancia = teclado.nextInt();
        
        int horas = distancia/velocidad;
        int minutos = horas*60;
        int nueva = velocidad*(1000/3600);
        
        System.out.print("\n[+] El tiempo en minutos que recorreria la distancia es: " + minutos);
        System.out.println("[+] La velocidad en m/s es: " + nueva);
        
    }
    
}