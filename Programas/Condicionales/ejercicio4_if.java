/* Instituto Tecnológico de Culiacán
Campos Delgado Baltazar
Unidad 2 Fundamentos de programacion */

import java.util.Scanner;

public class ejercicio4_if {

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        int sueldo;
        System.out.print("[*] Ingrese el sueldo del empledo: ");
        sueldo = teclado.nextInt();
        System.out.print("[*] Ingrese los años del empleado en la compañia: ");
        int años = teclado.nextByte();
        
        if (años >= 5){
            System.out.println("[+] Recibira un aumento en su sueldo del 18% por estar tanto tiempo en la compañia");
            float porcen = 0.18f * sueldo;
            float aumento = porcen+sueldo;
            System.out.println("[+] Su nuevo sueldo es de: " + aumento);
        }else{
            System.out.println("[+] Su sueldo por el momento seguira siendo el mismo, de: " + sueldo);
        }
    }
    
}