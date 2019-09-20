import java.util.Scanner;
import java.util.Arrays;
import java.lang.Integer;

public class Agenda2
{
   public static void main (String[] args) {
       Scanner in = new Scanner(System.in);
       int j = 0;
       String[] contactos = new String [200];
       for (int f = 0; f < 200; f++) {contactos[f] = "";}
       
       while ( in.hasNext() ) {
           String Apellido0 = in.next();
           String Apellido1 = in.next();
           String Nombre = in.next();
           String Teléfono = in.next();
           String Email = in.next();
           String[] Fecha = new String [3];
           //año
           Fecha[0] = in.next();
           //mes
           Fecha[1] = in.next();
           //dia
           Fecha[2] = in.next();
           
           String stfecha = Fecha[0] + "-" + Fecha[1] + "-" + Fecha[2]; 
                     
           //calcular edad (utilizar fecha actual exacta)
           int edad = 2017 - Integer.parseInt(Fecha[0]);
           if (Integer.parseInt(Fecha[1]) == 12) {
               if (Integer.parseInt(Fecha[2]) > 30) {--edad;}
            }
           
           //ajustar espacios
           String dato1 = Apellido0 + " " + Apellido1 + ", " + Nombre;
           int espacio1 = 40 - dato1.length();
           String espacio2 = "";
            for (int i = 0; i < espacio1; i++) {espacio2 += " ";}
           String cadena = dato1 + espacio2;
           
           String dato2 = Email;
           int espacio3 = 30 - dato2.length();
           String espacio4 = "";
            for (int i = 0; i < espacio3; i++) {espacio4 += " ";}
           String cadena2 = dato2 + espacio4;
           
           String dato3 = Teléfono;
           int espacio5 = 12 - dato3.length();
           String espacio6 = "";
            for (int i = 0; i < espacio5; i++) {espacio6 += " ";}
           String cadena3 = dato3 + espacio6;
           
           String cedad = "    " + edad;
           cedad = (cedad.substring(cedad.length()-3, cedad.length()));
           String cadena4 =  stfecha + "  edad" + "   " + cedad;
           
           String cadena5 = stfecha + cadena + cadena2 + cadena3 + cadena4;
           
           
           //construccion del array de contactos
           contactos[j] = cadena5;
           j++;
           
        }   
        //ordenar e imprimir resultado
        Arrays.sort(contactos);
        for (String c : contactos) {
            if (c != "") {
            System.out.println(c.substring(10)); }
        }
    }
}