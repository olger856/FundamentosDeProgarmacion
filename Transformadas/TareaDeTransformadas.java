package Transformadas;

public class TareaDeTransformadas {
    
    public void imprimirContenidoMatrizCadena(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j]!=null && !matriz[i][j].equals("")){
                    System.out.print(matriz[i][j]+"\t");
                }else{
                    System.out.print("\t");
                }                
            }
            System.out.println("");
        }        
    }     
     
    public String[][] transformada05(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][i-j]=""+numInit;
                numInit++;
            }
        }
        return matriz;
    }
    public void transformada12(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= (dimen-1)-i; j++) {
                matriz[i][(dimen-1)-j]=""+numInit;
                numInit++;
            }
        }
        TareaDeTransformadas tm=new TareaDeTransformadas(); 
        tm.imprimirContenidoMatrizCadena(matriz);        
    }
    public void transformada01(int dimension, int valorInicial) {
        int item=0;
        int[][] matriz=new int[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int colum = 0; colum< matriz.length; colum++) {
                if(colum<dimension-fila){
                item=valorInicial+(fila+colum)*(fila+colum+1)/2 + fila; 
                matriz[fila][colum]=item;
                }
            }
        }        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(j<matriz.length-i){
                System.out.print(matriz[i][j]+"\t");
                }else{
                System.out.print("\t");
                }
            }
            System.out.println("");
        }          
    }
    public void transformada01x(int dimension, int valorInicial) {
        int item=0;
        String[][] matriz=new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int colum = 0; colum< matriz.length; colum++) {
                if(colum<dimension-fila){
                item=valorInicial+(fila+colum)*(fila+colum+1)/2 + fila; 
                matriz[fila][colum]=""+item;
                }else{
                    matriz[fila][colum]="";
                }
            }
        }  
        imprimirContenidoMatrizEnteros(matriz);              
    }    
    public void imprimirContenidoMatrizEnteros(Object[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }        
    } 
    public void imprimirContenidoMatrizEnteros(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 1; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }        
    }   
    public void transformada21(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int j = 0; j < matriz[0].length; j++) {
            if (j%2==0) {
                for (int i = 0; i < matriz.length; i++) {
                    matriz[i][j]=""+numInit;
                    numInit++;
                }
            } else {
                for (int i = matriz.length-1; i >=0 ; i--) {
                    matriz[i][j]=""+numInit;
                    numInit++;
                }                
            } 
        }
        TareaDeTransformadas tm=new TareaDeTransformadas();  
        tm.imprimirContenidoMatrizCadena(matriz);        
    }
    public void transformada15(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= (dimen-1)-j; j++) {
                matriz[i][(dimen-1)-j]=""+numInit;
                numInit++;
            }
        }
        TareaDeTransformadas tm=new TareaDeTransformadas(); 
        tm.imprimirContenidoMatrizCadena(matriz);        
    }

    
    public static void main(String[] args) {    
        TareaDeTransformadas tm=new TareaDeTransformadas();  
        //tm.transformada01(5, 1);  
        //System.out.println("");
        //tm.transformada01x(5,1);    
        //System.out.println("");
        //tm.imprimirContenidoMatrizCadena(tm.transformada05(5, 0));
        //System.out.println("");
        //tm.transformada12(5, 0);
        //System.out.println("");
        //tm.transformada21(5, 0);
        System.out.println("");
        tm.transformada15(8, 0);
    }
}