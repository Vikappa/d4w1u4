import ClassiEsercizio.Dipendente;
import ClassiEsercizio.Reparto;

public class Main {
    public static void main(String[] args) {

        Dipendente aldB = new Dipendente(010203, 30000, Reparto.AMMINISTRAZIONE);
        Dipendente gioS = new Dipendente(010204, 18000, Reparto.PRODUZIONE);
        Dipendente giaP = new Dipendente(010205, 20000, Reparto.VENDITE);

        Dipendente[] azienda = {aldB, gioS, giaP};

        for (int i = 0; i < azienda.length; i++) {
            System.out.println(("Matricola " + azienda[i].getMatricola() + " Stipendio: " + azienda[i].getStipendio() ));
        }

    }
}