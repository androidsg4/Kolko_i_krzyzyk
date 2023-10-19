package obiekty;

public class klasa implements JakChcecie{

    private String name;

    private String nazwisko;

    public klasa (String name, String nazwisko){
        this.name = name;
        this.nazwisko = nazwisko;
    }

    public String getName() {

        return name;
    }
    public String getNazwisko() {

        return nazwisko;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "klasa{" +
                "name='" + name + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }

    @Override
    public void sayHelloWorld() {
        System.out.println("Hello World");
    }

    @Override
    public Double returnRandomNumber() {
        return Math.random();
    }
}
