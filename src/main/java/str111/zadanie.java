package str111;

import java.util.*;

public class zadanie {
    public static void main(String[] args) {
/*        Set<String> lista = new HashSet();
        lista.add("mleko");
        lista.add("mleko");
        lista.add("chleb");
        lista.add("masło");
        lista.add("chleb");
       // lista.remove("masło");
         System.out.println(lista);

            *//* ) {if (item.startsWith("m",1)) {

                 System.out.println(item);

        }*//*
        Scanner skaner = new Scanner(System.in);
        System.out.println("co chcesz usunać?");
        lista.remove(skaner.nextLine());
        System.out.println(lista);

        System.out.println(lista);*/

/*
        List<Double>lOcen = new ArrayList<Double>();
        lOcen.add(2.0);
        lOcen.add(1.0);
        lOcen.add(4.0);
double a=0.0;
        for (Double item: lOcen
             ){
a = (item +a);

        }
        System.out.println(a/lOcen.size());
*/
        Map<String, String> map = new HashMap();
        int b = 0;
        int c=0;
        do {
            String a = "hu" + b;
            String i = "ulica" + b;
            map.put(a, i);
            c++;
            b++;




        }while (c < 6);
        System.out.println(map);
    }}

