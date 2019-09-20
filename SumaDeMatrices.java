import java.util.Scanner;

public class SumaDeMatrices
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
            if (tamañoF != tamaño2F || tamañoC != tamaño2C) {
            System.out.println("Impossible to add two matrices of different dimensions!");}
            
           //------SUMA DE MATRICES------
            else {
            int[][] matriz3 = new int [tamañoF] [tamañoC]; //matriz3 (resultado)
            
            System.out.println(tamañoF + " " + tamañoC);
            
            for (int f = 0; f < tamañoF; f++) {             //se asignan los valores de matriz3
                for (int c = 0; c < tamañoC; c++) {
                    matriz3[f][c] = matriz1[f][c] + matriz2[f][c];
                }
            }
            
            for (int f = 0; f < tamañoF; f++) {             //se asignan los valores de matriz3
                for (int c = 0; c < tamañoC; c++) {
                    System.out.print(" ");
                    System.out.printf("%4d", matriz3[f][c]);
                }
                System.out.print("\n");
            }
           }
        }
    }
}
