
import java.util.*;

public class DivideReales 
{
    private double a;
    private double b;
    
    public static void main(String [] args) 
    {
        
        Scanner input = new Scanner( System.in ).useLocale( Locale.US );
        
        while( input.hasNext() ) {
            
            double a = input.nextDouble();
            double b = input.nextDouble();
            
            if (a/b == Double.POSITIVE_INFINITY) {
                System.out.printf( " %.7f / %.7f = Infinite", a, b, "Infinite" );
            }
            else if (a/b == Double.NEGATIVE_INFINITY) {
                System.out.printf( " %.7f / %.7f = -Infinite", a, b, "-Infinite" );
            }
            else if (Double.isNaN(a/b)) {
                System.out.printf( " %.7f / %.7f = Not a Number", a, b, "Not a Number" );
            }
            
            else {
                System.out.printf( " %.7f / %.7f = %.7f",a, b, a/b );
            }
            
        
        }
    }
}

