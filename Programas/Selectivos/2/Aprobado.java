// CAMPOS DELGADO BALTAZAR - FUNDAMENTOS DE PROGRAMACION UNIDAD III

import java.util.Scanner;

public class Aprobado
{
	 public static void main(String[] args)
	{
		Scanner leer=new Scanner(System.in);

		System.out.println("\n[*] Ingresa la calificacion de 0 a 100 : ");
		int num=leer.nextInt();	

		if (num<0 || num>100) System.out.println("[+] El valor ingresado esta fuera del rango.");
		else
			if (num>70) System.out.println("\n[+] La calificacion es Aprobatoria");
		  	else System.out.println("\n[+] La calificacion No es Aprobatoria");
		
	}
}