
import java.util.*;


public class SumaReales 
{
        private double a;
        private double b;
        
        public static void main(String [] args) 
        {
            Scanner input = new Scanner( System.in ).useLocale( Locale.US );
        
            while( input.hasNext() ) {
            
                double a = input.nextDouble();
                double b = input.nextDouble();
        
                System.out.printf(" %.3f + %.3f = %.3f",a,b, a+b );
        
            }
        }
}
