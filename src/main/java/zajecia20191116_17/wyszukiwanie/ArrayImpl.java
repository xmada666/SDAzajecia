package zajecia20191116_17.wyszukiwanie;

import java.util.Arrays;

public class ArrayImpl implements ArraySDA{
    private int[] store;
    private int licznik =0;


    public ArrayImpl() {
       store= new int[]{1,2,3,4,5,6,7,8,9,10};
licznik=10;
    }

    @Override
    public int length() {
        return licznik;

    }

    @Override
    public int elementOindexsie(int index) {
        if (index >= 0 && index < licznik) {

            return store[index];
        } else return -1;
    }

    public void addElement(int element, int index){

        store= Arrays.copyOf(store,store.length*2);
       // for (int i =index; i<store.length-1;i++
        for (int i =licznik; i>=index;i--) {
            store[i]=store[i-1];
                 }
        store[index]= element;
        licznik++;
    }

    @Override
    public void addElement(int element) {
       //indexElementu(element);
       // addElement(element);
    }

    @Override
    public int indexElementu(int element) {
        for (int i =0; i<store.length;i++){
            if (store[i]>=element)
                return i;
        }
        return licznik;
    }

    public void print(){
        for (int item:store
             ) {
            System.out.println(item);
        }
    }
}
