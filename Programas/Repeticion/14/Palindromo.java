// CAMPOS DELGADO BALTAZAR - FUNDAMENTOS DE PROGRAMACION UNIDAD III

import java.util.Scanner;

public class Palindromo
{
	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		String palabra;
		char [] palindromo;
		int derecha, izquierda = 0;	
		
		System.out.println("Introduce una palabra");
		palabra = leer.nextLine().toLowerCase();	
		palindromo = palabra.toCharArray();	
		
		derecha = palindromo.length - 1;
		
		while (izquierda<derecha)
		{
			if (palindromo[izquierda] == palindromo[derecha]) 
			{
				derecha--;
				izquierda++;
			}
			else
			{
				System.out.println("NO es palindromo");
				break;
			}
		}
		if (izquierda == derecha)
		{
			System.out.println("Es Palindromo");
		}
	}
}	