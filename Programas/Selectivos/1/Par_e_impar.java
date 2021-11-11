// CAMPOS DELGADO BALTAZAR - FUNDAMENTOS DE PROGRAMACION UNIDAD 3

import java.util.Scanner;

public class Par_e_impar {
    
    public static void main(String[] args) {
            
            Scanner entrada = new Scanner (System.in);
            System.out.print("Digite un número: ");
            
            int n = entrada.nextInt();
            
            System.out.println(n%2 == 0? "par": "impar");
            
    }
}