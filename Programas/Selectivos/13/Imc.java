// CAMPOS DELGADO BALTAZAR - FUNDAMENTOS DE PROGRMACION UNIDAD III

import java.util.Scanner;

public class Imc {
    
        public static void main(String[] args) {
        
            double kilos, metros, imc; String text = null;
            Scanner teclado = new Scanner(System.in);
            System.out.println("\n\n\n\n..: Conozca cual es su indice de masa corporal (IMC) :..\n");
            System.out.print("[*] Ingrese su altura en metros >> ");
            metros = teclado.nextDouble();
            System.out.print("[*] Ingrese su peso en kilos >> ");
            kilos = teclado.nextDouble();

            imc = kilos/(Math.pow(metros, 2));


            if (imc<18.5) text = "Peso bajo";

             else 

                if (imc>=18.5 && imc<25) text = "Peso normal";

                 else

                    if (imc>=25 && imc<30) text = "Sobrepeso";

                     else text = "Obesidad";


            String imc2f = String.format("%.2f", imc);

            System.out.println("\n[+] Tu indice de masa corporal es de: " + imc2f);
            System.out.println("[+] De acuerdo a su IMC, tiene: " + text);
            
        }
}