// CAMPOS DELGADO BALTAZAR - FUNDAMENTOS DE PROGRMACION UNIDAD III

import java.text.DecimalFormat;
import java.util.Scanner;

public class Agricola {
    
        public static void main(String[] args) {
        
            DecimalFormat formato = new DecimalFormat("###,###,###.##");
            double news = 0, sul; int cat;
            Scanner teclado = new Scanner(System.in);

            System.out.print("\n\n\n...:: La empresa agricola el fuerte, ha decidido incrementar el sueldo de sus trabajadores de acuerdo a su categoria ::...");
            System.out.print("\n\n[0] Categoria A\n[1] Categoria B\n[2] Categoria C\n[3] Categoria D\n\n Ingrese su categoria >> ");
            cat = teclado.nextInt();
            System.out.print(" Ingrese su sueldo >> ");
            sul = teclado.nextDouble();

            switch (cat) {
                case 0:
                    System.out.println("\n[+] Se le dara un aumento del 15% por estar en la categoria A");
                    news = (double) (sul*.15); //se asigna el nuevo sueldo
                    break;
                case 1:
                    System.out.println("\n[+] Se le dara un aumento del 10% por estar en la categoria B");
                    news = (double) (sul*.10); //se asigna el nuevo sueldo
                    break;
                case 2:
                    System.out.println("\n[+] Se le dara un aumento del 8% por estar en la categoria C");
                    news = (double) (sul*.8); //se asigna el nuevo sueldo
                    break;
                case 3:
                    System.out.println("\n[+] Se le dara un aumento del 5% por estar en la categoria D");
                    news = (double) (sul*.5); //se asigna el nuevo sueldo
                    break;
                default: System.out.println("\n[!] Ingreso una Categoria invalida"); System.exit(0); // tira error y cierra programa al ingresar un dato no valido
            }
            System.out.println("[+] Su auemto es de: $" + formato.format(news));
            System.out.println("[+] Su nuevo sueldo es de: $" + formato.format(news+sul));
            
        }
}

			    