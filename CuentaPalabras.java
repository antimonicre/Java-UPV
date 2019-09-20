
import java.util.Scanner;
import java.util.*;


public class CuentaPalabras 
{
    public static void main(String [] args) 
    {
        Scanner st = new Scanner(System.in);
        
        int numw = 0;
        int numl = 0;
        
        while ( st.hasNextLine() ) 
        {
            
            String texto = st.nextLine();
            Scanner sw = new Scanner(texto);
            
            while ( sw.hasNext() )
            {
                sw.next();
                numw++;
            }
            
            numl++;
            
        }
        
        System.out.printf(numw + " words%n" + numl + " lines%n");
        
    }
}