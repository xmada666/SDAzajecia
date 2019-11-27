package zajecia20191116_17.zadDom;

import java.util.Arrays;

public class MyArrayInt implements MyArray {
    private int[] tablica;
    private int licznik = 0;

    public MyArrayInt() {
        tablica = new int[20];
    }

    public MyArrayInt(int[] elementyStartowe) {
        tablica = new int[elementyStartowe.length + 20];
        dodanieElementow(elementyStartowe);
    }

    @Override
    public int pobierzDlugosc() {
        return licznik;
    }


    @Override
    public int elemNaIndexie(int x) {
        return x < 0 || x >= licznik ? -1 : tablica[x];
    }

    @Override
    public void wstawElprzdIndex(int element, int index) {
        if (licznik == tablica.length) {
            int[] nowa = new int[tablica.length * 2];
            for (int i = 0; i < licznik; i++) {
                nowa[i] = tablica[i];
            }
            tablica = nowa;
        }

        for (int i = licznik; i > index; i--)
            tablica[i] = tablica[i - 1];
        tablica[index] = element;
        licznik++;
    }

    @Override
    public int zwrocIndexPodanegoElementu(int element) {
        for (int i = 0; i < licznik; i++) {
            if (tablica[i] >= element)
                return i;
        }
        return licznik;
    }

    @Override
    public void dodanieElementu(int element) {
        wstawElprzdIndex(element, zwrocIndexPodanegoElementu(element));
    }

    @Override
    public void usunPoIndeksie(int index) {
        for (int i = index; i < licznik; i++)
            tablica[i] = tablica[i + 1];
        licznik--;
    }

    public void usunPoElemencie(int elemement) {
        for(int i=0;i<licznik;i++)
            if(tablica[i]==elemement){
                usunPoIndeksie(i);
                break;
            }
    }


    public void dodanieElementow(int[] elementy) {
        for (int x : elementy
        ) {
            dodanieElementu(x);
        }
    }


    public void printArray() {
        for (int i = 0; i < licznik; i++)
            System.out.print(tablica[i] + ", ");
        System.out.println();
    }
}
