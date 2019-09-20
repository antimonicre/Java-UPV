package Examenes;
import java.util.Scanner;
import java.io.*;
import java.util.Locale;


/**
 * Examen 2016-2017
 * 
 * @author vantmonk 
 * @version (domingo 17)
 */
public class Examen_16_17
{
    //Pregunta 1 
    public static void DoublesFile (String original) {
        Scanner sc = null;
        PrintWriter pw = null;
        
        try {
            sc = new Scanner(new File(original)).useLocale(Locale.US);
            pw = new PrintWriter(new File (original + "_nuevo"));
            while (sc.hasNextLine()) {
                try {
                    pw.println(sc.nextDouble());
                } catch (InputMisMatchException i) {
                } finally {sc.nextLine();}
            }
            
        } catch (FileNotFoundException f) {
        } finally {
            if (sc!= null){sc.close();} 
            if (pw!=null) {pw.close();}
        }
    }
    
    //Pregunta 2
    public PilaIntEnla (PilaIntEnla p) {
        if (cima!=null) {
            cima = new NodoInt(p.cima.dato);
            NodoInt ultimo = cima;
            NodoInt aux = p.cima.next;
            while (aux != null) {
                ultimo.next = new NodoInt(aux.dato);
                ultimo = ultimo.next;
                aux = aux.next;
            }
            talla = p.talla;
        }
    }
    
    //Pregunta 3
    public boolean equals(Object o) {
        boolean res = true;
        if (!(o instanceof ListaPIIntEnla)) { res = false;}
        else {
            ListaPIIntEnla otra = (ListaPIIntEnla) o;
            if (this.size != otra.talla) {res = false;}
            else {
                NodoInt p = this.first; q = otra.first;
                while (p != null & q!= null) {
                    res = (p.data == q.data);
                    if (res && (p == this.antPI)) { res = (q == otra.antPI);}
                    if (res) {p = p.next; q = q.next;}
                }
            }
        }
        return res;
    }
    
    //Pregunta 4
    public static void lista (ListaPICharEnla l) {
        l.begin();
        while (!l.isEnd()) {
            char e = l.get();
            if (e == '~') {
                l.remove();
                char r = l.remove();
                if (r == 'n') { l.insertar('ñ');}
                else { l.insertar('Ñ'); }
            }
            l.next();
        }
    }
}
