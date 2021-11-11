// CAMPOS DELGADO BALTAZAR - FUNDAMENTOS DE PROGRMACION UNIDAD III

import java.util.Scanner;

public class Meses
{
	public static void main(String[] args)
	{
		//Declaracion de variables
		Scanner leer=new Scanner(System.in);
		String meses;
		System.out.print("Introduzca el Mes representado en Numero: ");
		int mes=leer.nextInt();
		switch (mes)
		{
			case 1: 
				meses = " Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre"; break;
			case 2: 
				meses = " Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre"; break;
			case 3: 
				meses = " Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre"; break;
			case 4: 
				meses = " Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre"; break;
			case 5: 
				meses = " Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre"; break;
			case 6: 
				meses = " Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre"; break;
			case 7: 
				meses = " Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre"; break;
			case 8: 
				meses = " Agosto, Septiembre, Octubre, Noviembre, Diciembre"; break;
			case 9:
				meses = " Septiembre, Octubre, Noviembre, Diciembre"; break;
			case 10:
				meses = " Octubre, Noviembre, Diciembre"; break;
			case 11: 
				meses = " Noviembre, Diciembre"; break;
			case 12: 
				meses = " Diciembre"; break;
			default: meses = " Mes Inexistente";
		}
	System.out.println(meses); 
	}
}