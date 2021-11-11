/* Instituto Tecnológico de Culiacán
Campos Delgado Baltazar
Unidad 2 Fundamentos de programacion */

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        
     	double gradosC, gradosF;
     	int num_caracteristicas = 0;
     	Scanner in = new Scanner(System.in);
     
     	System.out.print("Porfavor ingrese centigrados: ");
     	gradosC = in.nextDouble();
     	gradosF = 32 + (9 * gradosC / 5) ;
     	System.out.println(gradosC +" graods centigrados " + gradosF + " grados farenheit");
        
    }
    
}