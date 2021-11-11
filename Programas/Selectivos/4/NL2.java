// CAMPOS DELGADO BALTAZAR - FUNDAMENTOS DE PROGRMACION UNIDAD III

import java.util.Scanner;

public class NL2
{
	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		int numero, centenas, decenas, unidades;
		String escrito1, escrito2, escrito3; 
		
		System.out.println("Introduce un numero entero: [0 al 1000]");
		numero = leer.nextInt();	
		
		centenas = numero/100;
		decenas = (numero-(centenas*100))/10;
		unidades = (numero-(centenas*100))-(decenas*10);
		
		if (numero<0 || numero>1000)
		{
			System.out.println("Numero Invalido");
		}
		else
		{
			if (centenas>0 && decenas==0 && unidades==0) 
			{
				switch (centenas)
				{
					case 10: System.out.println("Mil "); break;
					case 9: System.out.println("Novecientos "); break;
					case 8: System.out.println("Ochocientos "); break;
					case 7: System.out.println("Setecientos "); break;
					case 6: System.out.println("Seiscientos "); break;
					case 5: System.out.println("Quinientos "); break;
					case 4: System.out.println("Cuatrocientos "); break;
					case 3: System.out.println("Trescientos "); break;
					case 2: System.out.println("Doscientos "); break; 
					case 1: System.out.println("Cien "); break;
				} 
			}
			
			if (centenas==0 && decenas>0 && unidades==0)
			{
				switch (decenas)
				{
					case 9: System.out.println("Noventa "); break;
					case 8: System.out.println("Ochenta "); break;
					case 7: System.out.println("Setenta "); break;
					case 6: System.out.println("Sesenta "); break;
					case 5: System.out.println("Cincuenta "); break;
					case 4: System.out.println("Cuarenta "); break;
					case 3: System.out.println("Teinta "); break; 
					case 2: System.out.println("Veinte "); break;
					case 1: System.out.println("Diez "); break;
				} 
			}
						
			if (centenas==0 && decenas==0 && unidades>0)
			{
				switch (unidades)
				{
					case 9: System.out.println("Nueve "); break;
					case 8: System.out.println("Ocho "); break;
					case 7: System.out.println("Siete "); break;
					case 6: System.out.println("Seis "); break;
					case 5: System.out.println("Cinco "); break;
					case 4: System.out.println("Cuatro "); break;
					case 3: System.out.println("Tres "); break;
					case 2: System.out.println("Dos "); break;
					case 1: System.out.println("Uno "); break;
				} 
			}	
			if (centenas>0 && decenas>0 && unidades==0)
			{
				switch (centenas)
				{
					case 10: System.out.print("Mil "); break;
					case 9: System.out.print("Novecientos "); break;
					case 8: System.out.print("Ochocientos "); break;
					case 7: System.out.print("Setecientos "); break;
					case 6: System.out.print("Seiscientos "); break;
					case 5: System.out.print("Quinientos "); break;
					case 4: System.out.print("Cuatrocientos "); break;
					case 3: System.out.print("Trescientos "); break;
					case 2: System.out.print("Doscientos "); break;
					case 1: System.out.print("Ciento "); break;
				} 
				switch (decenas)
				{
					case 9: System.out.print("Noventa "); break;
					case 8: System.out.print("Ochenta "); break;
					case 7: System.out.print("Setenta "); break;
					case 6: System.out.print("Sesenta "); break;
					case 5: System.out.print("Cincuenta "); break;
					case 4: System.out.print("Cuarenta "); break;
					case 3: System.out.print("Teinta "); break;
					case 2: System.out.print("Veinte "); break;
					case 1: System.out.print("Diez "); break;
				} 
			}
			if ((centenas==0) && (decenas>1) && (unidades>0))
			{
				switch (decenas)
				{
					case 9: System.out.print("Noventa y "); break;
					case 8: System.out.print("Ochenta y "); break;
					case 7: System.out.print("Setenta y "); break;
					case 6: System.out.print("Sesenta y "); break;
					case 5: System.out.print("Cincuenta y "); break;
					case 4: System.out.print("Cuarenta y "); break;
					case 3: System.out.print("Teinta y "); break;
					case 2: System.out.print("Veinti"); break;
				} 
				switch (unidades)
				{
					case 9: System.out.print("Nueve "); break;
					case 8: System.out.print("Ocho "); break;
					case 7: System.out.print("Siete "); break;
					case 6: System.out.print("Seis "); break;
					case 5: System.out.print("Cinco "); break;
					case 4: System.out.print("Cuatro "); break;
					case 3: System.out.print("Tres "); break;
					case 2: System.out.print("Dos "); break;
					case 1: System.out.print("Uno "); break;
				} 
			}
			if ((centenas==0) && (decenas==1) && (unidades>0))
			{
				int numeromayor10 = ((decenas*10)+unidades);
				switch (numeromayor10)
				{
					case 19: System.out.print("Diecinueve "); break;
					case 18: System.out.print("Dieciocho "); break;
					case 17: System.out.print("Diecisiete"); break;
					case 16: System.out.print("Dieciseis"); break;
					case 15: System.out.print("Quince"); break;
					case 14: System.out.print("Catorce"); break;
					case 13: System.out.print("Trece"); break;
					case 12: System.out.print("Doce"); break;
					case 11: System.out.print("Once"); break;
				}
			}				
			if (centenas>0 && decenas>1 && unidades>0)
			{
				switch (centenas)
				{
					case 10: System.out.print("Mil "); break;
					case 9: System.out.print("Novecientos "); break;
					case 8: System.out.print("Ochocientos "); break;
					case 7: System.out.print("Setecientos "); break;
					case 6: System.out.print("Seiscientos "); break;
					case 5: System.out.print("Quinientos "); break;
					case 4: System.out.print("Cuatrocientos "); break;
					case 3: System.out.print("Trescientos "); break;
					case 2: System.out.print("Doscientos "); break;
					case 1: System.out.print("Ciento "); break;
				} 
				switch (decenas)
				{
					case 9: System.out.print("Noventa y "); break;
					case 8: System.out.print("Ochenta y "); break;
					case 7: System.out.print("Setenta y "); break; 
					case 6: System.out.print("Sesenta y "); break;
					case 5: System.out.print("Cincuenta y "); break;
					case 4: System.out.print("Cuarenta y "); break;
					case 3: System.out.print("Teinta  y "); break;
					case 2: System.out.print("Veinti"); break;
				} 
				switch (unidades)
				{
					case 9: System.out.print("Nueve "); break;
					case 8: System.out.print("Ocho "); break;
					case 7: System.out.print("Siete "); break;
					case 6: System.out.print("Seis "); break;
					case 5: System.out.print("Cinco "); break;
					case 4: System.out.print("Cuatro "); break;
					case 3: System.out.print("Tres "); break;
					case 2: System.out.print("Dos "); break;
					case 1: System.out.print("Uno "); break;
				} 
			}
			if ((centenas>=1) & (((decenas*10)+unidades)==11 || ((decenas*10)+unidades)==12 || ((decenas*10)+unidades)==13 || ((decenas*10)+unidades)==14 || ((decenas*10)+unidades)==15 || ((decenas*10)+unidades)==16 || ((decenas*10)+unidades)==17 || ((decenas*10)+unidades)==18 || ((decenas*10)+unidades)==19))
			{
				switch (centenas)
				{
					case 10: System.out.print("Mil "); break;
					case 9: System.out.println("Novecientos "); break;
					case 8: System.out.println("Ochocientos "); break;
					case 7: System.out.println("Setecientos "); break;
					case 6: System.out.println("Seiscientos "); break;
					case 5: System.out.println("Quinientos "); break;
					case 4: System.out.println("Cuatrocientos "); break;
					case 3: System.out.println("Trescientos "); break;
					case 2: System.out.println("Doscientos "); break;
					case 1: System.out.println("Ciento "); break;
				} 
				int numeromayor10 = ((decenas*10)+unidades);
				switch (numeromayor10)
				{
					case 19: System.out.print("Diecinueve "); break;
					case 18: System.out.print("Dieciocho "); break;
					case 17: System.out.print("Diecisiete"); break;
					case 16: System.out.print("Dieciseis"); break;
					case 15: System.out.print("Quince"); break;
					case 14: System.out.print("Catorce"); break;
					case 13: System.out.print("Trece"); break;
					case 12: System.out.print("Doce"); break;
					case 11: System.out.print("Once"); break;
				}
			}	
		}
		if (numero==0)
		{
			System.out.println("Cero");
		}
	}
}		