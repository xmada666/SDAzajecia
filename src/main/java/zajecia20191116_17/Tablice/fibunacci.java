package zajecia20191116_17.Tablice;

import java.util.Arrays;

public class fibunacci {
    public static void main(String[] args) {

        printFibonacci(10);

       //foreach w strumieniu
        Arrays.stream(fibunacci(10))
                .forEach(System.out::println);
    }

    static long[] fibunacci(int n) {
        long[] result = new long[n];
        long first = 1;
        long second = 1;
        result[0] = first;
        result[2] = second;
        //fibonacci
        for (int index = 2; index < n; index++) {
            result[index] = result[index - 1] + result[index - 2];

        }

        return result;
    }

    static void printFibonacci(int n){
        long []result = fibunacci(n);
        for (int i =0; i < n; i++){
            System.out.println(result[i]);
        }

    }

}
