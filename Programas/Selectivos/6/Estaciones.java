// CAMPOS DELGADO BALTAZAR - FUNDAMENTOS DE PROGRMACION UNIDAD III

import java.util.Scanner;

public class Estaciones
{
	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		String mes;
		System.out.println("Introduce el dia:");
		int dia = leer.nextInt();
		
		if (dia>0 & dia<32)
		{
		leer.nextLine();
		System.out.println("Introduce el mes: ");
		mes = leer.nextLine();
		switch (mes)
		{
		case "01": case "1": mes = "ENERO"; break;
		case "02": case "2": mes = "FEBRERO"; break;
		case "03": case "3": mes = "MARZO"; break;
		case "04": case "4": mes = "ABRIL"; break;
		case "05": case "5": mes = "MAYO"; break;
		case "06": case "6": mes = "JUNIO"; break;
		case "07": case "7": mes = "JULIO"; break;
		case "08": case "8": mes = "AGOSTO"; break;
		case "09": case "9": mes = "SEPTIEMBRE"; break;
		case "10": 			 mes = "OCTUBRE"; break;
		case "11": 			 mes = "NOVIEMBRE"; break;
		case "12":			 mes = "DICIEMBRE"; break;
		default: System.out.println("Mes Invalido, Por favor ingresa un mes valido.");
		}
		if ( (mes == "MARZO") & (dia>=21 & dia<=31))
		{
			System.out.println("Es Primavera");
		}
		else
			
			if ( (mes == "ABRIL" || mes == "MAYO") & (dia>=1 & dia<=31) )
			{
				System.out.println("Es Primavera");
			}
			else
			
				if ( (mes == "JUNIO") & (dia>=1 & dia<=20) )
				{
					System.out.println("Es Primavera");
				}
				else
				
					if ( (mes == "JUNIO") & (dia>=22 & dia<=30) )
					{
						System.out.println("Es Verano");
					}
					else
				
						if ( (mes == "JULIO" || mes == "AGOSTO") & (dia>=1 & dia<=31) )
						{
							System.out.println("Es Verano");
						}
						else
						
							if ( (mes == "SEPTIEMBRE") & (dia>=1 & dia<=21) )
							{
								System.out.println("Es Verano");
							}
							else
							
								if ( (mes == "SEPTIEMBRE") & (dia>=23 & dia<=30) )
								{
									System.out.println("Es Oto\u00f1o");
								}
								else
								
									if ( (mes == "OCTUBRE" || mes == "NOVIEMBRE") & (dia>=1 & dia<=31) )
									{
										System.out.println("Es Oto\u00f1o");
									}
									else
									
										if ( (mes == "DICIEMBRE") & (dia>=1 & dia<=20) )
										{
											System.out.println("Es Oto\u00f1o");
										}
										else
										
											if ( (mes == "DICIEMBRE") & (dia>=22 & dia<=31) )
											{
												System.out.println("Es Invierno");
											}
											else
											
												if ( (mes == "ENERO") & (dia>=1 & dia<=31) )
												{
													System.out.println("Es Invierno");
												}
												else
												
													if ( (mes == "FEBRERO" & dia >=1 & dia<=28) )
													{
														System.out.println("Es Invierno");
													}
													else
													
														if ( (mes== "MARZO") & (dia>=1 & dia<=19) )
														{
															System.out.println("Es Invierno");
														}
														else
														
															if ( (mes == "MARZO") & (dia==20) )
															{
																System.out.println("Termina: Invierno");
																System.out.println("Empieza: Primavera");
															}
															else
															
																if ( (mes == "JUNIO") & (dia==21) )
																{
																	System.out.println("Termina: Primavera");
																	System.out.println("Empieza: Verano");
																}
																else
																
																	if ( (mes == "SEPTIEMBRE") & (dia==22) )
																	{
																		System.out.println("Termina: Verano");
																		System.out.println("Empieza: Oto\u00f1o");
																	}
																	else
																	
																		if ( (mes == "DICIEMBRE") & (dia==21) )
																		{
																			System.out.println("Termina: Oto\u00f1o");
																			System.out.println("Empieza: Invierno");
																		}
		}
		else
		{
			System.out.println("Dia Invalido, Por favor ingrese un dia valido.");
		}
	}
}
