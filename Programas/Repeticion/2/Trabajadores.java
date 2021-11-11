// CAMPOS DELGADO BALTAZAR - FUNDAMENTOS DE PROGRAMACION UNIDAD III

import java.util.Scanner;

public class Trabajadores
{
	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		int i = 0;
		do
		{
			System.out.println("Ingresa el nombre del trabajador:");
			String nombre = leer.nextLine();	
			System.out.println("Ingresa la cantidad de horas trabajadas:");
			int horas = leer.nextInt();	
			System.out.println("Sueldo: $" +(horas*50));	
			leer.nextLine();
			i++;
		}
		while (i<20);	
	}
}