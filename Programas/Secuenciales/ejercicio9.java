/* 
Instituto Tecnológico de Culiacán
Campos Delgado Baltazar
Unidad 2 Fundamentos de programacion
*/

import java.util.Scanner;

public class ejercicio9 {
	public static void main(String[] args) {
            double velocidad;
            Scanner in = new Scanner(System.in);
     
            System.out.print("Porfavor ingrese la velocidad: ");
            velocidad = in.nextDouble();
     
            System.out.println(velocidad + " Km/h " + velocidad * 1000 / 3 + "  m/s " );
        }
            
	
}