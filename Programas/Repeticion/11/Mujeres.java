// CAMPOS DELGADO BALTAZAR - FUNDAMENTOS DE PROGRAMACION UNIDAD III

import java.util.Scanner;

public class Mujeres
{
	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		String nombre, sexo, nombremaschica="";
		int acumuladormujeres = 0, sumaedades = 0 ,edad, maschica=150;
		
		for (int i=0; i<10; i++)
		{
			System.out.println("\nNombre:");
			nombre = leer.nextLine();	
			System.out.println("Sexo | Mujer | Hombre | >> ");
			sexo = (leer.nextLine()).toUpperCase();	
			System.out.println("Edad:");
			edad = leer.nextInt();	
			leer.nextLine();
			
			if ( sexo.equals("MUJER") )	
			{
				acumuladormujeres = ( acumuladormujeres + 1 );
				sumaedades = ( sumaedades + edad );
				
				if (edad<maschica)	
				{
					maschica = edad;
					nombremaschica = nombre;
				}
			}
			
		}
		System.out.println("\nNumero de Mujeres: " +acumuladormujeres);	
		System.out.println("Promedio de edades de las Mujeres: " + (sumaedades/acumuladormujeres) );	
		System.out.println("Nombre de la mas Chica: " +nombremaschica.toUpperCase());	
	}
}