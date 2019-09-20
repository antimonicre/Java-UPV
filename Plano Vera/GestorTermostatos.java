package Examenes.PlanoVera;
/**
 * Clase GestorTermostatos: representa un dispositivo que gestiona
 * todo los termostatos de un espacio
 * 
 * @author Moni
 * @version 1.0
 */

public class GestorTermostatos {
    public static final int MAX_TERMS = 15; //max de termostatos
    private int numTerms; //num de termostatos en cada momento. entre [0-MAX_TERMS]
    private Termostato[] terms;
    private int noEficientes; //num de termostatos en cada momento que
                                     //no cumplen con las normas de eficiencia
                                   
    public GestorTermostatos() {
        terms = new Termostato[MAX_TERMS];
        numTerms = 0;
        noEficientes = 0;
    }
    
    private int termostatoEnZona (String nomZona) {
        int i=0;
        
        while (i < numTerms && !terms[i].getNombre().equals(nomZona)) {i++;}
        
        if (i < numTerms) {return i;}
        else {return -1;}
    }
    
    public boolean instalar(Termostato t) {
        boolean res = true;
        int pos = termostatoEnZona(t.getNombre());
        if (pos != -1) {
            if (terms[pos].diferenciaConIdeal != 0) {noEficientes--;}
            terms[pos] = t;
        }
        else if (numTerms < MAX_TERMS) {terms[numTerms] = t;}
        else {res = false;}
        if (res && t.diferenciaConIdeal() != 0) {noEficentes++;}
        return res;
    }
    
    public Termostato diferenciaMayor() {
        String res = null;
        int i = 0;
        while (i < numTerms-1) {
          if ((terms[i].diferenciaConIdeal()) == 0) {
             if(terms[i].diferenciaConIdeal() > terms[i-1].diferenciaConIdeal()){
                res = terms[i];
            }
            
         } 
         i++; 
         return res;
       }
    }
    
    public Termostato[] termsNoEficientes() {
        Termostato[] aux = new Termostato[noEficientes];
        int k = 0;
        for (int i = 0; i < numTerms && k < noEficientes; i++) {
            if (terms[i].diferenciaConIdeal() != 0) {
              aux[k++] = terms[i];
           }
        }
        return aux;
    }
       
}