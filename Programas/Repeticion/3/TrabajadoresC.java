// CAMPOS DELGADO BALTAZAR - FUNDAMENTOS DE PROGRAMACION UNIDAD III

import java.util.Scanner;

public class TrabajadoresC
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int i = 0;
		do
		{
			System.out.print("[*] Ingresa el nombre del trabajador:");
			String nombre = teclado.nextLine();	
			System.out.print("[*] Ingresa la categoria del trabajador:");
			char categoria = teclado.next().charAt(0);	
			System.out.print("[*] Ingresa la cantidad de horas trabajadas:");
			int horas = teclado.nextInt();		
			switch (categoria)
			{
				case 'a': case 'A':
					System.out.println("[+] Sueldo: $" +(horas*50));	
					break;
				case 'b': case 'B':
					System.out.println("[+] Sueldo: $" +(horas*60));	
					break;
				case 'c': case 'C':
					System.out.println("[+] Sueldo: $" +(horas*70));	
					break;
			}
			leer.nextLine();
			i++;
		}
		while (i<20);

	}
}
		
		
	