package zadanie1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tablica3 {
    public static void main(String[] args) {
        Double[] tablica = new Double[5];
        tablica[0] =-1.0;
        tablica[1] =-2.0;
        tablica[2] =-3.0;
        tablica[3] =-4.0;
        tablica[4] =-5.0;

int war =0;
int war2=0;
        Arrays.sort(tablica);
        if (tablica.length%2==0){
            war = tablica.length;
            war2 = tablica.length-1;

            System.out.println(war +"  " + war2);
            System.out.print(tablica[(int) (war-1)]+tablica[war2-1]/2);
        }
    else{

            System.out.println(tablica[tablica.length/2]);
        }
    }
}
