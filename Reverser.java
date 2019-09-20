import java.util.Scanner;
import java.io.*;

public class Reverser
{
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        
        while(in.hasNext()) {
            long numero = in.nextLong();
            long resto;
            long resultado = 0;
            
                while (numero > 0) {
                    resto = numero % 10;
                    numero = numero/10;
                    resultado = (resultado * 10) + resto;
                }
            
            System.out.printf("%d %n", resultado);
        }
    }
}
