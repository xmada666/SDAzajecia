package str113;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ppktC {
    public static void main(String[] args) {
        Map <String, List<String>> mapa = new HashMap<>();
        List <String> koledzy = new ArrayList<String>();

        mapa.put("Artur",new ArrayList<>());
        mapa.get("Artur").add("Jarek");
        mapa.get("Artur").add("bartek");
        mapa.get("Artur").add("ss");
        mapa.get("Artur").add("dd");
        mapa.get("Artur").add("ff");
        mapa.get("Artur").add("gg");
    }
}
