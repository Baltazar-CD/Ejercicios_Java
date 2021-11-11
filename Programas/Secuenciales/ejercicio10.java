/* 
Instituto Tecnológico de Culiacán
Campos Delgado Baltazar
Unidad 2 Fundamentos de programacion
*/

import java.util.Scanner;

public class ejercicio10 {
	public static void main(String[] args) {
            double radio, longitud, area = 0;
            Scanner in = new Scanner(System.in);
     
            System.out.print("Porfavor ingrese el radio: ");
            radio = in.nextDouble();
     
            longitud = 2 * Math.PI * radio;
            area = Math.PI * Math.pow(radio,2);
            System.out.println("la longitud de la circunferencia es: " + longitud + " \nel area de la circunferencia es: " + area);
        }
            
}
