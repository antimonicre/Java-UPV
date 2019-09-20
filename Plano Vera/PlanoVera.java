package Examenes.PlanoVera;

public class PlanoVera
{
    //---ATRIBUTOS---
    public static final int MAX_EDIFS = 50; //constante, máx edificios del plano
    private int numEdifs; //entre 0 y max_edifs
    private Edificio[] edifs; /* array de edificios 
      ordenados de más cercano a más lejano de rectorado, que es Edificio[0] */
    private int numEscuelas; //numero de edificios docentes en el plano
    
    public PlanoVera() {
        edifs = new Edificio[MAX_EDIFS];
        edifs[0] = ( "3A", "Rectorado", Edificio.SERVICIOS,
                                              new Punto(39,4823, -0,3457) );
        numEdifs= 1;
        numEscuela= 0;
    }
    
    private int posicionDe(Edificio e) {
        int i = 0;
        while (i < numEdifs && edifs[i].masCercaRectorado(e) <= 0) {
            i++;
        }
        return i;
    }
    
    public void desplazarDcha(int ini, int fin) {
        for (int p = fin + 1; p > ini; p--) {
            edifs[p] = edifs[p-1];
        }
    }
    
    public boolean anyadir(Edificio e) {
        boolean res = false;
        if (numEdifs != MAX_EDIFS) {
            int p = posicionDe(e);
            desplazarDcha(p, numEdifs-1);
            numEdifs++;
            if (e.getTipo() == Edificio.ESCUELA) {numEscuelas++;}
            res = true;
        }
        return res;
    }
    
    public Edificio[] filtrarTipoEscuela() {
        Edificio[] aux = new Edificio[numEscuelas];
        int k = 0;
        for (int i = 0; i < numEdifs && k < numEscuelas; i++) {
            if (edifs[i].getTipo == EdificioESCUELA) {
                aux[k] = edifs[i]; 
                k++;
            }
        }
        return aux;
    }
    
}
