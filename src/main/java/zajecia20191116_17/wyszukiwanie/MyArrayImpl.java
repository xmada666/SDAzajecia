package zajecia20191116_17.wyszukiwanie;

public class MyArrayImpl implements MyArray {
    private int[] store;
    private int elementCounter;
    public MyArrayImpl() {
        store = new int[100];
    }
    public int getElementCount() {
        return elementCounter;
    }
    public int getElementAt(int index) {
        if (index >= 0 && index < elementCounter)
            return store[index];
        else return 0;
    }
    public void insertElementAt(int element, int index) {
        if (elementCounter > store.length)
            increaseSize();
        for (int i = elementCounter; i > index; i--)
            store[i] = store[i - 1];
        store[index] = element;
        elementCounter++;
    }
    private void increaseSize() {
        int[] temp = new int[2 * elementCounter];
        for (int i = 0; i < elementCounter; i++)
            temp[i] = store[i];
        store = temp;
    }
    public void insertElementBefore(int element, int index) {
        insertElementAt(element, index > 0 ? index - 1 : index);
    }
    public int findIndexOf(int element) {
        if (elementCounter == 0)
            return 0;
        for (int i = 0; i < elementCounter; i++)
            if (store[i] >= element)
                return i + 1;
        return elementCounter + 1;
    }
    public void addElement(int element) {
        insertElementBefore(element, findIndexOf(element));
    }
    public void addElements(int[] elements) {
        for (int x : elements)
            addElement(x);
    }
    public void print() {
        for (int i = 0; i < elementCounter; i++)
            System.out.print(store[i] + ", ");
    }
}
