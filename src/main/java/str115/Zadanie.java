package str115;

import java.util.*;

public class Zadanie {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        String panstwo;
        String miasto;
int licznik =1;
        Map<String, ArrayList<String>> mapa = new HashMap<>();
        System.out.println("jaki kraj");
        panstwo = skaner.nextLine();
        while (!panstwo.equals("koniec")) {
            System.out.println("jalie miasto?");
            miasto = skaner.nextLine();
            ArrayList<String> miasta = new ArrayList<>();
            licznik=0;
            while (!miasto.equals("jade")) {
                if (miasta.contains(miasto)){
                    licznik =licznik +1;
                miasta.add(miasto);
                mapa.put(panstwo, miasta);
                miasto = skaner.nextLine();
            }
            System.out.println("jaki kraj");
            panstwo = skaner.nextLine();
        }

        for (Map.Entry<String,ArrayList<String>> item: mapa.entrySet())
              {
            System.out.println(item.getKey() + ":\n");
                  for (String mst: item.getValue()
                       ) {
                      System.out.println("    -" + mst);
                  }
                  System.out.println();
            }
        }
    }}

