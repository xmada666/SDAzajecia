package SerializacjaDeserializacja;

import com.google.gson.Gson;

import java.util.ArrayList;

public class zadanie {
    public static void main(String[] args) {
        Gson gson = new Gson();
        System.out.println("cos");
        String a ="vvvv", napis;
        napis= gson.toJson(a);
        System.out.println(napis);
        int[] całkowite = {1, 2, 3, 4, 5};
        napis = gson.toJson(całkowite);
        System.out.println(napis);

    }
}
