// CAMPOS DELGADO BALTAZAR - FUNDAMENTOS DE PROGRAMACION UNIDAD III

import java.util.Scanner;

public class NumerodeMujeres
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String nombre, sexo;	
		int amujeres = 0; 
		
		for (int i=0; i<10; i++)
		{
			System.out.println("\nNombre:");
			nombre = teclado.nextLine();	
			System.out.print("Sexo | Mujer | Hombre | >> ");
			sexo = (teclado.nextLine()).toUpperCase();	
			
			if ( sexo.equals("MUJER") )	
			{
				amujeres = ( amujeres + 1 );	
			}
		}
		System.out.println("\nNumero de Mujeres: " +amujeres);
	}
}