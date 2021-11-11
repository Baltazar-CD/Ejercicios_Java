/* Instituto TecnolÃ³gico de CuliacÃ¡n
Campos Delgado Baltazar
Unidad 2 Fundamentos de programacion */

import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenKind;

public class ejercicio1_if {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        float cuadrada, cubica, numero, residuo, potencia, num1, num2;
        System.out.println(" ¿Que Operacion a realizar? \n \n [1] Raiz Cubica \n [2] Raiz Cuadrada \n [3] Elevar a potencia \n [4] Residuo de divisiÃ³n \n [5] Salir \n");
        System.out.print(" >> Elija una opcion: ");
        int opcion = teclado.nextInt();
        
         Scanner teclado = new Scanner(System.in);
        float cuadrada, cubica, numero, residuo, potencia, num1, num2;
        System.out.println(" ¿Que Operacion a realizar? \n \n [1] Raiz Cubica \n [2] Raiz Cuadrada \n [3] Elevar a potencia \n [4] Residuo de división \n [5] Salir \n");
        System.out.print(" >> Elija una opcion: ");
        int opcion = teclado.nextInt();
        
        if (opcion == 1){
            System.out.print("[*] Ingrese el numero: ");
            cubica = teclado.nextFloat();
            double raiz = Math.cbrt(cubica);
            System.out.println("[+] La raiz cubica de " + cubica + " es " + raiz);
        }
        else if (opcion == 2){
            System.out.print("[*] Ingrese el numero: ");
            cuadrada = teclado.nextFloat();
            double raiz2 = Math.sqrt(cuadrada);
            System.out.println("[+] La raiz cuadrada de " + cuadrada + " es " + raiz2);
        }
        else if (opcion == 3) {
            System.out.print("[*] Ingrese el numero: ");
            numero = teclado.nextFloat();
            System.out.print("[*] Ingrese la potencia: ");
            potencia = teclado.nextFloat();
            double resultado = Math.pow(numero, potencia);
            System.out.println( numero + " Elevado a " + potencia + " es: " + resultado);
        }
        else if (opcion == 4){
            System.out.print("[*] Ingrese el num1: ");
            num1 = teclado.nextFloat();
            System.out.print("[*] Ingrese el num2: ");
            num2 = teclado.nextFloat();
            residuo = num1%num2;
            System.out.println("La división de " + num1 + "/" + num2 + " es: " + residuo);
        }
        else if (opcion == 5){
            System.out.println("Hasta luego");
        }else{
            System.out.println("Solo números entre 1 y 5");
        }
    }
    
}