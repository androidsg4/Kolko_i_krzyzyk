package zwierzeta;

public class Pies extends Zwierze{


    public Pies(String nazwa, String wiek, String plec){
        super(nazwa, wiek, plec);}

    @Override
    public void MakeNoise() {
        System.out.println("hau");
    }
}
