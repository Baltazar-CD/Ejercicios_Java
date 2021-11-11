// CAMPOS DELGADO BALTAZAR - FUNDAMENTOS DE PROGRMACION UNIDAD III

import java.util.Scanner;

public class Rfc
{
	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		String nombre, apellidopaterno, apellidomaterno, anio, mes, dia, rfc;
		System.out.println("Ingresa tu nombre:");
		nombre = leer.nextLine();
		System.out.print("Ingresa tu apellido paterno: ");
		apellidopaterno = leer.nextLine();
		System.out.print("Ingresa tu apellido materno: ");
		apellidomaterno = leer.nextLine();
		System.out.print("Ingresa tu año de nacimiento: ");
		anio = leer.nextLine();
		System.out.print("Ingresa tu mes de nacimiento: ");
		System.out.println("1-Enero\n2-Febrero\n3-Marzo\n4-Abril\n5-Mayo\n6-Junio\n7-Julio\n8-Agosto\n9-Septiembre\n10-Octubre\n11-Noviembre\n12-Diciembre\n");
		System.out.print("Ingresa el mes: ");
		mes = leer.nextLine();
		switch (mes)
		{
			case "1": mes = "01"; break;
			case "2": mes = "02"; break;
			case "3": mes = "03"; break;
			case "4": mes = "04"; break;
			case "5": mes = "05"; break;
			case "6": mes = "06"; break;
			case "7": mes = "07"; break;
			case "8": mes = "08"; break;
			case "9": mes = "09"; break;
			case "10": mes = "10"; break;
			case "11": mes = "11"; break;
			case "12": mes = "12"; break;
			default: System.out.println("Mes Invalido");
		}
		System.out.println("Ingresa el dia de nacimeinto: ");
		dia = leer.nextLine();
		rfc = apellidopaterno.substring(0, 2);
		rfc = rfc.concat(apellidomaterno.substring(0,1));
		rfc = rfc.concat(nombre.substring(0,1));
		rfc = rfc.concat(anio.substring(2, 4));
		rfc = rfc.concat(mes);
		rfc = rfc.concat(dia);
		System.out.println("Tu RFC es: " +rfc.toUpperCase());
	}
}
