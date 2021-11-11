// CAMPOS DELGADO BALTAZAR - FUNDAMENTOS DE PROGRMACION UNIDAD III

import java.util.Scanner;

public class Decenas
{
	public static void main(String[] args)
	{
		Scanner teclado=new Scanner(System.in);
		System.out.println("Digite un numero entero");
		int num=teclado.nextInt();
		if (num>=0 && num<=99) System.out.println("Decenas del numero: " +num+ " son: " +(num/10));
	}
}