import pe.edu.upeu.OperacionesMat;
import pe.edu.upeu.SubProgramas;
import pe.edu.upeu.util.teclado;

public class App {


    public static void main(String[] args) throws Exception {
        System.out.println("*******Operaciones Basicas*******");
        //OperacionesMat objOB=new OperacionesMat();
        //objOB.operacionesBasicas();*/
        teclado tec=new Teclado();
        SubProgramas obj=new SubProgramas();
        int numero=tec.leer(0, "Ingrese un numero");
        System.out.printlin("Factorial Interativo:"+objSP.factorial(numero));
        System.out.printlin("Factorial Recurcivos:"+objSP.factorialRecurv(numero));
        long ti=System.currentTimeMillis();
        System.out.println("Fibonacci iterativo:"+objSP.fibonacci(numero));
        long tf=System.currentTimeMillis();
        System.out.println("Tiempo ejecucion:"+(tf-ti));
        ti=System.currentTimeMillis();
        System.out.println("Fibonacci recursivo:"+objSP.fibonacciRecur(numero));
        tf=System.currentTimeMillis();
        System.out.println("Tiempo ejecucion:"+(tf-ti));


    }
}
