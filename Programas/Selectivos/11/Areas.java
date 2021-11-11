// CAMPOS DELGADO BALTAZAR - FUNDAMENTOS DE PROGRMACION UNIDAD III

import java.util.Scanner;
import java.lang.Math;

public class Areas
{
	public static void main(String[] args)
	{
		Scanner leer=new Scanner(System.in);
		int accion;
		double base, altura, lado, radio, resultado;

		System.out.println("[1] Triangulo");
		System.out.println("[2] Cuadrado");
		System.out.println("[3] Circulo");
		System.out.println("[4] Rectangulo");
		System.out.println("[5] Salir");
		
		System.out.println(" Eliga >> ");

		op = leer.nextInt();

		switch (op)
		{
		case 1: //area del triangulo
			System.out.println("Valor de la base:");
			base =leer.nextDouble();
			System.out.println("Valor de la altura:");
			altura = leer.nextDouble();
			resultado = ((base*altura)/2);
			break;
		case 2: //area del cuadrado
			System.out.println("Valor del lado:");
			lado = leer.nextDouble();
			resultado = (Math.pow(lado,2));
			break;
		case 3: //area del circulo
			System.out.println("Valor del radio:");
			radio = leer.nextDouble();
			resultado = ( Math.PI * Math.pow(radio,2) );
			break;
		case 4: //area del rectangulo
			System.out.println("Valor de la base:");
			base = leer.nextDouble();
			System.out.println("Valor de la altura:");
			altura = leer.nextDouble();
			resultado = (base*altura);
			break;
		case 5: //Caso para Salir
			resultado = 0;
			System.out.println("Saliendo");
			break;
		default:
			resultado = 0;
		}
	System.out.println("Valor del area: " + resultado);
	}
}