package ClassiEsercizio;

public class DipendentePartTime extends Dipendente {

    private int orePerMese;
    private double pagaOraria;

    private double stipendio;

    @Override
    public double getStipendio() {
        return stipendio;
    }

    public DipendentePartTime(int matricola, int oreMensili, double pagaOraria, Reparto reparto) {
        super(matricola, oreMensili, reparto);
        this.orePerMese = oreMensili;
        this.pagaOraria = pagaOraria;
        this.stipendio = oreMensili*pagaOraria*12;
    }

    @Override
    public void checkIn() {
        System.out.println("Precario, check in variabile");

    }
}
