package zwierzeta;

public class Kot extends Zwierze {


    public Kot(String nazwa, String wiek, String plec){
        super(nazwa, wiek, plec);}

        @Override
        public void MakeNoise() {
        System.out.println("miau");
        }


    }

