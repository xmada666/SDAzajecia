package zajecia20191116_17.Tablice;

import java.util.Random;
import java.util.Scanner;

public class zadanie {
    public static void main(String[] args) {

        Scanner scener = new Scanner(System.in);
        System.out.println("podaj dolna granica");
        int dolna = scener.nextInt();
        System.out.println("podaj gorna granica");
        int gorna = scener.nextInt();
        Random random = new Random();

        System.out.println("podaj dł tab");
        int dł = scener.nextInt();
        int los = random.nextInt(gorna);

        int[] tablice = new int[dł];

        for (int i = 0; i < dł; i++) {
            los= new Random().nextInt(gorna);
        while (los<dolna) {
                los= new Random().nextInt(gorna);
        }
            tablice[i] = los;
        }
        for (int item : tablice
        ) {

            System.out.println(item);
        }

    }
}
