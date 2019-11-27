package zajecia20191116_17.Tablice;

import java.util.Random;
//inny sposób zadanie
public class Tablica {
    public  void zadanie2(int rozmiarTablicy, int dolnaGranica, int gornaGranica) {
        Random rnd = new Random();
        rnd.ints(dolnaGranica,gornaGranica -dolnaGranica + 1)
                .limit(rozmiarTablicy)
                .toArray();
              //  .forEach(System.out::println);



    }
}
