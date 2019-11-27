package str117;

import com.sun.jdi.Value;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;

public class Zadanie2 {
    public static void main(String[] args) throws FileNotFoundException {
        File plik = new File("d:\\lorem.txt");
        Scanner skaner = new Scanner(plik);
        ArrayList <String> lista = new ArrayList<>();

        Map<String,Integer> mapa = new HashMap<String,Integer>();
        while (skaner.hasNext()){
            String[] tabLinia =skaner.nextLine().replace(",","").replace(".","").split(" ");
            for (int i =0 ; i <tabLinia.length; i++)
            lista.add(tabLinia[i]);
        }
        lista.sort(String::compareTo);

        Integer i=1;
        for (String item:lista){
            if (mapa.containsKey(item))
        mapa.put(item,mapa.get(item)+1);
            else mapa.put(item,i);


        }

        for (HashMap.Entry<String,Integer> kjhiuh :mapa.entrySet()
             ) {

            System.out.println(kjhiuh);
        }

    }}
