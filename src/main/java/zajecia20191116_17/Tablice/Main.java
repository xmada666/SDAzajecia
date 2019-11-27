package zajecia20191116_17.Tablice;

public class Main {
    public static void main(String[] args) {
        Tablica tablica = new Tablica();
        tablica.zadanie2(9, 1, 8);
//zadanie3
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6, 7};
        int[] wynik = zadanie3.jednaTabica(a, b);
        for (int item : wynik
        ) {
            //  System.out.println(item);
        }
        zadanie3 zadanie3 = new zadanie3();
        int[] tabaa = zadanie3.zadnie3b(a, b);
        for (int arg : tabaa
        ) {
            System.out.println(arg);
        }
    }
}
