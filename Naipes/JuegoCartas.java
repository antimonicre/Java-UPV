package Examenes.Cartas;
import java.util.Scanner;

public class JuegoCartas {
  ///Determinamos un método que, a partir de dos Cartas y un número entero, se determine la carta ganadora
    public static int ganadora(Carta c1, Carta c2, int triunfo) {
        int ganadora = 1;
        if (c1.equals(c2)) {
            ganadora = 0;
        }
        else if(c1.getPalo() == c2.getPalo()) {
            if((c1.getValor() == 1 || c2.getValor() != 1) && (c1.getValor()>c2.getValor())) {ganadora = -1;}
            else if ((c1.getValor() != 1 || c2.getValor() == 1) && (c1.getValor()<c2.getValor())) {ganadora = +1;}
            else if ((c1.getValor()<c2.getValor())) {ganadora = +1;}
            else if ((c1.getValor()>c2.getValor())) {ganadora = -1;}
        }
        else if (c1.getPalo() != c2.getPalo()) {
            if (c1.getPalo() == triunfo || c2.getPalo() != triunfo) {
            ganadora = -1;
        }
            else if (c1.getPalo() != triunfo || c2.getPalo() == triunfo) {
                ganadora = +1;
            }
            else if (c1.getPalo() != triunfo || c2.getPalo() != triunfo){
                ganadora = -1;
            }
        }
        return ganadora;
    }
    
    //Determinamos ahora el metodo main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int palo3, valor3;
        int palo4, valor4;
        int palo5, valor5;
        int g;
        
        //Creamos una carta con los valores que determine el usuario
        System.out.println("Determine el palo de su carta(0=OROS, 1=COPAS, 2=ESPADAS, 3=BASTOS): ");
        palo3 = sc.nextInt();
        System.out.println("Determine el valor de su carta (entero entre 1 y 12): ");
        valor3 = sc.nextInt();
        Carta c3 = new Carta(palo3, valor3);
        System.out.println("Su carta es el: " +c3.toString());
        
        //Creamos una carta aleatoria
        palo4 = (int)(Math.random()*4);
        valor4 = (int)(Math.random() * 12 + 1);
        Carta c4 = new Carta(palo4, valor4);
        System.out.println("La carta del contrincante es: " +c4.toString());
        
        //Generamos un valor que represente la carta del triunfo
        int triunfo = (int)(Math.random()*4);
        Carta c5 = new Carta (valor5, triunfo);
        switch (triunfo){
            case 0 : System.out.println("El palo del triunfo es oros"); break;
            case 1 : System.out.println("El palo del triunfo es copas"); break;
            case 2 : System.out.println("El palo del triunfo es espadas"); break;
            case 3 : System.out.println("El palo del triunfo es bastos"); break;
        }
        //Indicamos la carta ganadora
        g = ganadora(c1, c2, triunfo);
        switch (g) {
            case -1 : System.out.println("Has ganado"); break;
            case 0 : System.out.println("Habeis empatado"); break;
            case 1 : System.out.println("Has perdido"); break;
        }
   }
}