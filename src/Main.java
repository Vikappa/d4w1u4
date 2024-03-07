import ClassiEsercizio.*;

public class Main {
    public static void main(String[] args) {

        Dipendente aldB = new DipendenteFullTime(010203, 2000, Reparto.VENDITE);
        Dipendente gioS = new DipendentePartTime(010204, 40, 15, Reparto.PRODUZIONE);
        Dipendente giaP = new Dirigente(010205, 1800, Reparto.AMMINISTRAZIONE);

        Volontario vinC = new Volontario("Vincenzo Costantini", "Greve", 29);

        Dipendente[] azienda = {aldB, gioS, giaP};

        for (int i = 0; i < azienda.length; i++) {
            System.out.println(("Matricola " + azienda[i].getMatricola()) + " stipendio " + azienda[i].calculateSalary());

        }

        WorkerInterface[] organizzazione = {aldB, gioS, giaP, vinC};

        for (int i = 0; i < organizzazione.length; i++) {
            organizzazione[i].checkIn();;
        }

    }
}