/* 
Instituto Tecnológico de Culiacán
Campos Delgado Baltazar
Unidad 2 Fundamentos de programacion

En un hospital existen 3 áreas: Urgencias, Pediatría y Traumatología. 
El presupuesto anual del hospital se reparte de la siguiente manera:
 * urgencias 37%
 * pediatría 42%
 * traumatología 21%
*/

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {

            int pres, urgencias, pediatría, traumatología;  
            Scanner presupuesto = new Scanner (System.in);
            System.out.print("Presupuesto anual: ");
            pres = presupuesto.nextInt();
            urgencias = pres*037;
            pediatría = pres*042;
            traumatología = pres*021;
            System.out.println("Imprimir presupuesto para urgencias es de: " +urgencias);
            System.out.println("Imprimir presupuesto para pediatría es de: " + pediatría);
            System.out.println("Imprimir presupuesto para traumatología: " + traumatología);

        }
            
	
}
