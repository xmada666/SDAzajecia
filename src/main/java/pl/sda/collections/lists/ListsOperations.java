package pl.sda.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ListsOperations {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        System.out.println(ints);
        ints.add(2, 8);
        System.out.println(ints);
        ints.remove(1);
        System.out.println(ints);
        ints.remove(Integer.valueOf(3));
        System.out.println(ints);
        int a = ints.get(ints.size() - 1);
        System.out.println(a);
        System.out.println(ints.indexOf(5));

        List<Integer> nowaLista = new ArrayList<>();

        for (Integer i : ints) {
            nowaLista.add(i);
            nowaLista.add(i);
        }
        System.out.println(nowaLista);


        System.out.println(nowaLista.indexOf(4));
        System.out.println(nowaLista.lastIndexOf(4));

        List<Integer> lista3 = new ArrayList<>();
        for (Integer i : ints) {
            lista3.add(i);
            lista3.add(i);
            lista3.add(i);
            lista3.add(i);

        }
        System.out.println(lista3);

        //System.out.println(lista3.indexOf(4)+2);
List<Integer> lista4 = lista3.subList(0,8);


        System.out.println(lista4);
    }

}