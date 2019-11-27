package pl.sda.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class CollectionsOperations {
    public static void main(String[] args) {
        Collection<String> films = new ArrayList<>();
        films.add("rambo");
        films.add("rocky");
        films.add("predator");
        System.out.println(films);
        films.remove("rocky");

        System.out.println(films);
        Collection<Integer> newFilms = new ArrayList<>();
        newFilms.add(1);
        newFilms.add(2);

        //films.addAll(newFilms);
        System.out.println(films);
        Collection<Object> obiekty = new ArrayList<>();
        obiekty.addAll(films);
        obiekty.addAll(newFilms);
        obiekty.add(new String[]{});
        System.out.println(obiekty);
        for (Object item:obiekty) {
            if(item instanceof String){
                String s = (String)item;
                String replaced = s.replace("rambo", "huhu");
                item = replaced;
            }

        }
        System.out.println(obiekty);
    }
}
