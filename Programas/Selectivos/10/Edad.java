// CAMPOS DELGADO BALTAZAR - FUNDAMENTOS DE PROGRMACION UNIDAD III

import java.util.Scanner;

public class Edad
{
	public static void main(String[] args)
	{
		//Declaracion de variables
		Scanner leer=new Scanner(System.in);
		String nombre, nombre2;
		int edad, edad2;

		//Se obtienen los valores de las variables
		System.out.println("Ingrese su nombre:");
		nombre1=leer.nextLine();
		System.out.println("Ingrese su edad:");
		edad1=leer.nextInt();
		leer.nextLine();
		System.out.println("Ingrese su nombre:");
		nombre2=leer.nextLine();
		System.out.println("Ingrese su edad:");
		edad2=leer.nextInt();

		//Condicion para conocer que edad es mayor a la otra
		if (edad>edad2)
		{	
			//Impresion de la persona mas pequeña
			System.out.println("La persona mas pequeña es: " +nombre2);
		}
		else
		{
			//Impresion de la persona mas pequeña
			System.out.println("La persona mas pequeña es: " +nombre);
		}
	}
}