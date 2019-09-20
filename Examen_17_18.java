package Examenes;
import java.io.*;
import java.lang.Math;

/**
 * Examen 2017-2018
 * 
 * @author vantmonk 
 * @version (domingo 17)
 */
public class Examen_17_18
{
    //Pregunta 1
    public static File Copiar (int [] array) {
        PrintWriter pw = null;
        File fichero = new File("ArrayElements.txt");
        try {
            pw = new PrintWriter(fichero);
            for (int i = 0; i < array.length; i++) {
                pw.println(array[i]);
            }
        } catch (FileNotFoundException f) {
            System.err.println("Fichero " + fichero + " no encontrado");
        } finally {
            if (pw!=null) {pw.close();}
        }
        return fichero;
    }
    
    //Pregunta 2
    public static NodeChar Secuenciar(String s) {
        NodeChar aux = null;
        if (s!=null) {
            aux = new NodeChar();
            for (int i=s.length()-1; i > 0; i--) {
                aux = new NodeChar(s.charAt(i),aux);
            }
        }
        
        return aux;
    }
    
    //Pregunta 3
    public void append(int x) {
        if (pI = null) {throw NullPointerException("Cursor al final");}
        else {
            antPI = pI;
            pI.next = new NodeInt(x,pI.next);
            pI = pI.next;
            size++;
        }
    }
    
    //Pregunta 4
    public static QueueIntLinked fusion (QueueIntLinked q1, QueueIntLinked q2) {
        QueueIntLinked q3 = new QueueIntLinked();
        int i = Math.min(q1.size(),q2.size());
        for (int j = 0; j < i; j++) {
            q3.add(q1.element()); q1.add(q1.remove());
            q3.add(q2.element()); q2.add(q2.remove());
        }
        
        while (i < q1.size()) {q3.add(q1.element()); q1.add(q1.remove()); i++;}
        while (i < q2.size()) {q3.add(q2.element()); q2.add(q2.remove()); i++;}
        
        return q3;
    }
    
    
}
