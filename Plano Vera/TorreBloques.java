package Examenes.PlanoVera;

public class TorreBloques {
    public static final int MAX_BLOQUES = 10; //num max de bloques en la torre
    private int numBloques; //num de bloques en la torre en cada momento
    private Bloque[] torre; //contiene los bloques de la torre. capacidad MAX_BLOQUES
    private int numBloquesComodin; //num bloques de la torre que son comodin
    
    public TorreBloques() {
        torre = new Bloque[MAX_BLOQUES];
        numBloques = 0;
        numBloquesComodin = 0;
    }
    
    private int posicionDe(Bloque b) {
        int pos = 0;
        while (pos < numBloques && !torre[pos].equals(b)) {pos++;}
        if (pos < numBloques) {return pos;}
        else {return -1;}
    }
    
    public boolean apilar(Bloque b) {
        boolean res = false;
        if (numBloques != MAX_BLOQUES 
              && (numBloques == 0 || b.puedeEstarEncimaDe(torre[numBloques-1]))) {
            torre[numBloques++] = b;
            if (b.getComodin()) {numBloquesComodin++;}
            res = true;
        }
        return res;
    }
    
    public Bloque primeroMasGrandeQue(Bloque b) {
        int i = 0;
        while (i < numBloques) {
            if (torre[i].getDimension() > b.getDimension()){ return torre[i]; }
            i++;
        }
        if (i >= numBloques) {return null;}
    }
    
    public Bloque[] filtrarBloquesComodin() {
        Bloque[] bc = new Bloque[numBloquesComodin];
        for (int i = 0, k = 0; i < numBloquesComodin; i++) {
            if (torre[i].getComodin()) {bc[k] = torre[i]; numBloquesComodin++; k++;}
        }
        return bc;
    }
    
    public String toString() {
        String cadena = "";
        for (int i = numBloques-1; i >= 0; i--) {
            for ( int j = 1; j < torre[i].getDimension(); j++) {
                if (torre[i].getComodin()) {cadena += "C";}
                else if (torre[i].getColor() == Bloque.AZUL) {cadena += "A";}
                else {cadena += "R";}
                cadena += "\n";
            }
            return (numBloques == 0? "Torre vacia" : cadena);
        }
    }
    
}