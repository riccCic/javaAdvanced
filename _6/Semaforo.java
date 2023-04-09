package javaOopAdvanced._6;

public enum Semaforo {
    VERDE,
    GIALLO,
    ROSSO;

    public static String successivo(Semaforo semaforo) {
        switch (semaforo) {
            case VERDE:
                return GIALLO.name();
            case GIALLO:
                return ROSSO.name();
            case ROSSO:
                return VERDE.name();
            default:
                return "";
        }
    }
}
