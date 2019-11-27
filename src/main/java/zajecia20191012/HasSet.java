package zajecia20191012;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class HasSet {
    public static void main(String[] args) {

        int[] tab = new int[] {50,2,4,11,5,6,11,4};

        HashSet <Integer> listaH =new HashSet<Integer>();


        for (int i=0; i < tab.length; i++){
            listaH.add(tab[i]);
        }

        for (int iaa: listaH
             ) {
            System.out.println(iaa);
        }
        System.out.println(listaH);
    }
}
