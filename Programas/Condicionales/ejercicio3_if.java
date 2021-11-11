/* Instituto Tecnológico de Culiacán
Campos Delgado Baltazar
Unidad 2 Fundamentos de programacion */

import java.util.Scanner;

public class ejercicio3_if {

    public static void main(String[] args) { 
        
        Scanner teclado = new Scanner(System.in);
        float nota1, nota2, nota3, promedio;
        
        System.out.print("[*] Ingrese la primer nota del alumno: ");
        nota1 = teclado.nextFloat();
        System.out.print("[*] Ingrese la segunda nota del alumno: ");
        nota2 = teclado.nextFloat();
        System.out.print("[*] Ingrese la tercera nota del alumno: ");
        nota3 = teclado.nextFloat();
        promedio = (nota1+nota2+nota3)/3;
        
        if (promedio >= 7){
            System.out.println("Calificacion aprobatoria");
        }else if(promedio < 7){
            System.out.println("Calificacion reprobatoria");
        }
    }
    
}