import java.util.Scanner;

public class ProductoDeMatrices
{
    public static void main(String [] args) 
    {
        Scanner in = new Scanner(System.in);
        
        while ( in.hasNext() ) {
            
            //------CONSTRUCCION MATRICES------
            //~MATRIZ1~ 
            //establecer tamaño
            int tamañoF = in.nextInt(); //número de filas de matriz1
            int tamañoC = in.nextInt(); //número de columnas de matriz1
            
            int[][] matriz1 = new int [tamañoF] [tamañoC]; //matriz1
            for (int f = 0; f < tamañoF; f++) {           //se asignan los valores de matriz1
                for (int c = 0; c < tamañoC; c++) {
                    matriz1[f][c] = in.nextInt();
                }
            }
            
            //MATRIZ2
            //
            int tamaño2F = in.nextInt(); //número de filas de matriz2
            int tamaño2C = in.nextInt(); //número de columnas de matriz2
            
            int[][] matriz2 = new int [tamaño2F] [tamaño2C]; //matriz2
            for (int f = 0; f < tamaño2F; f++) {             //se asignan los valores de matriz2
                for (int c = 0; c < tamaño2C; c++) {
                    matriz2[f][c] = in.nextInt();
                }
            }
            
            //------ERROR------
            if (tamañoC != tamaño2F) {
            System.out.println("Number of columns of first matrix is not equal to the number of rows of the second one!");}
            
           //------PRODUCTO DE MATRICES------
            else {
            int[][] matriz3 = new int [tamañoF] [tamaño2C]; //matriz3 (resultado)
            
            System.out.println(tamañoF + " " + tamaño2C);
            
            for (int c = 0; c < tamaño2C; c++) {
                for (int f = 0; f < tamañoF; f++) {
                    for (int r = 0; r < tamaño2F; r++) {
                        matriz3[f][c] += (matriz1[f][r] * matriz2[r][c]); }
                    }
                }
            
            //se representa la matriz del resultado
            for (int f = 0; f < tamañoF; f++) {             
                for (int c = 0; c < tamaño2C; c++) {
                    System.out.print(" ");
                    System.out.printf("%5d", matriz3[f][c]);
                    System.out.print(" ");
                }
                System.out.print("\n");
            }
           }
        }
    }
}
