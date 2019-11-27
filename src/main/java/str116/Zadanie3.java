package str116;

import java.util.*;
import java.util.stream.Collectors;

public class Zadanie3 {
    public static void main(String[] args) {
        Set <String> kolory = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("co zr");
        String wyb = scanner.nextLine();
        String kolor;
        while (!wyb.equals("&")){
            if (wyb.equals("+")){
                System.out.println("jaki dodac");
                kolor=scanner.nextLine();
                kolory.add(kolor);
            }
            if (wyb.contains("-")) {
                System.out.println("jaki usunąć");
                kolor = scanner.nextLine();
                kolory.remove(kolor);
            }
            System.out.println(kolory);
            System.out.println("co zr");
            wyb = scanner.nextLine();
        }

        System.out.println(kolory);
        ArrayList<String> sortedd = new ArrayList<>(kolory);
        sortedd.sort(String::compareTo);
        //Collections.sort(sortedd);

    }
}
