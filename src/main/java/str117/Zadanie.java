package str117;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("d:\\osoby.txt ");

        Scanner skaner = new Scanner(file);

        ArrayList<Osoba> tabOsob = new ArrayList<>();

//        while (skaner.hasNext()){
////            String [] dane = skaner.nextLine().split(", ");
////            tabOsob.add(new Osoba(dane[0], dane[1], dane[2]));
////        }

        while (skaner.hasNext()){
            tabOsob.add(new Osoba(skaner.nextLine()));
        }

        for (Osoba osoba: tabOsob
             ) {
            System.out.println(osoba.imie+osoba.nazwisko+osoba.nrTel);
        }

    }
}
