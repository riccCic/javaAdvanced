package javaOopAdvanced._6;

public enum Operazioni {
    ADDIZIONA,
    SOTTRAI,
    DIVIDI,
    MOLTIPLICA;

    public static Double calcola(Operazioni operazioni,double x,double y){
        double risultato = 0;
        switch (operazioni){
            case ADDIZIONA :
                return risultato=x+y;

            case SOTTRAI:
                return risultato=x-y;

            case DIVIDI:
               return risultato=x/y;
            case MOLTIPLICA:
               return risultato=x*y;
        }
        return risultato;
    }
}
