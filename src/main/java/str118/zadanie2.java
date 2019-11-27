package str118;

import java.util.ArrayList;
import java.util.Scanner;
public class zadanie2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        for (int i = 0; i < 10; i++
        ) {
            list.add("*");
        }
        System.out.println("+ -");
        Scanner scanner = new Scanner(System.in);
        int wybór = 0;
        while (true) {
            String plusminus = scanner.nextLine();
            if (plusminus.equals("+")) {
                wybór = wybór + 1;
            }
            if (plusminus.equals("-")) {
                wybór = wybór - 1;
            }
            for (int i = 0; i < wybór; i++
            ) {
                System.out.println();
                for (String a : list
                ) {
                    System.out.print(a + " ");
                }
            }
        }
    }
}
