// CAMPOS DELGADO BALTAZAR - FUNDAMENTOS DE PROGRAMACION UNIDAD III

import java.util.Scanner;

public class NombresAa
{
	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		String nombre;
		int inicialA = 0;	
		
		for (int i=0 ; i<10 ; i++)	
		{
			System.out.println("\n[*] Nombre:");
			nombre = leer.nextLine();	
			
			if (nombre.charAt(0)==65 || nombre.charAt(0)==97) inicialA++;	
		}

		System.out.println("\n[+] Nombres con inicial A o a: " + inicialA );
	}
}