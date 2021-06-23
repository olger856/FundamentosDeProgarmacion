package pe.edu.upeu.oihc;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
        
    }
    static Scanner teclado=new Scanner(System.in);
        public static void menuMain(){
            String mensaje="Seleccion el algoritmo que desea ejecutar:"+
            "\n1=problema1"+
            "\n2=problema2"+
            "\n3=problema3"+
            "\n3=problema4"+
            "\n0=Salir del programa";
            
            System.out.println(mensaje);
            int opcion=0;
            do{
                opcion=teclado.nextInt();
                switch(opcion){
                    case 1: ejercicio1();break;
                    case 2: ejercicio2();;break;
                    case 3: ejercicio3();break;
                    case 4: ejercicio4();;break;
                }
                if(opcion!=0)
                System.out.println("\n Desea seguir probando: "+mensaje);
                
            }while(opcion!=0);        
        }
}
