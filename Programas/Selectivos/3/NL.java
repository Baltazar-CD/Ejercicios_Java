// CAMPOS DELGADO BALTAZAR - FUNDAMENTOS DE PROGRAMACION UNIDAD III

public class NL	
{ 
	 public static void main(String[] args)
	{
		Scanner leer=new Scanner(System.in);
		int num;
		String numero;	//Declaracion de variables
		 
		System.out.println("[*] Introduce un numero del 1 al 10");
		num=leer.nextInt();	

		switch (num) 
		{
			case 1: numero = "Uno";
			break;
			case 2: numero = "Dos";
			break;
			case 3: numero = "Tres";
			break;
			case 4: numero = "Cuatro";
			break;
			case 5: numero = "Cinco";
			break;
			case 6: numero = "Seis";
			break;
			case 7: numero = "Siete";
			break;
			case 8: numero = "Ocho";
			break;
			case 9: numero = "Nueve";
			break;
			case 10: numero = "Diez";
			break;
			default: numero = "Numero Invalido";	
		}
		System.out.print("[+] El numero : " +num);
		System.out.print("[+] se escribe : " +numero);	
	}
}


	