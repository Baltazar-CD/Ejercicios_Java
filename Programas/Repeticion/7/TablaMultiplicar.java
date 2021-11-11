// CAMPOS DELGADO BALTAZAR - FUNDAMENTOS DE PROGRAMACION UNIDAD III

import java.util.Scanner;

public class TablaMultiplicar
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num, mul; 
		
		System.out.println("Introduzca un numero:");
		num = teclado.nextInt();	
		
		for (int i=0 ; i<13 ; i++) 
		{
			mul = (i*num);	
			
			System.out.println(+ i + " x " + num + " = " + mul );	
		}
	}
}
