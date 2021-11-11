/* 
Instituto Tecnológico de Culiacán
Campos Delgado Baltazar
Unidad 2 Fundamentos de programacion

Un alumno desea saber cuál será su calificación 
final en la materia Algoritmos 
Dicha calificación se compone de los siguientes 
porcentajes:
55% del promedio de sus tres practicas calificadas.
30% de la calificación del examen final y 
15% de la calificación de un proyecto final.
*/
import java.util.Scanner;

public class ejercicio6 {
	public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            float pc1, pc2, pc3, EF, PF;
            System.out.print("Ingrese la nota de la PC1: ");
            pc1 = teclado.nextFloat();
            System.out.print("Ingrese la nota de la PC2: ");
            pc2 = teclado.nextFloat();
            System.out.print("Ingrese la nota de la PC3: ");
            pc3 = teclado.nextFloat();
            System.out.print("Escribe la nota del examen final: ");
            EF = teclado.nextFloat();
            System.out.print("Escribe la nota del proyecto final: ");
            PF = teclado.nextFloat();
            float pp = (pc1+pc2+pc3)/3;
            float nt = (pp * .55f) + (EF * .30f) + (PF * .15f);
            System.out.println("La nota final es de: " + nt);

	}
}
