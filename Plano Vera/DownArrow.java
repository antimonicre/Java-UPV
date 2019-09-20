package Examenes.PlanoVera;

public class DownArrow
{
    public static void DownA(int n) {
        int j = 2;
        for ( int x = 0; x < n; x++) {
            for (int y = 0; y < x; y++) {System.out.print("-");}
            System.out.print("V");
            for (int y = 0; y < (n*2)-j; y++) {System.out.print("-");}
            System.out.print("V");
            for (int y = 0; y < x; y++) {System.out.print("-");}
            System.out.println();
            j += 2;
        }
    }
    
    public static boolean Orden(double[] array) {
        boolean res = false;
        int i = 0;
        while (i < array.length) {
            if (array[i] <= array[i+2]) {res = true;}
            else {res = false;}
            i+=2;
        }
        return res;
    }
    
}
