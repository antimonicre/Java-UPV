
import java.util.*;
import java.lang.Math;

public class EcuacionSegundoGrado 
{
    private int a;
    private int b;
    private int c;
    
    private double ecuac1;
    private double ecuac2;
    private double raiz;
    private double abs;
    private double prm;
    
    public static void main(String [] args) 
    {
        Scanner input = new Scanner( System.in ).useLocale( Locale.US );
        
        while( input.hasNext() ) {
            
			System.out.println("Introduce el valor de a,b y c: ");
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            
            double ecuac1 = ( (-b + (Math.sqrt(Math.pow(b, 2) -(4.0*a*c)))) / (2.0*a) ); 
            double ecuac2 = ( (-b - (Math.sqrt(Math.pow(b, 2) - (4.0*a*c)))) / (2.0*a) );
            double raiz = ( (Math.pow(b, 2)) - (4.0*a*c) );
            double prm = (-b/(2.0*a));
            double abs = ( (Math.sqrt(Math.abs(raiz))) / (2.0*a) );
            
            if (a != 0) {
                if (b != 0) {
                    if (c == 0) {
                        if (ecuac1 == -0.) { ecuac1 = 0; }
                        if (ecuac2 == -0.) { ecuac2 = 0; }
                        System.out.printf( "%.4f   y   %.4f%n", ecuac1, ecuac2 );
                    }
                    
                    else if (c!= 0) {
                        if ( raiz > 0 ) {
                            if (ecuac1 == -0.) { ecuac1 = 0; }
                            if (ecuac2 == -0.) { ecuac2 = 0; }
                            System.out.printf( "%.4f   y   %.4f%n", ecuac1, ecuac2 );
                        }
                    
                        else if ( raiz < 0 ) {
                            if (prm == -0.) { prm = 0; }
                            if (abs == -0.) { abs = 0; }
                            System.out.printf("%.4f + %.4fi  y  %.4f - %.4fi%n", (prm), Math.abs(abs), (prm), Math.abs(abs) );
                        }
                
                        else if ( raiz == 0 ) {
                            System.out.printf( " %.4f doble%n", Math.abs(ecuac1) );
                        }
                    }
                }
                
                else if (b == 0) {
                    if (c == 0) {
                        System.out.printf( " %.4f doble%n", Math.abs(ecuac1) );
                    }
                    
                    else if (c != 0) {
                        if ( raiz > 0 ) {
                            if (ecuac1 == -0.) { ecuac1 = 0; }
                            if (ecuac2 == -0.) { ecuac2 = 0; }
                            System.out.printf( "%.4f   y   %.4f%n", ecuac1, ecuac2 );
                        }
                    
                        else if ( raiz < 0 ) {
                            if (prm == -0.) { prm = 0; }
                            if (abs == -0.) { abs = 0; }
                            System.out.printf("%.4f + %.4fi  y  %.4f - %.4fi%n", (prm), Math.abs(abs), (prm), Math.abs(abs) );
                        }
                
                        /*else if ( raiz == 0 ) {
                           System.out.printf( " %.4f doble ", Math.abs(ecuac1) );
                        }*/
                    }
                }   
            }
            else if (a == 0) {
                if (b != 0) {
                    if (c != 0) {
                        System.out.printf( a + " " + b + " " + c + "  " );
                        System.out.printf("%.4f  de primer grado%n", (double)((double)(-c)/(double)b));
                    }
                    
                    else if (c == 0) {
                        System.out.printf( a + " " + b + " " + c + "  " );
                        System.out.printf("%.4f  de primer grado%n", Math.abs((double)((double)(-c)/(double)b)));
                    }
                }
                else if (b == 0) {
                    if (c != 0) {
                        System.out.printf( "indeterminado%n" );
                    }
                    
                    else if (c == 0) {
                        System.out.printf( "infinitas soluciones%n" );
                    }
                }
            }   
        }
    }
}
