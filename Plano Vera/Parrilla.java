package Examenes.PlanoVera;

public class Parrilla {
    public static final int MAX_PROGS = 96; //max de programas en la parrilla
    private ProgramaRadio[] programas; //lista de programas
    private int nProg; //numero de programas en la parrilla
    
    public Parrilla() {
        programas = new ProgramaRadio[MAX_PROGS];
        nProg= 0;
    }
    
    public boolean insertar(PogramaRadio p) {
        if (p.getFin().aMinutos() - p.getIni().aMinutos() > 15) {return false;}
        int i = nProg - 1;
        while (i>=0 && p.compareTo(programas[i] < 0)) {
            programas[i+1] = programas[i];
            i--;
        }
        programas[i+1] = p;
        nProg++;
        return true;
    }
    
    public int[] numDeCadaTipo() {
        int[] result = new int[3];
        for (int i = 0; i < nProg; i++) {
         result[programas[i].getTipo()]++;
       }
       return result;
    }
    
    public int progMasLargo() {
        int i = 0;
        int x = 0;
        while(i < nProg) {
            if (programas[i+1].getFin().aMinutos() - programas[i+1].getIni().aMinutos() >
            programas[i].getFin().aMinutos() - programas[i].getIni().aMinutos()) {
                x = i;
            }
            i++;
        }
        return x;
    }
}