package StrumienieWWWWW;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("d:\\temp\\tadeusz.txt ");
        Scanner scanner = new Scanner(file);
        // System.out.println(text);
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();
        while (scanner.hasNext()) {
            lista.add(scanner.next());
        }
        System.out.println(lista.size());
        for (String item : lista
        ) {
            lista2.add(item.replace("!", ""));

        }
        //System.out.println(lista2);
        HashMap<Integer,HashSet<String>> hmap =new HashMap<>();

        HashMap<Integer, List<String>> mapa2 = (HashMap<Integer, List<String>>) lista.stream()
                .map(a -> a.replace("!", ""))
                .map(a -> a.replace(",", ""))
                .map(a -> a.replace(".", ""))
                .map(a -> a.replace("?", ""))
                .map(a -> a.toLowerCase())
                .sorted((a, b) -> a.length() - b.length())
                .collect(Collectors.groupingBy(a -> a.length()));
        for (HashMap.Entry poz:mapa2.entrySet()
             ) {
            HashSet <String>temp = new HashSet<>();
            for (String wyr:(List<String>)poz.getValue()
                 ) {
                temp.add(wyr);
            }
            if ((int)poz.getKey() != 0)
            hmap.put((Integer) poz.getKey(),temp);
        }

        //System.out.println(mapa2);
        for (Map.Entry item : hmap.entrySet()
        ) {

                System.out.println(item);
        }


    }
}
