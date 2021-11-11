// CAMPOS DELGADO BALTAZAR - FUNDAMENTOS DE PROGRAMACION UNIDAD III

import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int numero, resultado = 1;	
		
		System.out.println("Introduce un numero de 0 al 10 >> ");
		numero = teclado.nextInt();
		
		for ( int i = numero; i>0 && i<11 ; i--) 
		{
			resultado = (resultado * i);	
		}
		
		System.out.println("\nNumero: " + numero);
		System.out.println("Factorial: " + resultado + "\n");
	}
}		