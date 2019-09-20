import java.util.Scanner;

/**
 * Reproduce con iconos la figura demandada por el usuario
 * 
 * @author vantmonk 
 * @version 2.0
 */
public class Pintafiguras_2
{
    public static void main(String args[]) {
        //Se pregunta por la figura deseada
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println("Introduzca la figura que desea dibujar: ");
            String figura = sc.next();
            System.out.println("Introduzca los iconos que desea utilizar: ");
            String icono = sc.next();
            System.out.println("Introduzca el tamaño de su figura: ");
            int tamaño = sc.nextInt();
            int x; int y; String espacio = ""; String cadena = ""; int tamaño2;
        
            //Dependiendo de la figura introducida:
            if (figura.equals("square")) {
                for (y = 0; y < tamaño; y++) {
                    for (x = 0; x < 2*tamaño; x++) {
                        System.out.print(icono);
                    }
                    System.out.println();
                }
            }
            else if (figura.equals("down-arrow")) {
                tamaño2 = tamaño*2-1;
                for (y = 0; y <= tamaño; y++) {
                    if(y>0) {System.out.print(espacio);}
                    for (x = 0; x < tamaño2; x++) {
                        System.out.print(icono);
                    }
                    espacio+= " ";
                    tamaño2 -= 2;
                    System.out.println();
                }
            }
            else if (figura.equals("triangle")) {
                tamaño2 = 1;
                for (int e = 1; e < tamaño; e++) {espacio += " ";}
                for (y = 0; y < tamaño; y++){
                    System.out.print(espacio);
                    for (x = 0; x < tamaño2; x++) {
                        System.out.print(icono);
                    }
                    tamaño2 += 2;
                    if (-1 < espacio.length()-1) {
                    espacio = espacio.substring(0,espacio.length()-1); }
                    System.out.println();
                }
            }
            else if (figura.equals("trapecious")) {
                tamaño2 = tamaño;
                for (int i = 1; i < (tamaño); i++) {espacio = espacio + " ";}
                for (y = 0; y < tamaño; y++) {
                    System.out.print(espacio);
                    for (x = 0; x < tamaño2; x++) {
                    System.out.printf(icono);
                    }
                    tamaño2 = tamaño2 + 2;
                    System.out.printf("\n");
                    if (-1 < espacio.length()-1) {
                        espacio = espacio.substring(0,espacio.length()-1); }
                }
            }
            
            else if (figura.equals("right-arrow")) {
                tamaño2 = 1;
                for (y = 0; y < tamaño; y++) {
                    for (x = 0; x < tamaño2; x++) {
                        System.out.print(icono);
                    }
                    tamaño2 += 2;
                    System.out.println();
                }
                for (int z = 0; z < tamaño; z++) {
                    tamaño2 -= 2;
                    for (x = 0; x < tamaño2-2; x++) {
                        System.out.print(icono);
                    }
                    System.out.println();
                }
            }
            else if (figura.equals("diamond")) {
                tamaño2 = 1;
                for (int i=0; i< tamaño-1; i++) {espacio+= " ";}
                for (y = 0; y < tamaño; y++) {
                    System.out.print(espacio);
                    for (x = 0; x < tamaño2; x++) {
                        System.out.print(icono);
                    }
                    espacio = espacio.substring(0,espacio.length()-1);
                    tamaño2 += 2;
                    if (y< tamaño) {System.out.println();};
                }
                tamaño2 = tamaño+1 ;
                espacio+= " ";
                for (y = 0; y <= tamaño; y++) {
                    if (y > 0) {tamaño2 -= 2;}
                    System.out.print(espacio);
                    for (x = 0; x < tamaño2; x++) {
                        System.out.print(icono);
                    }
                    espacio += " ";
                    System.out.println();
                }
            }
            else if (figura.equals("left-arrow")) {
                tamaño2 = 1;
                for (int i=0; i < tamaño*2-1; i++) {espacio += " ";}
                for (y = 0; y <= tamaño; y++) {
                    System.out.print(espacio);
                    for (x = 0; x < tamaño2; x++) {
                        System.out.print(icono);
                    }
                    tamaño2 += 2;
                    espacio = espacio.substring(2);
                    System.out.println();
                }
                tamaño2 = tamaño+1 ;
                for (y = 0; y <= tamaño; y++) {
                    if (y > 0) {tamaño2 -= 2;}
                    for (x = 0; x < tamaño2; x++) {
                        System.out.print(icono);
                    }
                    System.out.println();
                }
            }
        }
    }
}
