// CAMPOS DELGADO BALTAZAR - FUNDAMENTOS DE PROGRMACION UNIDAD III

import java.util.Scanner;

public class Rangos		
{
	public static void main(String[] args)
	{
		Scanner leer=new Scanner(System.in);
		String e;	
		System.out.println("Introduce un numero del 0 al 10 ");
		int num=leer.nextInt();	

		switch (num)	
		{
	  		case 0: case 1: case 2: case 3: case 4: case 5:
		  		e = "Malo";
		 		break;
  			case 6: case 7:
 				e = "Regular";
		 		break;
	  		case 8: case 9:
				e = "Bueno";
				break;
	 		case 10:
		 		escrito = "Excelente";
		 		break;
	  		default: e = "Rango Invalido";	
		}
		System.out.print("El rango es " + e);
	}
}


	