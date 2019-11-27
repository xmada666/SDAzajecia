package str64;

public class Kaganiec {
    private int rozmiar;
    private String materiał;

   public Kaganiec(int rozmiar, String materiał){
        this.materiał=materiał;
        this.rozmiar= rozmiar;


    }

    public int getRozmiar() {
        return rozmiar;
    }

    public String getMateriał() {
        return materiał;
    }
}
