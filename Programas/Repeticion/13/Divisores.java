// CAMPOS DELGADO BALTAZAR - FUNDAMENTOS DE PROGRAMACION UNIDAD III

import java.util.Scanner;

public class Divisores
{
	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		int numero;	
		
		System.out.println("Introduce un Numero Entero: ");
		numero = leer.nextInt();	
		
		for (int i=1 ; i<numero+1 ; i++) 
		{
			if ( numero%i==0) System.out.println("Divisor: "+ i );	
		}
	}
}