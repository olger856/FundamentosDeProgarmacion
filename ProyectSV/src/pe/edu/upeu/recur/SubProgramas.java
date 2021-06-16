package ProyectSV.src.pe.edu.upeu.recur;

import java.math.BigInteger;

public class SubProgramas {
    
    public long factorial(int numero) { 
        long resultF=1;
        if(numero>1){
            for (int i = 1; i <= numero; i++) {
                resultF*=i;
            }
        }   
        return resultF;
    }
    public BigInteger factorialBig(int numero) { 
        BigInteger resultF=new BigInteger("1");
        if(numero>1){
            for (int i = 1; i <= numero; i++) {
                resultF=resultF.multiply(new BigInteger(String.valueOf(i)));
            }
        }   
        return resultF;
    }    

    public BigInteger factorialRecurvBig(int numero) {
        BigInteger resultF=new BigInteger("1");
        if(numero>1){
            return factorialRecurvBig(numero-1).multiply(new BigInteger(String.valueOf(numero)));          
        } else{
            return resultF; 
        }                        
    }

    public static int numeroFibonaci(int numFinal){
        int numAnt=0, numNue=1,numTem=0,contador=1;
        while(contador<numFinal){
          numTem=numNue;
          numNue=numAnt+numNue;
          numAnt=numTem;     
          contador++;
        }
        return numNue;
    }

}
