package Examenes.Termostato;
import java.util.Scanner;
import java.util.Locale;
/**
 * Clase GestorTermostato: crea un termostato y aconseja al usuario sobre incrementar o disminuir
 * la temperatura de confort para cumplir con las normas de eficiencia energética de la WWF
 * 
 * @author Mónica Jiménez Candela
 * version 1.0 (november, 2017)
 */

public class GestorTermostato {
 
    public static String consejo(Termostato t)
  {
        String consejo = "";
        double grados = t.diferenciaConIdeal();
    if (grados == 0 ){
        consejo = ("La temperatura es adecuada");
    }
    else {
        consejo = "Grados a ";
        if (t.getModo() == Termostato.FRIO) {
            consejo += ("aumentar: ");
        }
        else {
        consejo += ("disminuir: ");
       }
       consejo += grados;
    }
    return consejo;
  }
  
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in).Locale(US);
    System.out.println("Modo de termostato (refrigeracion/calefaccion): ");
    String modo = teclado.nextLine();
    }