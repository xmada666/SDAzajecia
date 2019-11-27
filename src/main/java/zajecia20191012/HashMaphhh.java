package zajecia20191012;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMaphhh {
    public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<String, Integer>();
        mapa.put("Nowak", 2000);
        mapa.put("Kowalski", 3000);
        mapa.put("Mailinowski", 1500);
        mapa.put("Zenon", 1000);

        //wyszukuje po kluczu
        System.out.println(mapa.get("Kowalski"));
        //System.out.println(mapa.keySet().iterator().next().indexOf(1));

        HashMap<Integer,Integer> mapa1 = new HashMap<>();
        List<Integer> list = new ArrayList<Integer>();
        for (int k: list)
            if (mapa1.containsKey(k)){
                int jest = mapa.get(k) +1;
                mapa1.put(k, jest);
            }
        else
            mapa1.put(k,1);

    }
}
