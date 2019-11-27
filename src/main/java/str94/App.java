package str94;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {

        Person[] lista = new Person[0];

        boolean czyKoniec = false;
        int i = 0;

        do {

            System.out.println("co chcesz wybrać?\n" + "+" + "\n =" + "\nkoniec");
            String wybor = new Scanner(System.in).nextLine();

            if (wybor.equals("+")) {

                StringParser.wezImie(new Scanner(System.in).nextLine());
                String imie = StringParser.imie;
                //System.out.println(imie);
                Car auto = new Car(StringParser.pojazd);
                //System.out.println(auto);
                Person person = new Person(imie, auto, LocalDateTime.now());
                Person[] listTemp = new Person[lista.length + 1];
                System.arraycopy(lista, 0, listTemp, 0, lista.length);
                lista = listTemp;
                lista[lista.length - 1] = person;
            } else if (wybor.equals("=")) {
                for (Person item : lista
                ) {
                    System.out.println(item.imie + item.vehicle.getModel() + item.data);
                }
            } else if (wybor.equals("koniec")) {
                return;
            }
            i++;
        }
        while (!czyKoniec);
    }
}
