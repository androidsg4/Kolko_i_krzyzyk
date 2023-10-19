package zwierzeta;

public class Papuga extends Zwierze {


    public Papuga(String nazwa, String wiek, String plec){
        super(nazwa, wiek, plec);}

    @Override
    public void MakeNoise() {
        System.out.println("Kra");
    }


}