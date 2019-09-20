import java.util.Scanner;
import java.util.*;
import java.io.*;

public class CuentaLetrasPalabras {
    public static void main(String [] args) 
    {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        Scanner reader = null;
        
        try {
            System.out.println("Introduzca el nombre del fichero que quiere utilizar: ");
            reader= new Scanner(new File(input.next() + ".txt"));
            System.out.println("Desea emplear el contador de letras o de palabras??  A: letras  B: palabras");
           
            String in = input.next().toUpperCase();
            
            //Variables comunes:
            int numlin = 0; //para las lineas
            int numwl = 0; //para las palabras o letras
            
            if (in.equals("A")) {
                int numdig = 0; //para los digitos
                
                while ( reader.hasNextLine() ) {
                    
                    String texto = reader.nextLine();
                    Scanner sw = new Scanner(texto);
                    
                    while ( sw.hasNext() ) {
                        String letter = sw.next();
                        
                        if (letter != " . " || letter != " , ") {
                            for (int i = 0; i < letter.length(); i++){
                                if (Character.isLetter(letter.charAt(i))) {numwl++;}
                                else if (Character.isDigit(letter.charAt(i))) {numdig++;}
                            }
                        }
                    }
                
                    numlin++;
                
                }
            
                System.out.printf(numwl + " letters%n" + numdig + " digits%n" + numlin + " lines%n" );
                
            }
        
            else if (in.equals("B")) {
            
                while ( reader.hasNextLine() ) 
                {
                
                    String texto = reader.nextLine();
                    Scanner sw = new Scanner(texto);
                
                    while ( sw.hasNext() )
                    {
                        sw.next();
                        numwl++;
                    }
                
                    numlin++;
                
                }
            
                System.out.printf(numwl + " words%n" + numlin + " lines%n");
                
            }
            else {
                System.out.print("Vuelva a intentarlo");
            }
        } catch (FileNotFoundException f) {
            System.out.println("Fichero no encontrado.");
        } finally {
            if (input != null) {input.close();}
            if (reader != null) {reader.close();}
        }
        
    }
}