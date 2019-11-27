package str86;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean czyKoniec = false;
        Produkt[] produkts = new Produkt[0];
        //int i =0;
        //Produkt[] magazyn;

        //produkts[0] = new Produkt("aaa", 22);
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("co zrobić");
            switch (scanner.nextLine()) {
                case "+":
                    System.out.println("podaj nazwe");
                    String nazwa = scanner.nextLine();
                    System.out.println("podaj cene");
                    double cena = scanner.nextDouble();
                    System.out.println("podaj ilość");
                    int ilość = scanner.nextInt();
                    Produkt[] pr = new Produkt[produkts.length + 1];
                    System.arraycopy(produkts, 0, pr, 0, produkts.length);
                    produkts = pr;
                    produkts[produkts.length - 1] = new Produkt(nazwa, cena, ilość);
                    break;
                case "*":
                    for (Produkt item : produkts
                    ) {
                        System.out.println(item.cena + " " + item.szt + " " + item.nazwa);
                    }
                    break;

                case "koniec":
                    czyKoniec = true;
                    break;
            }
        }while (!czyKoniec);


}


    }


