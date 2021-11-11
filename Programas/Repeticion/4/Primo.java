// CAMPOS DELGADO BALTAZAR - FUNDAMENTOS DE PROGRAMACION UNIDAD III

import java.util.Scanner;

public class Primo {
    
        public static void main(String[] args) {

            Scanner teclado= new Scanner(System.in);
            int a,c=0;
            System.out.print("[*] ingrese un numero: ");
            a = teclado.nextInt();
            for (int i = 1; i <= a; i++) {
                if(a%i==0){
                    c++;
                }
            }
            if(c==2){
                System.out.print("[+] el numero " + a + " es primo");
            }else{
                System.out.println("[+] el numero no es primo\n");
            }

    }
}
