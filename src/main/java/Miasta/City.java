package Miasta;

public class City {
    String nazwaMiasta;
    int liczbaMieszkancow;
    int powierzchnia;

    public City(String nazwaMiasta, int liczbaMieszkancow, int powierzchnia) {
        this.nazwaMiasta = nazwaMiasta;
        this.liczbaMieszkancow = liczbaMieszkancow;
        this.powierzchnia = powierzchnia;
    }

    @Override
    public String toString() {
        return "================" +
                "\n" + nazwaMiasta + '\'' +
                ", liczbaMieszkancow=" + liczbaMieszkancow +
                ", powierzchnia=" + powierzchnia +
                "+++++++++++++";
    }
}
