package zdnaniaC;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibonacci.meto(0));
    }

    public static long meto(int x) {
        try {

            long[] tab = new long[x];

            tab[0] = 1;
            tab[1] = 1;
            for (int i = 2; i < x; i++)
                tab[i] = tab[i - 1] + tab[i - 2];
            return tab[x - 1];
        } catch (ArrayIndexOutOfBoundsException z) {
            System.out.println("Błąd KURWA");
            return 0;
        }

    }
}