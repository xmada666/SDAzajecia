package Imiona;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class ZadanieImiona2 {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();

        Scanner scanner = new Scanner(System.in);

        ArrayList a = new ArrayList();
        ArrayList b = new ArrayList();
        String in =scanner.nextLine();

        while (!in.equals("end")){
            System.out.println("1 imie");
            in=scanner.nextLine();
            a.add(in);
            System.out.println("2 imie");
            in=scanner.nextLine();
            b.add(in);
            System.out.println("czy koniec");
            in=scanner.nextLine();

        }
        System.out.println("podaj imie do porownania");
        in = scanner.nextLine();
        if (a.contains(in)){
            System.out.println(a.get(a.indexOf(in)) + " : " + b.get(a.indexOf(in)));

        }
    }
}
