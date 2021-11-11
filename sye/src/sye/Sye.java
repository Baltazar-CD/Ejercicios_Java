/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sye;

/**
 
 * @author Juan Pablo Felix Inzunza y Baltazar Campos Delgado
 */
import java.util.Random;
public class Sye {
    // Variables globales
    public static int suma;
    public static int serpientes[]={30,40,54,79,90,93,98};
    public static int bajan[]= {8,4,37,42,33,69,64};
    public static int escaleras[]= {3,14,31,44,47,59,63,72};
    public static int suben[]={39,36,70,65,86,80,83,91};
    public static int pos[];
    public static int turno=0;
    public static boolean juegoTerminado=false;
    public static String nombreJugadores[];
    
    // Metodo principal
    public static void main(String args[]) {
        // Variables locales
        String nom[] = {"Maria","Ana","Lupe","Karla","Cecilia","Katy","Elizabeth","Sofia","Mario","Juan","Pedro","Jose","Simon","Kenay","Eleazar","Samuel"};           
        String apellido[] = {"Gonzalez","Lopez","Gutierrez","Estrada","Noriega","Peralta","Quintero","Carrillo"};
        int nJugadores;                
        Random n= new Random();               
        int tirar;
        
        // iniciar juego
        // Leer el numero de jugadores
        do{
            System.out.println("Inserte numero de jugadores (2-5)");
            nJugadores=Keyboard.readInt();
            nombreJugadores=new String[nJugadores];
            pos= new int[nJugadores];
            // Mensaje de error
            if(nJugadores<2 || nJugadores>5){
                System.out.println("Rango invalido, ingres un valor correcto");
            }
        }while(nJugadores<2 || nJugadores>5);

        // Ingresar nombre de jugadores      
        for(int i=0;i<nombreJugadores.length;i++){
            nombreJugadores[i]=nom[n.nextInt(16)]+" "+apellido[n.nextInt(8)];
        }

        for (String nombreJugadore : nombreJugadores) {
            System.out.println(nombreJugadore);
        }

        do{
            if(turno==0){
                System.out.println("Jugador: "+nombreJugadores[turno]+" presione (1) para lanzar los dados");
                tirar=Keyboard.readInt();
                if(tirar==1){
                    arrojarDados();
                    pos[0]+=suma;
                    System.out.println("Nueva posición: "+pos[0]);
                    revisar();
                    fin();
                    System.out.println("---------------------------------------------");
                    turno=1;                        
                    tirar=0;
                }
            }else if(turno==1){
                System.out.println("Jugador: "+nombreJugadores[turno]+" presione (1) para lanzar los dados");
                    tirar=Keyboard.readInt();
                    if(tirar==1){
                        arrojarDados();
                        pos[1]+=suma;
                        System.out.println("Nueva posición: "+pos[1]);
                        revisar();
                        fin();
                        System.out.println("---------------------------------------------");
                        turno=2;
                        if (turno>=nombreJugadores.length){
                            turno=0;
                        }
                        tirar=0;
                    }
            }else if(turno == 2){
                System.out.println("Jugador: "+nombreJugadores[turno]+" presione (1) para lanzar los dados");
                    tirar=Keyboard.readInt();
                    if(tirar==1){
                        arrojarDados();
                        pos[2]+=suma;
                        System.out.println("Nueva posición: "+pos[2]);
                        revisar();
                        fin();
                        System.out.println("---------------------------------------------");
                        turno=3;
                        if (turno>=nombreJugadores.length){
                            turno=0;
                        }
                        tirar=0;
                    }
            }else if(turno == 3){
                System.out.println("Jugador: "+nombreJugadores[turno]+" presione (1) para lanzar los dados");
                    tirar=Keyboard.readInt();
                    if(tirar==1){
                        arrojarDados();
                        pos[3]+=suma;
                        System.out.println("Nueva posición: "+pos[3]);
                        revisar();
                        fin();
                        System.out.println("---------------------------------------------");
                        turno=4;
                        if (turno>=nombreJugadores.length){
                            turno=0;
                        }
                        tirar=0;
                    }
            }else if(turno==4){
                System.out.println("Jugador: "+nombreJugadores[turno]+" presione (1) para lanzar los dados");
                    tirar=Keyboard.readInt();
                    if(tirar==1){
                        arrojarDados();
                        pos[4]+=suma;
                        System.out.println("Nueva posición: "+pos[4]);
                        revisar();
                        fin();
                        System.out.println("---------------------------------------------");
                        turno=0;
                        tirar=0;
                    }
            }
        }while(juegoTerminado==false);
            // fin del juego
    }
        
        
        /*
        for(int i=0;i<tablero.length;i++){
        tablero[i]=i+1;
        }
        for(int i=0;i<tablero.length;i++){
        System.out.println(tablero[i]);
        }*/
     
        
    public static void arrojarDados(){
        Random r= new Random();
        int dados[]= new int [2];
        int num []= {1,2,3,4,5,6};
        for (int i=0;i<dados.length;i++){
            dados[i]=num[r.nextInt(6)];
        }
        suma=dados[0]+dados[1];
        System.out.println(dados[0]+" "+dados[1]);
        System.out.println("Avanza "+suma+" casillas");
    }
    
    public static void revisar(){
        for(int i=0;i<serpientes.length;i++){
            if(pos[turno]==serpientes[i]){
                pos[turno]=bajan[i];
                System.out.println("Terminaste en una serpiente, tu nueva posición es: "+pos[turno]);
            }
        }
        
        for(int i=0;i<escaleras.length;i++){
            if(pos[turno]==escaleras[i]){
                pos[turno]=suben[i];
                System.out.println("Terminaste en una escalera, tu nueva posición es: "+pos[turno]);
            }
        }
    }
    
    public static void fin(){
        if(pos[turno]>100){
            int resta=pos[turno]-100;
            pos[turno]=100-resta;            
            System.out.println("Has sobrepasado el limite del tablero, tu nueva posición es: "+pos[turno]);
            revisar();
        }
        
        if(pos[turno]==100){
            juegoTerminado=true;
            System.out.println("Felicidades "+nombreJugadores[turno]+" has ganado el juego!!!");
        }
    }
}
