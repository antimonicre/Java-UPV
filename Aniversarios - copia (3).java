import java.util.Scanner;
import java.util.Arrays;
import java.lang.Integer;
import java.util.Calendar;

public class Aniversarios
{
   public static void main (String[] args) {
       Scanner in = new Scanner(System.in);
       
       while (true) {
                   
           //------CONSTRUCCION DE LOS ARRAYS Y ORDENACION DE CONTACTOS------
           if (in.hasNext() != true) {System.out.print("adios "); break;}
           int j = 0;
           int N = in.nextInt();
           String[] contactos = new String [N];
           
           while ( j < N ) {
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
               Calendar hoy = Calendar.getInstance();
               int edad =  hoy.get(Calendar.YEAR)- Integer.parseInt(Fecha[0]);
               if (Integer.parseInt(Fecha[1]) != hoy.get(Calendar.MONTH)) {--edad;}
               else {
                   if (Integer.parseInt(Fecha[2]) > hoy.get(Calendar.DATE)) {--edad;}
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
            
            //ordenar y eliminar contactos repetidos
            Arrays.sort(contactos);
            for (int c = 0; c < contactos.length-1; c++) {
                if (contactos[c].equals(contactos[c+1])){
                        contactos[c] = "";
                }
            } 
            //reordenar contactos
            Arrays.sort(contactos);
            for (int c = 0; c < contactos.length; c++) {
                if (contactos[c].equals("")) {}
                else {
                    contactos[c] = (contactos[c].substring(10));
                }
            }
            
            //se construye el array de los meses del año en el orden que entren
            String[] meses = {"","Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
                     "Julio","Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
            
            //String[] meses2 = new String [12];
            //for (int i = 0; i < 12; i++) {meses2[i] = in.next();}
            
            //for (int m = 0; m < 12; m++) {System.out.println(meses2[m]);}
            while (in.hasNext()) {
                String meses2 = in.next();     //meses introducidos
                    for (int g = 1; g < 13; g++) {      //meses ordenados
                        if (meses2.equals(meses[g])) {
                                
                            int a = 0;
                            String cadena = "";
                            for (int x = 0; x < contactos.length; x++){
                               if (contactos[x] != ""){
                                 int n = Integer.parseInt(contactos[x].substring(87,89));
                                
                                 if (n == g) {
                                     a++;
                                     cadena = cadena + contactos[x] + "\n\n";
                                 }
                                
                               }
                            }
                            
                            if (a != 0) {
                                System.out.println("# ----------------------------------------");
                                System.out.println("# Aniversarios del mes de " + meses[g].toLowerCase());
                                System.out.print(cadena.substring(0,cadena.length()-1));
                                System.out.println("# ----------------------------------------");
                                if (10 != 11) {
                                System.out.println(); 
                                }
                            }
                            
                            else {
                                System.out.println("# No hay aniversarios en el mes de " + meses[g].toLowerCase());
                                if (10 != 11) {
                                System.out.println(); 
                                }
                            }
                            
                       }
                    }
                
           }
           System.out.print("goodbye ");
       }
       System.out.print("arriveretzi ");
    }
}