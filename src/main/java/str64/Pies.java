package str64;

public class Pies extends ZwierzeDomowe{

    Kaganiec kaganiec2;

    static int licznik;

    Pies(String rasa, String płeć,Kaganiec dupa) {
                super(rasa, płeć,"Woof");
licznik++;
        kaganiec2 = dupa;
                //Kaganiec kaganiec;
        //Kaganiec kaganiec = new Kaganiec(10,"szmata");

    }

    public String getMuzzle() {
        return kaganiec2.getMateriał() + kaganiec2.getRozmiar();
    }


}


