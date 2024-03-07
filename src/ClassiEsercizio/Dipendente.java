package ClassiEsercizio;


public abstract class Dipendente implements WorkerInterface{
    protected int matricola;
    protected double stipendio;
    protected Reparto reparto;

    public void setReparto(Reparto reparto) {
        this.reparto = reparto;
    }

    public Dipendente(int matricola, double stipendio, Reparto reparto) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.reparto = reparto;
    }

    public abstract double calculateSalary();

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
