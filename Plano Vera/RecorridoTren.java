package Examenes.PlanoVera;

public class RecorridoTren {
    public static final int MAX_PARADAS = 25; //num maximo de paradas del recorrido
    private Parada[] trayecto; //array con las paradas del recorrido ordenadas por hora
                                // de parada, desde 0 hasta numParadas-1
    private int numParadas, numSubidas; //num paradas del recorrido actualmente 
                   //num de paradas que permiten incorporar viajeros (no son apartaderos)
                   
    public RecorridoTren(Parada origen, Parada destino) {
        trayecto = new Parada[MAX_PARADAS];
        trayecto[0] = origen;
        trayecto[1] = destino;
        numParadas = 2;
        if (origen.getTipo() != (Parada.APEADERO)) {numSubidas++;}
        if (destino.getTipo() != (Parada.APEADERO)) {numSubidas++;}
    }
    
    private int posicion(Instante hP) {
        if (hP.compareTo(trayecto[0].getHoraParada()) < 0 
            || hP.compareTo(trayecto[numParadas-1].getHoraParada > 0)) {
            return -1;
        }
        else {
            int i = 0;
            while (i < numParadas-1 && trayecto[i].getHoraParada().compareTo(hP) < 0) {
                i++;
            }
            if (trayecto[i].getHoraParada()).compareTo(hP) == 0) {return -1;}
            else {return i;}
        }
    }
    
    private void desplazarDcha(int ini, int fin) {
       for (int pos = fin + 1; pos > ini; pos--) {
           trayecto[pos] = trayecto[pos-1];
       } 
    }
    public boolean incluir(Parada p) {
       if (numParadas == MAX_PARADAS) {return false;}
       int pos = posicion(p);
       if (pos == -1) {return false;}
       desplazarDcha(pos, numParadas -1);
       trayecto[pos] = p;
       numParadas++;
       if (p.getTipo() != Parada.APARTADERO) {numSubidas++;}
       return true;
    }
    
    public Parada[] subidas() {
        Parada[] result = new Parada[numSubidas];
        int i = 0, j= 0;
        while (i < numParadas && j < numSubidas) {
            if (trayecto[i].getTipo != Parada.APEADERO) {result[j] = trayecto[i]; j++;}
        }
        return result;
    }
}