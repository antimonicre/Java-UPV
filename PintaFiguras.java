import java.util.Scanner;

public class PintaFiguras
{
   public static void main(String [] args) 
    {
        Scanner in = new Scanner(System.in);
        
        while ( in.hasNext() ) {
            
            String figura = in.next();
            int tamaño = in.nextInt();
            String simbolo = in.next();
        
            if (figura.equals("square")) {
                int x;
                int y;
                for (y = 0; y < (tamaño); y++) {
                    for (x = 0; x < (2*tamaño); x++) {
                    System.out.printf(simbolo);
                    }
                    System.out.print("\n");
                }
                
            }
            
            else if (figura.equals("down-arrow")) {
                int x;
                int y;
                int e;
                // simbolo, tamaño
                int tamaño2;
                String cadena = "";
                String espacio = "";
                for (y = 0; y < tamaño; y++) {
                   tamaño2 = tamaño*2-1 - espacio.length()*2;
                   cadena = "";
                   for (x = 0; x < (tamaño2); x++) {cadena = cadena + simbolo;}
                   System.out.print(espacio + cadena + "\n");
                   espacio = espacio + " ";
                }
            }
            
            else if (figura.equals("triangle")) {
                int x;
                int y;
                int e;
                int tamaño2 = 1;
                String espacio = "";
                for (e = 1; e < (tamaño); e++) {espacio = espacio + " ";}
                for (y = 0; y < tamaño; y++) {
                    System.out.print(espacio);
                    for (x = 0; x < tamaño2; x++) {
                    System.out.printf(simbolo);
                    }
                    tamaño2 = tamaño2 + 2;
                    System.out.printf("\n");
                    if (-1 < espacio.length()-1) {
                        espacio = espacio.substring(0,espacio.length()-1); }
                }
            }
            
            else if (figura.equals("diamond")) {
                int x;
                int y;
                int e;
                // simbolo, tamaño
                int tamaño2;
                String cadena = "";
                String espacio = "";
                for (e = 0; e < (tamaño); e++) {espacio = espacio + " ";}
                for (y = 0; y < tamaño*2-1; y++) {
                    if (y < tamaño) {
                    espacio = espacio.substring(0,espacio.length()-1);
                   }
                   else { espacio = espacio + " ";  }
                   
                    tamaño2 = tamaño*2-1 - espacio.length()*2;
                    cadena = "";
                    for (x = 0; x < (tamaño2); x++) {cadena = cadena + simbolo;}
                    System.out.print(espacio + cadena + "\n");

                }
           }
        
            
            else if (figura.equals("right-arrow")) {
                int x;
                int y;
                int e;
                // simbolo, tamaño
                int tamaño2;
                int tamaño3 = tamaño*2 -1;
                String cadena = "";
                for (y = 0; y < tamaño*2-1; y++) {
                    if (y < tamaño) {
                    tamaño3 -= 2;
                   }
                   else { tamaño3 += 2; }
                    tamaño2 = tamaño*2-2 - tamaño3;
                    cadena = "";
                    for (x = 0; x < (tamaño2); x++) {cadena = cadena + simbolo;}
                    System.out.print(cadena + "\n");
                }
            }
            
            else if (figura.equals("left-arrow")) {
                int x;
                int y;
                int e;
                // simbolo, tamaño
                int tamaño2;
                String cadena = "";
                String espacio = "";
                for (e = 0; e < (tamaño*2); e++) {espacio = espacio + " ";}
                for (y = 0; y < tamaño*2-1; y++) {
                    if (y < tamaño) {
                    espacio = espacio.substring(0,espacio.length()-2);
                   }
                   else { espacio = espacio + "  ";  }
                   
                    tamaño2 = tamaño*2-1 - espacio.length();
                    cadena = "";
                    for (x = 0; x < (tamaño2); x++) {cadena = cadena + simbolo;}
                    System.out.printf(espacio + cadena + "\n");

                }
            }
           
           else if (figura.equals("trapecious")) {
                int x;
                int y;
                int e;
                int tamaño2 = tamaño;
                String espacio = "";
                for (e = 1; e < (tamaño); e++) {espacio = espacio + " ";}
                for (y = 0; y < tamaño; y++) {
                    System.out.print(espacio);
                    for (x = 0; x < tamaño2; x++) {
                    System.out.printf(simbolo);
                    }
                    tamaño2 = tamaño2 + 2;
                    System.out.printf("\n");
                    if (-1 < espacio.length()-1) {
                        espacio = espacio.substring(0,espacio.length()-1); }
                }
            }
            
           if (in.hasNext()) {System.out.printf("\n");}
        }
    }
}