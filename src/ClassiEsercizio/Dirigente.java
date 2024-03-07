package ClassiEsercizio;

public class Dirigente extends Dipendente{


    @Override
    public double getStipendio() {
        return stipendio;
    }
    public Dirigente(int matricola, double stipendio, Reparto reparto) {
        super(matricola, stipendio, reparto);
        this.stipendio = stipendio*1.1;
    }

    @Override
    public double calculateSalary() {
        return stipendio*14;
    }

    @Override
    public void checkIn() {
System.out.println("Dirigenti, check-in alle 9");
    }
}
