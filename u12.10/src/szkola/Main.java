package szkola;
import obiekty.Jacht;
import obiekty.Samochut;
import obiekty.Samolot;
import obiekty.klasa;
public class Main {
    public static void main(String[] args) {
        klasa klasa = new klasa("Jan", "Kowalsku");
        System.out.println(klasa.getName());
        System.out.println(klasa.getNazwisko());

        klasa.setName("Michał");
        klasa.setNazwisko("Gąbka");
        System.out.println(klasa.getName());
        System.out.println(klasa.getNazwisko());
        System.out.println(klasa);
        System.out.println(klasa.returnRandomNumber());
        Samochut samochut = new Samochut("Chevrolet", "Aveo");
        Samolot samolot = new Samolot("Boeing", "747");
        Jacht jacht = new Jacht("tak", "nom");

    }

}
