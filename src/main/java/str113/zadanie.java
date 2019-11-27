package str113;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class zadanie {
    public static void main(String[] args) {
        Map mapaImion = new HashMap();
        Scanner skaner = new Scanner(System.in);
        String imie;
        String nazwisko;
        String wybor;
        podaj();
        do {
            wybor = skaner.nextLine();


            switch (wybor) {
                case "+":
                    System.out.println("podaj imie");
                    imie = skaner.nextLine();
                    System.out.println("podaj nazwisko");
                    nazwisko = skaner.nextLine();

                    mapaImion.put(imie, nazwisko);
                    podaj();
                    break;
                case "=":
                    System.out.println(mapaImion);
                    podaj();
            }

        } while (!wybor.equals("&"));
        System.out.println("koniec");
    }
    static void podaj(){
        System.out.println("co chcesz zrobic?\n+ dodać \n = wyświetlic");
    }
}


