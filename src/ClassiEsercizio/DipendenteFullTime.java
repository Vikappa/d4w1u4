package ClassiEsercizio;

public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(int matricola, double stipendio, Reparto reparto) {
        super(matricola, stipendio, reparto);
    }

    @Override
    public void checkIn() {
        System.out.println("Dipendente, check-in alle 8");

    }
}
