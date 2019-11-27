package zajecia20191012;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class zadanieHashMap {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        String plik = "d:\\Java\\truciciele.txt ";
        File file = new File(plik);
        try {
            FileReader reader = new FileReader(plik);
            BufferedReader buf = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String linia = "";
            while ((linia = buf.readLine()) != null) {
                String[] kawalki = linia.split(",");
                String firma = kawalki[0];
                for (int i = 0; i < kawalki.length; i++) {
                    String produkt = kawalki[i];
                    if (map.containsKey(produkt)) {
                        ArrayList<String> lista = map.get(produkt);
                        lista.add(firma);
                        map.put(produkt, lista);
                    } else {
                        ArrayList<String> lista = new ArrayList<>();
                        lista.add(firma);
                        map.put(produkt, lista);
                    }
                }
            }
        } catch (IOException iex) {
            System.out.println(iex.getMessage());
        }
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : ");
            ArrayList<String> lista = entry.getValue();
            System.out.println(lista);
        }
    }
}
