package str43;

import java.util.Scanner;

public class Kwadrat {
    public static void main(String[] args) {
        int szer;
        String znak;
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj wysokość");
        int wys = scanner.nextInt();
        System.out.println("podaj szer");
        szer = new Scanner(System.in).nextInt();
        System.out.println("podaj znak");

        znak = new Scanner(System.in).nextLine();

        for (int j = 0; j < szer; j++) {
            System.out.println();


            for (int i = 0; i < wys; i++) {
                System.out.print(znak + " ");
            }
        }
    }
}
