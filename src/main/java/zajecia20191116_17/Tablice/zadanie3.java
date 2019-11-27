package zajecia20191116_17.Tablice;

public class zadanie3 {
    public static int[] jednaTabica(int[] tab1, int[] tab2) {

        int[] wynikTab = new int[tab1.length];
        for (int i = 0; i < tab1.length; i++) {

            wynikTab[i] = tab1[i] + tab2[i];

        }
        return wynikTab;
    }

    //suma 2 tablic różnych rozmiarów
    public int[] zadnie3b(int[] tab1, int[] tab2) {
        int[] longerTab = tab1.length > tab2.length ? tab1 : tab2;
        int index = tab1.length > tab2.length ? tab2.length : tab1.length;

        for (int i = 0; i < index; i++) {
            longerTab[i] = tab1[i] + tab2[i];

        }
        return longerTab;

    }
}

