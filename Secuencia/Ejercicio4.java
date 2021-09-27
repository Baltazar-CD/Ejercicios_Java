/* Instituto Tecnológico de Culiacán
Campos Delgado Baltazar
Unidad 2 Fundamentos de programacion */

package empezandojava;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double numero;
        System.out.print("Ingrse el numero: ");
        numero = teclado.nextDouble();
        double raiz = Math.sqrt(numero);
        //double cubica = Math.sqrt(numero); -> raiz cubica
        System.out.println("La raiz de " + numero + " es " + raiz);
        
    }
    
}
