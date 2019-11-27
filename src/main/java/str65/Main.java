package str65;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();

        Pokoj[] lisaPokoi = new Pokoj[2];


        lisaPokoi[0] = new Pokoj(4,5);
        lisaPokoi[1] = new Pokoj(8,10);

                lisaPokoi[0].wypiszObjętość();
                lisaPokoi[1].wypiszObjętość();
                lisaPokoi[0].wypiszPole();
                lisaPokoi[1].wypiszPole();
        for (Pokoj item:lisaPokoi
             ) {
            item.wypiszPole();
        }
    }
}
