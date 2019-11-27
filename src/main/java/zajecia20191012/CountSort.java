package zajecia20191012;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CountSort {
    public static void main(String[] args) {
        int[] tab = new int[] {50,2,4,11,5,6,11,4};
        HashSet <Integer> zbior = new HashSet<>();
        List<Integer> lista = new ArrayList<Integer>();
        for (int i =0; i<tab.length; i++)
            if (tab[i] >=0 && tab[i] <=14)
            lista.add((tab[i]));
int [] pom = new int[15];
for (int i =0; i <15; i++)
    pom[i]= 0;
for (int j =0; j <15; j++)
    if (pom[j] >0)
        for (int i =1; i <=pom[j]; i++)
            System.out.println(j + " ");

    }
}
