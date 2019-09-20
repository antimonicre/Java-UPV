package Examenes.Termostato;

/**
 * Clase Termostato: controla la temperatura de un dispositivo térmico instalado en una casa
 * 
 * @author Mónica Jiménez Candela
 * version 1.0 (november 2017)
 */

public class Termostato {
    //Definimos las constantes que se utilizaran más adelante
    public static final int FRIO = 0; //representa el modo refrigeracion
    public static final int CALOR = 1; //representa el modo calefaccion
    public static final int T_IDEAL_FRIO = 25; /*representa la temperatura minima recomendada 
    *                                                                           en modo refrigeracion*/
    public static final int T_IDEAL_CALOR = 20; /*representa la temperatura maxima recomendada 
    *                                                                           en modo calefaccion*/
    
    //Definimos las variables de clase o atributos de instancia
    private static String nombre;
    private static int modo,tConfort;
    private static double tActual;
    
    //Implementamos dos constructores
    /**Constructor general*/
    public Termostato(int m,String n, int tC, double tAct) {
        modo = m; nombre = n; tC = tConfort; tAct = tActual;
    }
    /**Constructor por defecto*/
    public Termostato() {
        this.modo = FRIO;
        this.nombre= "zona de estar";
        this.tConfort= T_IDEAL_FRIO;
        this.tActual= generarAleatorio(20.0, 40.0);
    }
    
    //Establecemos un metodo estatico que genere un valor aleatorio
    private static double generarAleatorio(double x, double y) {
      return Math.random() * (y-x) + x;
    }
    
    //Escribimos el metodo consultor del atributo modo
    public int getModo() {return modo;}
    //Y el metodo modificador del mismo
    public void setModo(int nuevo) {modo = nuevo;}
    
    //Definimos un metodo equals para comparar un Termostato con otro
    public boolean equals (Object o) {
        boolean res = o instanceof Termostato;
        if (res) {
            Termostato t = ((Termostato)o);
            res = nombre == (t.nombre) && modo == t.modo
            && tConfort == t.tConfort
            && Math.abs(tActual - t.tActual) < 1.0;
        }
        return res;
    }
    
    //Y definimos tambien el metodo toString que exprese en String el objeto Termostato
    public String toString() {
        String m = "modo refrigeracion";
        switch (modo) {
         case 0 : m= "modo refrigeracion"; break;
         case 1 : m= "modo calefaccion"; break;
        }
        return nombre +", " +m +", tConfort= " +tConfort +"º, tActual= " +tActual +"º";
    }
    
    /*Escribimos un metodo diferenciaConIdeal que indica si la temperatura es la ideal, y si no, la diferencia 
     *                                                                     que la falta o le soba para llegar*/ 
     public int diferenciaConIdeal() {
         int res = 0;
         if (modo == FRIO){
             if ( tConfort < T_IDEAL_FRIO ) {
                res = Math.abs(tConfort - T_IDEAL_FRIO);
                }
             else {
                 res = 0; } 
         }
          else {
              if ( tConfort > T_IDEAL_CALOR ) {
                res = Math.abs(tConfort - T_IDEAL_CALOR);
                }
                else {
                    res= 0; }
            }
            
        return res; 
    }
     }
    