import java.util.Scanner;

public class Nochevieja
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextLine()) {
            String x = sc.next();
            int hora = Integer.parseInt(x.substring(0,2)) * 60;
            int minutos = Integer.parseInt(x.substring(3,5));
            
            int totalmin= hora + minutos;
            int result = (24*60) - totalmin;
            if (result == 1440) {break;}
            if (result <= 0 || result >= (24*60)) {}
            else {
                System.out.println(result); }
        }
    }
}
