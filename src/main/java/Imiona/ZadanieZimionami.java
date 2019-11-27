package Imiona;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ZadanieZimionami {
    public static void main(String[] args) {
        HashSet<String> listaImion = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        while (!a.equals("end")){
            listaImion.add(a);
            a = scanner.nextLine();
        }
        System.out.println(listaImion.size());
    }
}
