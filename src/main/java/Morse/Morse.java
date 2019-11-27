package Morse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Morse {
    public static void main(String[] args) throws FileNotFoundException {
        File plik = new File("d:\\morse.txt ");
        Map<String, String> mapa = new HashMap<>();
        Scanner scanner = new Scanner(plik);
        while (scanner.hasNext()) {
            String[] temp = scanner.nextLine().split(" ");

            mapa.put(temp[0], temp[1]);
    }

        System.out.println(mapa);

        System.out.println("podaj zmak");
        String wybor = new Scanner(System.in).nextLine();
        while (!wybor.contains("&")) {

            System.out.println(mapa.get(wybor));
            System.out.println("podaj zmak");
            wybor = new Scanner(System.in).nextLine();
        }
    }
}
