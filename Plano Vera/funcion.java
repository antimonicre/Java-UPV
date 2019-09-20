package Examenes.PlanoVera;

import java.util.Scanner;

public class funcion {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        if (n > 0) {
        System.out.print("f(" + n + ")" + " = ");
        
        if (n%2 != 0) { n = ((n/2)/2) + ((n/2)/2)+1; }
        else {n/=2;}
            
        System.out.print(n + "\n");
      
       }
       
    }
}