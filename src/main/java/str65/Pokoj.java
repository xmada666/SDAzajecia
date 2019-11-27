package str65;

public class Pokoj {
    double wysokość;
    double szerokość;
    double długość;


    public Pokoj(double wysokość, double szerokość, double długość) {
        this.wysokość = wysokość;
        this.szerokość = szerokość;
        this.długość = długość;

    }

    public Pokoj(int szerokość, double długość) {
        this.szerokość = szerokość;
        this.długość = długość;
        this.wysokość = 2.4;
    }

    double polePow() {
        return this.wysokość*this.szerokość;
    }
    double objętość(){
        return wysokość*szerokość*długość;
    }
    void wypiszPole(){
        System.out.println(polePow());
    }
    void wypiszObjętość(){
        System.out.println(objętość());
    }
}
