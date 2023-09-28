public class Main {
    public static void main(String[] args) {
        System.out.println("Kamil Smaga");

    int krzeslo = 3;
    System.out.println(krzeslo);
    double f = 2.1;
    long l = 2l;
    char s = 'S';

    String sponsor = "Bulka z szynka";
    String duze = sponsor.toUpperCase();
    String male = sponsor.toLowerCase();
    System.out.println(duze);
    System.out.println(male);

    for(int i=1; i<=17; i++){
        System.out.println(i);
    }
        int o = 1;
        while (o <= 18) {
            if (o != 18) {
                System.out.print(o++ + ", ");
            } else {
                System.out.print(o++ + "\n");
            }
        }

        int p = 1;
        do{
            System.out.println(p++);
        } while(p <= 19);

        a();
        b();
        c();

        IMIENIOR();

    }


    private static void a(){
        System.out.println("Func a");
    }
    private static void b(){
        System.out.println("Func b");
    }
    public static void c(){
        System.out.println("Func c");
    }
    protected static void IMIENIOR(){
        String imie = "Kamil";
        System.out.println(imie);
    }
}