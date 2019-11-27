package zadanie1;

import java.util.Scanner;

public class Tablice {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);
       int a = skaner.nextInt();
       int suma= 0;
        Integer [] tablica = new Integer[a];
        for (int i =0 ; i<a; i++){
            tablica[i] = skaner.nextInt();

        }
        for (int item:tablica
             ) {
            suma+=item;
            System.out.println(item);
        }
        System.out.println(suma);
    }
}
