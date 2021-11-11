import java.util.Scanner;

public class ejercicio2_switch {

    public static void main(String[] args) { 
        
        Scanner teclado = new Scanner(System.in);
        String texto;
        
        System.out.print("[*] Digite una cadena de texto: ");
        texto = teclado.nextLine();
        System.out.print("\n¿Que desea realizar?\n[1] Convertir cadena de texto a minúscula\n[2] Convertir cadena de texto a mayúscula\n >> ");
        int op = teclado.nextInt();
        
        switch (op){
            case 1:
                String texto1 = texto.toLowerCase();
                if (texto1 == texto){
                    System.out.println("El texto ya esta en minusculas");
                    break;
                }else {
                    System.out.println(texto1);
                    break;
                }
            case 2:
                String texto2 = texto.toUpperCase();
                if (texto2 == texto){
                    System.out.println("El texto ya esta en mayusculas");
                    break;
                }else {
                    System.out.println(texto2);
                    break;
                }
            default:
                System.out.println("Ingreso un dato no valido");
        }
        
    }
    
}
