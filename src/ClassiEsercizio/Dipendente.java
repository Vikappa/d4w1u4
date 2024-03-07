package ClassiEsercizio;


public class Dipendente {
    private int matricola;
    private double stipendio;
    private Reparto reparto;

    public void setReparto(Reparto reparto) {
        this.reparto = reparto;
    }

    public Dipendente(int matricola, double stipendio, Reparto reparto) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.reparto = reparto;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Reparto getReparto() {
        return reparto;
    }
}
