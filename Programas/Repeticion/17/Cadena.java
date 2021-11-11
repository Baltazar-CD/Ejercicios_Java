// CAMPOS DELGADO BALTAZAR - FUNDAMENTOS DE PROGRAMACION UNIDAD III

import java.util.Scanner;

public class Cadena {
    
        public static void main(String[] args) {
            
            int mayuscula = 0, minuscula = 0, numero = 0, otro = 0; 
        
                Scanner teclado = new Scanner(System.in);
                System.out.print("[*] Por favor ingrese cualquier cadena: ");
                String cadena = teclado.next();

                char[] caracteres = cadena.toCharArray();

                for (char cade: caracteres) {
                    if ('A' <= cade && cade <= 'Z') {
                        mayuscula ++;
                        continue;
                    };
                    if ('a' <= cade && cade <= 'z') {
                        minuscula++;
                        continue;
                    };
                    if ('0' <= cade && cade <= '9') {
                        numero++;
                        continue;
                    };
                    otro++;
                }

                System.out.println("\n[+] Mayusculas: " + mayuscula);
                System.out.println("[+] Minusculas: " + minuscula);  
                System.out.println("[+] Numeros: " + numero);
                System.out.println("[+] Otro tipo de caracter: " + otro);
        }
}	