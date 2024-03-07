package ClassiEsercizio;

public class Volontario implements WorkerInterface {
    String nome, CV;
    int age;

    public Volontario(String name, String cv, int anni){
        this.nome = name;
        this.CV = cv;
        this.age = anni;
    }

    @Override
    public void checkIn() {
        System.out.println("Volontario, check-in alle 8:30");

    }
}
