/*
Instituto Tecnológico de Culiacán
Campos Delgado Baltazar
Unidad 2 Fundamentos de programacion
*/

import java.util.Scanner;

public class ejercicio8 {
	public static void main(String[] args) {
            double cateto1, cateto2;
            Scanner in = new Scanner(System.in);
     
            System.out.print("Porfavor ingrese la longitud del primer cateto: ");
            cateto1 = in.nextDouble();
     
            System.out.print("Porfavor ingrese la longitud del segundo cateto: ");
            cateto2 = in.nextDouble();
     
            System.out.println("Hipotenusa -> " + Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2)));
        }
            
	
}