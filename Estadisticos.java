import java.util.Scanner;

public class Estadisticos
{
    public static void main (String [] args) {
        
        Scanner in = new Scanner (System.in);
        
        while ( in.hasNext() ) {
            
        int N = in.nextInt(); //tamaño del array
        
        //almacenar datos en el array
        int[] X = new int [N]; //conjunto de datos X
        System.out.print("\n");
        
        //CONSTRUCCION DEL ARRAY
        for (int i = 0; i < N; i++) {X[i] = in.nextInt();}
        
        //---OUTPUT---
        //1)media aritmetica(average) --> (1/N) * (sum(X[i]))
        
        int xt = 0; //sumatorio de xi
        for (int i = 0; i < N; i++) {xt += X[i];}
        double x = (1/(double)N) * xt;
        System.out.printf("%s %.3f ", "average:", x);
        
        // 2)varianza^2(variance) --> (1/N) * (sum ((X[i] - X)^2))
        
        double vt = 0; //sumatorio de xi
        for (int i = 0; i < N; i++) {vt += ((X[i]-x)*(X[i]-x));}
        double v = (1/((double)N - 1)) * vt;
        System.out.printf(" \n%s %.3f ", "variance:", v);
        
        //3)desviacion tipica (standard deviation) --> SQRT.v
        double dt = Math.sqrt(v);
        System.out.printf("\n%s %.3f ", "standard deviation:", dt);
        
        // 4)minimo y maximo(min and max)
        double min = X[0];
        double max = X[0];
        
        for(int i = 0; i < N; i++) {
            //--MINIMO--
            if(min > X[i]){
                min=X[i];
            }
            //--MAXIMO--
            if(max < X[i]){
                max = X[i];
            }
        }
        System.out.printf(" \n%s %.3f %.3f ", "min and max:", min, max);
        
        
        //5)mediana(median) --> el valor que cumple que la mitad son inferiores y
                                             //la otra mitad son mayores o iguales
        double me = 0.0;
        for (int i = 0; i < N; i++) {
            int e = i;
           while(e > 0 && X[e] < X[e-1]) {
            int temp = X[e];
            X[e] = X[e-1];
            X[e-1] = temp;
            --e;
            }
            e=i;
        }
        //si N es par
        if (N%2 == 0) {
            me = ((X[(N/2)-1]) + (X[(N/2)]))/2.0;
        }
        //si N es impar
        else {
            me = X[(N/2)];
        }
        System.out.printf(" \n%s %.3f ", "median:", me);
        
        //6)moda --> valor que mas se repite
        //cuenta la frecuencia de cada numero
        for (int i = 0; i < N; i++) {
            int e = i;
           while(e > 0 && X[e] < X[e-1]) {
            int temp = X[e];
            X[e] = X[e-1];
            X[e-1] = temp;
            --e;
            }
            e=i;
        }
        int[] moda = new int [N];
        int mo = 0;
        for (int i = 0; i < N; i++) {
            for (int e = 0; e < N; e++) {
                if (X[i]==X[e]) {mo++;}
            }
            moda[i] = mo;
            mo = 0;
        }
        
        //averigua que numero es
        double m = 0;
        int i = 0;
        for (int a = 0; a < N; a++) {
            if (moda[i] >= moda[a]) {m = X[i];}
            else {m = X[a]; i = a;}
        }
        
        System.out.printf(" \n%s %.3f\n", "mode:", m);
      } 
    }
}