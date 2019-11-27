package zadanie20191123;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wprowadz = scanner.nextLine();

    }
    String []tablica;
    int counter;

public Kalkulator (int size) {
    tablica = new String[size];

}
     void push (String element){
    tablica[counter]=element;
    counter++;

    }


}
