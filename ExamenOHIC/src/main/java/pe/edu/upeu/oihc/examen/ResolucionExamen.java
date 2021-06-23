package pe.edu.upeu.oihc.examen;
import java.util.Scanner;

public class ResolucionExamen {
    
    static Scanner teclado=new Scanner(System.in);
    public static void ejercicio1(){
        int categoria=0;
        double total=0;
        double monto=0;
        System.out.println("Ingrese cual es la categoria: ");
        categoria=teclado.nextInt();
        System.out.println("Ingrese cuanto es el valor de su auto: ");
        monto=teclado.nextInt();

        if (categoria<2 && categoria>0) {
            total=(monto*12)/100;
        }if (categoria<3 && categoria>1) {
            total=(monto*8)/100;
        }if (categoria<4 && categoria>2) {
            total=(monto*5)/100;
        }if (categoria>=4) {
            System.out.println("La categoria que Usted puso no se encuentra.");
        }
        System.out.println("el monto total que deve pagar es de "+total);
    }

    public static void ejercicio2() {
        int[] vA=new int[20], vB=new int[10];
        for (int i = 0; i < vA.length; i++) {
            vA[i]=(i+1);
            for (int j = 0; j < vB.length; j++) {
                vB[j]=(j+1);
                System.out.println(vA[i]+"x"+vB[j]+"="+(vA[i]*vB[j]));
            }
            System.out.println("");
        }
    }

    public static void ejercicio3() {
        int i, j, suma;
        System.out.println("Números perfectos entre 1 y 1000: ");
        for(i=1;i <= 1000;i++){
            suma = 0;
            for(j = 1;j < i;j++){                         
                 if(i % j==0){
                    suma = suma + j;
                 }
            }
          if(i == suma){           
             System.out.println(i);
          }
        }
    }
    
    public static void ejercicio4() {

        System.out.println("2 ^ " + 4 + " = " + potencia(4));
    }
    public static double potencia(int n){
           if(n==0)
              return 1;
           else
              return 2 * potencia(n-1);
    }

    
}

