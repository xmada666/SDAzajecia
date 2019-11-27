package pl.sda.collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class MapsOperations {
    public static void main(String[] args) {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("Poznan", "Polska f");
        stringMap.put("Szczecin", "Polska g");
        stringMap.put("Gdansk", "Polska h");
        stringMap.put("Warszawa", "Polska f");

        System.out.println(stringMap.get("Poznan"));
        String ab = stringMap.getOrDefault("oznan", "Pofffflska");
        System.out.println(ab);
        stringMap.values();
        System.out.println(stringMap.values());


    }
}
