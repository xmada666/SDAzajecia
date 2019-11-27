package str53;

import java.util.Scanner;

public class Zadnie2 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        int liczba = 10;
        Integer tablica[] = new Integer[liczba];

        for (int i = 0; i < liczba; i++) {
            if (i % 2 == 0) {
                tablica[i] = i;
                System.out.println(tablica[i]);
            }

        }
        for (int i = 0; i < liczba; i++) {
            if (i % 3 == 0) {
                tablica[i] = i;
                System.out.println("podzielne przez 3: " + tablica[i]);
            }
        }
        for (int i = 0, uzyt =skaner.nextInt(); i < liczba; i++) {
            if (i % uzyt == 0) {
                tablica[i] = i;
                System.out.println("liczba użytkownika: " + tablica[i]);
            }
        }
    }}