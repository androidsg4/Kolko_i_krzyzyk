package Main;
import zwierzeta.Kot;
import zwierzeta.Papuga;
import zwierzeta.Pies;
import zwierzeta.Zwierze;
import java.util.List;
import zwierzeta.*;

public class Main {
    public static void main(String[] args) {
        Kot kot = new Kot("Piotr", "5", "samiec");
        Pies pies = new Pies("Robert", "10", "samiec");
        Papuga papuga = new Papuga("Andzelika", "15", "samica");

    List<Zwierze> Zwierze = List.of(kot, pies, papuga);
    useMakeNoise(Zwierze);
}


    public static void useMakeNoise(List<Zwierze> zwierzeta ) {
        for (Zwierze Zwierze : zwierzeta) {
            Zwierze.MakeNoise();

            System.out.println(Zwierze.toString());
        }}
}