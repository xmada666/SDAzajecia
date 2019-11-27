package Miasta;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<City> listaMiast = new LinkedList<>();
        listaMiast.add(new City("Poznan",2000,18000));
        listaMiast.add(new City("Szczecin",3000,20000));
        listaMiast.add(new City("Warszawa",4000,15000));

        System.out.println(listaMiast.get(0));
        for (City item:listaMiast
             ) {
            System.out.println(item);

        }
        System.out.println();


    }
}
