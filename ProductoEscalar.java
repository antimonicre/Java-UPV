import java.util.Scanner;

public class ProductoEscalar
{
    public static void main(String [] args) 
    {
        Scanner in = new Scanner(System.in);
        
        while ( in.hasNext() ) {
            
            int tamaño = in.nextInt(); //tamaño de los dos arrays
            
            int[] a = new int [tamaño]; //array1
            for (int i = 0; i < tamaño; i++) {a[i] = in.nextInt();} //se asignan los valores del array1
            
            int[] b = new int [tamaño]; //array2
            for (int e = 0; e < tamaño; e++) {b[e] = in.nextInt();} //se asignan los valores del array2
            
            int resultado = 0; //resultado (producto escalar)
            int resultado2 = 0; //resultado multiplicación
            for (int p = 0; p < tamaño; p++) {resultado2 = a[p] * b[p]; resultado = resultado +resultado2;}
            
            System.out.println(resultado);
        }
    }
}
