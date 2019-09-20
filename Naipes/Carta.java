package Examenes.Cartas;
/** 
 * Clase Carta: representa una carta de la baraja española.
 * @author Mónica Jiménez Candela
 * version 1.0 (november, 2017)
 */
public class Carta {
    ///Definimos las constantes que se utilizarán más adelante
    public static final int OROS = 0; //las cartas del palo de oros valen 0
    public static final int COPAS = 1; //las cartas del palo de copas valen 1
    public static final int ESPADAS = 2; //las cartas del palo de espadas valen 2
    public static final int BASTOS = 3; //las cartas del palo de bastos valen 3
    
    //Definimos los atributos de instancia de la clase
    public static int palo;
    public static int valor;
    
    //Escribimos el método constructor
    public Carta(int palo, int valor) {this.palo = palo; this.valor = valor;}
    //Este constructor dará valores aleatorios a la carta
    public Carta() {
        palo = (int)(Math.random()*4); /*el valor del que depende el palo de la carta estará entre 0 y 4*/
        valor = (int)(Math.random() * 12 + 1); /* el valor de la carta*/
    }
    
    //Escribimos ahora dos métodos consultores
    public int getPalo() {return palo;}
    public int getValor() {return valor;}
    
    //Escribimos ahora dos métodos modificadores
    public void setPalo() {this.palo = palo;}
    public void setValor() {this.valor = valor;}
    
    //Construimos un método esMenor para comprobar que la carta actual es menor a otra dada
    public boolean esMenor(Carta c){
        return ((c.palo < this.palo) || (c.palo > this.palo && c.valor > this.valor));
    }
    
    /*Construimos un metodo para devolver una nueva carta del mismo valor que la carta actual pero del 
      palo siguiente*/
    public Carta sigPalo() {
      return new Carta((palo+1)%4, valor);}
      
    //Ahora escribimos un metodo equals para comprobar la igualdad de dos cartas
    public boolean equals(Object o) {
        return o instanceof Carta 
        && palo == ((Carta)o).palo && valor == ((Carta)o).valor;
    }
    
    //Escribiremos ahora un metodo para expresar en String la carta actual
    public String toString() {
        String res = valor + " de ";
        switch (palo){
        case OROS : res += "oros"; break;
        case COPAS : res += "copas"; break;
        case ESPADAS : res += "espadas"; break;
        case BASTOS : res += "bastos"; break;
        }
        return res;
    }
}