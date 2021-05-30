package tareas;
import java.util.Scanner;

public class ejercicios {
    static Scanner teclado=new Scanner(System.in);
    //hallar el are de un circulo poniendo solo radio
    static void pregunta1(){
        //pregunta 4.1
        int años=0;
        double sueldoT=0;
        System.out.println("Ingrese cuantos años tienes trabajando: ");
        años=teclado.nextInt();

        if (años<=6) {  
            sueldoT=1500*(Math.pow((1+0.10),años));
        }if (años>=6) {
            sueldoT=1500;
        }
        System.out.println("El sueldo que le pagaran este año es " +sueldoT);

    }

    static void pregunta2(){
        //Pregunta 4.2
        char hamburguesas;
        String hamburguesasNcomp="";
        double dato1=1, dato2, dato3, total=0;
        System.out.println("Ingrese com va a pagar\nA=Tarjeta\nB=Efectivo: ");
        hamburguesas=teclado.next().charAt(0);
        System.out.println("Ingrese la cantidad de hamburguesas que cuesta 20 soles:");
        dato1=teclado.nextDouble();
        System.out.println("Ingrese la cantidad de hamburguesas que cuesta 25 soles:");
        dato2=teclado.nextDouble();
        System.out.println("Ingrese la cantidad de hamburguesas que cuesta 28 soles:");
        dato3=teclado.nextDouble();
        switch(hamburguesas){
            case 'A' :{
                total=(dato1*(20*5)/100+dato1*20)+(dato2*(25*5)/100+dato2*25)+(dato3*(28*5)/100+dato3*28);
                hamburguesasNcomp="tarjeta";
            } break;
            case 'B' :{
                total=(dato1*20)+(dato2*25)+(dato3*28);
                hamburguesasNcomp="efectivo";
            } break;
            default : System.out.println("La opcion que ingreso no existe! intente nuevamente....");
            break;
        }
        System.out.println("El total a pagar es" +total+ " y escojio la opcion de " +hamburguesasNcomp);
    }

    static void pregunta3(){
        //pregunta
        int ceros=0;
        int menor=0;
        int mayor=0;
        double total=0;
        System.out.println("Indique contos ceros hay:");
        ceros=teclado.nextInt();
        System.out.println("Indique cuantos numeros negativos tiene:");
        menor=teclado.nextInt();
        System.out.println("Indique cuantos numeros positivos tiene:");
        mayor=teclado.nextInt();

        total=ceros+menor+mayor;
        System.out.println("La cantidad de ceros es " +ceros+ " la cantidad de numeros menores son " +menor+ " la cantidad de numeros mayors son " +mayor+ " la cantidad total es de " +total);

    }

    static void pregunta4(){
        //pregunta
        int verde=0;
        int blanco=0;
        int rojo=0;
        double total=0;
        System.out.println("Indique cuantos focos verdes tienes:");
        verde=teclado.nextInt();
        System.out.println("Indique cuantos focos blacos tienes:");
        blanco=teclado.nextInt();
        System.out.println("Indique cuantos focos rojos tienes:");
        rojo=teclado.nextInt();

        total=verde+blanco+rojo;
        System.out.println("La cantidad de focos verdes es un total de" +verde+ " la cantidad de focos blamcos son" +blanco+ " la cantidad de focos rojos son" +rojo+ " la cantidad total de focos es" +total);

    }

    static void pregunta5(){
        int monto=0;
        int porcentaje=0;
        double total=0;
        System.out.println("Cuantas compra iso:");
        monto=teclado.nextInt();
        
        if (monto>=200){
            porcentaje=((monto*15)/100);
            total=monto-porcentaje;
        }if (monto>=100 && monto<200){
            porcentaje=((monto*12)/100);
            total=monto-porcentaje;
        }if (monto>=0 && monto<100){
            porcentaje=((monto*10)/100);
            total=monto-porcentaje;
        }
        System.out.println("El total a pagar es " +total+ " y la rebaja fue " +porcentaje);
    }
    
    static void pregunta6(){
        int monedas1=0;
        int monedas2=0;
        int monedas3=0;
        int monedas4=0;
        int billetes1=0;
        int billetes2=0;
        int billetes3=0;
        int billetes4=0;
        int billetes5=0;
        double total=0;
        System.out.println("Ingrese cuantas monedas de 0.10 hay:");
        monedas1=teclado.nextInt();
        System.out.println("Ingrese cuantas monedas de 0.20 hay:");
        monedas2=teclado.nextInt();
        System.out.println("Ingrese cuantas monedas de 0.50 hay:");
        monedas3=teclado.nextInt();
        System.out.println("Ingrese cuantas monedas de 1.00 hay:");
        monedas4=teclado.nextInt();
        System.out.println("Ingrese cuantas monedas de 10 hay:");
        billetes1=teclado.nextInt();
        System.out.println("Ingrese cuantas monedas de 20 hay:");
        billetes2=teclado.nextInt();
        System.out.println("Ingrese cuantas monedas de 50 hay:");
        billetes3=teclado.nextInt();
        System.out.println("Ingrese cuantas monedas de 100 hay:");
        billetes4=teclado.nextInt();
        System.out.println("Ingrese cuantas monedas de 200 hay:");
        billetes5=teclado.nextInt();

        total=(monedas1*0.1)+(monedas2*0.2)+(monedas3*0.5)+(monedas4*1)+(billetes1*10)+(billetes2*20)+(billetes3*50)+(billetes4*100)+(billetes5*200);
        System.out.println("El total es de " +total);
    }

    static void pregunta7(){
        float alum=1;
        int reprobados=0;
        int aprobados=0;
        System.out.println("Ingrese la cantidad de alumnos:");
        float cn=teclado.nextFloat();
        while (alum<=cn){
            System.out.println("Ingrese la nota que se saco:");
            float n=teclado.nextFloat();
            if (n<13)
                reprobados=reprobados+1;
            if (n>12)
                aprobados=aprobados+1;
            alum++;
        }
        System.out.println("El numero de reprobados es un total de " +reprobados);
        System.out.println("El numero de aprobados es un total de " +aprobados);
    }

    static void pregunta8(){
        float venta=1;
        float suma=0;
        int menor=0;
        int mayor=0;
        System.out.println("Ingrese cuantas ventas realizo:");
        float cn=teclado.nextFloat();
        while (venta<=cn){
            System.out.println("Ingrese cuanto vendio:");
            float n=teclado.nextFloat();
            suma +=n;
            if (n<=10000)
                menor=menor+1;
            if (n>10000 && n<=20000)
                mayor=mayor+1;
            venta++;
        }
        float total=suma;
        System.out.println("El total es de " +total+ " la cantidad menor de 10000 es de " +menor+ "la cantidad mayor de 10000 y menor de 20000 es de " +mayor);
    }

    static void pregunta9(){
        int dato1=0;
        int dato2=0;
        double total=0;
        System.out.println("Ingrese el primer numero que decea multiplicar:");
        dato1=teclado.nextInt();
        System.out.println("Ingrese el segundo numero que decea multiplicar:");
        dato2=teclado.nextInt();

        total=dato1*dato2;
        System.out.println("El resultado es=" +total);
    }

    static void pregunta10(){
        double total=0;
        int años=60;
        total=1500*(Math.pow((1+0.15),años));
        System.out.println("La inversion total que iso hasta este año es un total de " +total);
    }
    
    static void pregunta11(){
        int impuesto1=0;
        int impuesto2=0;
        int impuesto3=0;
        double total=0;
        System.out.println("Ingrese el valor que cuesta el primer vehiculo con clave1");
        impuesto1=teclado.nextInt();
        System.out.println("Ingrese el valor que cuesta el segundo vehiculo con clave1");
        impuesto2=teclado.nextInt();
        System.out.println("Ingrese el valor que cuesta el tercero vehiculo con clave1");
        impuesto3=teclado.nextInt();

        total=(impuesto1*0.10)+(impuesto2*0.07)+(impuesto3*0.05);
        System.out.println("El monto a pagar es de " +total);
    }

    static void pregunta12(){
        int depoci=0;
        int meses=0;
        double total=0;
        System.out.println("Cuanto depocita cada mes:");
        depoci=teclado.nextInt();
        System.out.println("Cuantos meses depocito:");
        meses=teclado.nextInt();

        total=depoci*(Math.pow((1.10),meses));
        System.out.println("El total que ahorro es:" +total);
    }

    public static void main(String[] args) {
        pregunta12();
        
    }
    
}
