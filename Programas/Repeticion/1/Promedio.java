// CAMPOS DELGADO BALTAZAR - FUNDAMENTOS DE PROGRAMACION UNIDAD III

import java.util.Scanner;

public class Promedio

{
	public static void main(String[] args)
	{

		Scanner leer=new Scanner(System.in);
		int edad=0, promedio=0,acum=0, i=1;

		while (i<=10) 

		{
			System.out.println("[*] Ingresa tu edad");
			edad = leer.nextInt();
			acum = edad+acum; 
			i++;
		
		}

		promedio=(acum/10); 

		System.out.println("[+] El promedio de las edades es: " +promedio);
	}
}