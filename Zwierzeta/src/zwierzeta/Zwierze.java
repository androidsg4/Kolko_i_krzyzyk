package zwierzeta;

public class Zwierze {
    String nazwa;
    String wiek;
    String plec;

    public Zwierze(String nazwa, String wiek, String plec){
     this.nazwa = nazwa;
     this.wiek = wiek;
     this.plec = plec;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getWiek() {
        return wiek;
    }

    public void setWiek(String wiek) {
        this.wiek = wiek;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    @Override
    public String toString() {
        return "Zwierze{" +
                "nazwa='" + nazwa + '\'' +
                ", wiek='" + wiek + '\'' +
                ", plec='" + plec + '\'' +
                '}';
    }

    public void MakeNoise(){System.out.println();}
}
