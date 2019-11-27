package str115;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class Słownik {
    public static void main(String[] args) {
        Dictionary<String, ArrayList<String>> slownik = new Hashtable<>();
        Dictionary<String, String> drugi = new Hashtable<>();
        drugi.put("poznań", "Polska");
        drugi.put("warszawa", "Polska");
        drugi.put("Wrocław", "Polska");
        drugi.put("Berlin", "Niemcy");
        drugi.put("Wrocław", "Niemcy");
        slownik.put("Polska", new ArrayList<>());

        slownik.get("Polska").add("poznań");
        slownik.get("Polska").add("warszawa");
        slownik.get("Polska").add("Wrocław");

        slownik.put("Niemcy", new ArrayList<>());
        slownik.get("Niemcy").add("Berlin");
        slownik.get("Niemcy").add("Hamburg");
        System.out.println(slownik);
        Scanner skaner = new Scanner(System.in);
        System.out.println("czzego nie odwiedziłeś?\n - państwo - p \n - miasto - m");
        String wybor = skaner.nextLine();
        String miasto;
        while (!wybor.equals("koniec")) {
            if (wybor.contains("p")) {
                System.out.println("katuryje panstwo");
                wybor = skaner.nextLine();
                while (!wybor.equals("wroc")) {
                    slownik.remove(wybor);
                    System.out.println("usunięto! ;-D");
                    System.out.println("katuryje panstwo");
                    wybor = skaner.nextLine();
                }

                System.out.println(slownik);
            }
            if (wybor.contains("m")) {
                System.out.println("katuryje miasto");
                wybor = skaner.nextLine();
                while (!wybor.equals("wroc")) {
                    slownik.get(drugi.get(wybor)).remove(wybor);
                    System.out.println("usunięto! ;-D");
                    System.out.println("katuryje miasto");
                    wybor = skaner.nextLine();
                }
            }
            System.out.println("czzego nie odwiedziłeś?\n - państwo - p \n - miasto - m");
            wybor = skaner.nextLine();
        }
        System.out.println(slownik);
    }
}