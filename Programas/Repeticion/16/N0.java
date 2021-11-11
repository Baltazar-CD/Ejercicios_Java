// CAMPOS DELGADO BALTAZAR - FUNDAMENTOS DE PROGRAMACION UNIDAD III

import java.util.Scanner;

public class N0
{
	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		do
		{
			System.out.println("Ingresa un Numero:");
			int numero = leer.nextInt();	
		}
		while (numero!=0);	
	}
}