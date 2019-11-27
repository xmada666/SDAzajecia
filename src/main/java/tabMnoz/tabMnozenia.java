package tabMnoz;

public class tabMnozenia {
    public static void main(String[] args) {
        int tablica [][] = new int[10][10];

        for (int i=1; i <= tablica.length;i++
             ) {
            for (int j =1; j<=tablica.length;j++)
            tablica[i-1][j-1] =i*j;

        }
        for (int i=0; i < tablica.length;i++
        ) {
            for (int j =0; j<tablica.length;j++){
                System.out.printf("%4d",tablica[i][j]);

        }
            System.out.println();
    }
}}
