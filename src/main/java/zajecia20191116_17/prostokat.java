package zajecia20191116_17;

import java.util.Scanner;

public class prostokat {
    public static void main(String[] args) {
        System.out.println("podaj wys");
        int wys = new Scanner(System.in).nextInt();
        System.out.println("podaj szer");
        int szer = new Scanner(System.in).nextInt();
        for (int i =0; i<wys;i++) {
            System.out.println();
            for (int j = i+1; j < szer; j++)
                System.out.print(" * ");

        }
    }
}
