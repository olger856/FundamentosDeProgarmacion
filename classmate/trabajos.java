package classmate;
import java.util.Scanner;

public class trabajos {
    static Scanner teclado=new Scanner(System.in);
    //hallar el are de un circulo poniendo solo radio
    static void pregunta2(){
        int radioX=0;
        double areaX=0;
        System.out.println("Ingrese el radio de circulo: ");
        radioX=teclado.nextInt();

        areaX=3.14*radioX*radioX;
        System.out.println("El area del circulo es " +areaX);

    }

    static void pregunta3(){
        int monto=0;
        int descuento=0;
        double total=0;
        System.out.println("Ingrese el monto de su compra: ");
        monto=teclado.nextInt();

        descuento=(monto*20)/100;
        total=monto-descuento+((monto*15)/100);
        System.out.println("El area del circulo es " +total+ "y el descuento realizado fue " +descuento);

    }


    static void pregunta1(){
        int dato=0;
        double total=0;
        System.out.println("Ingrese el nuemro que desea: ");
        dato=teclado.nextInt();

        total=(dato*(dato+1))/2;
        System.out.println("La suma total de los numeros es " +total);




        }
            
        public static void main(String[] args) {
            pregunta2();
            pregunta3();
            pregunta1();
    }



    
}
