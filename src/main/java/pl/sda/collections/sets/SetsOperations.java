package pl.sda.collections.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetsOperations {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Ania");
        names.add("Frania");
        names.add("Magda");
        names.add("Magda");
        System.out.println(names);
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
/*        names.clear();
        System.out.println(names);*/
    }
}
