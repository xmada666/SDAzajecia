package str117;

public class Osoba {
    String imie;
    String nazwisko;
    String nrTel;

//    public Osoba(String imie, String nazwisko, String nrTel) {
//        this.imie = imie;
//        this.nazwisko = nazwisko;
//        this.nrTel = nrTel;
//    }

    public Osoba(String dane) {
        String [] daneSplit =dane.split(", ");
        this.imie = daneSplit[0];
        this.nazwisko = daneSplit[1];
        this.nrTel = daneSplit[2];
    }
}
