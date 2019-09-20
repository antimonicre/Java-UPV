
import java.util.Scanner;
import java.util.*;
import java.io.*;


public class CuentaLetras
{
    public static void main(String [] args) 
    {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Desea emplear el contador de letras o de palabras??  A: letras  B: palabras");
		String input = input.next();
		if (input.equals("A")) {
        int numlin = 0;
        int numdig = 0;
        int numlet = 0;
        
        while ( input.hasNextLine() ) 
        {
            
            String texto = input.nextLine();
            Scanner sw = new Scanner(texto);
            
            while ( sw.hasNext() ) {
                String letter = sw.next();
                
                if (letter != " . " || letter != " , ") {
                    for (int i = 0; i < letter.length(); i++){
                        if (Character.isLetter(letter.charAt(i))) {numlet++;}
                        else if (Character.isDigit(letter.charAt(i))) {numdig++;}
                    }
                }
            }
            
            numlin++;
            
        }
        
        System.out.printf(numlet + " letters%n" + numdig + " digits%n" + numlin + " lines%n" );
        
    
	}
}