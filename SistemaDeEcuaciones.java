import java.util.Scanner;

public class SistemaDeEcuaciones
{
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        
        while (in.hasNext()) {
            
            int N = in.nextInt(); //tamaño de la matriz
            
            int[][] A = new int[N][N]; //F = filas; C = columnas
            //-----CONSTRUCCION DE LA MATRIZ-----
            for (int f = 0; f < N; f++) {
                for (int c = f; c < N; c++) {
                    A[f][c] = in.nextInt();
                }
            }
            
            //(numeros al otro lado del igual)
            int[] B = new int[N];
            for (int k = 0; k < N; k++) {
                B[k] = in.nextInt();
            }
                
                
            //------OPERACION------
            //array de la solucion
            double[] S = new double[N];
            
            for (int y = (N-1); y >= 0; y--){
                if (y == (N-1)) {
                    S[y] = ((double)(B[y]) / (double)(A[y][y]));
                }
                else {
                    for (int h = y+1; h < N; h++){
                        S[y] += A[y][h] * S[h];
                    } 
                    S[y] = (B[y] - S[y]);
                    S[y] /= A[y][y];
                }
            }
            
            //imprimir solucion
            System.out.printf("%d: ", N);
            for (int w = 0; w < N; w++) {
                System.out.printf("%.5f ", S[w]);
            }
            System.out.println();
        }
    }
}
