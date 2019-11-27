package str64;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        Pies[] piesList = new Pies[2];
        piesList [0] = new Pies("sdfs", "sdfsd", new Kaganiec(12, "sdasd"));
        piesList [1] = new Pies("bb","pp1",new Kaganiec(4, "cpd"));
        Kot kot = new Kot("GG","HH");

        System.out.println(Pies.licznik);
        piesList[0].kaganiec2.getRozmiar();

/*        System.out.println(piesList[0].tralalala());
        System.out.println(piesList[1].tralalala());*/

        piesList[1].setWiek(55);
        System.out.println(piesList[1].getWiek());
        kot.dzwiek();




    }
}
