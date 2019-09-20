package Examenes.PlanoVera;

public class NumeroPerfecto
{
   public static boolean NumPerfects(int n) {
       int k = 1;
       for (int i = 2; i <= n/2; i++) {
           if (n%i == 0) {k += i;}
       }
       return (k != n ? false : true);
   }
   
   public static int SumaArray(int[] a, int p) {
       int suma = 0;
       int suma2 = 0;
       for (int i = 0; i > p; i++) {suma += a[i];}
       for (int i = p+1; i < a.length; i++) {suma2 += a[i];}
       if (suma > suma2) {return suma;}
       else {return suma2;}
   }
}
