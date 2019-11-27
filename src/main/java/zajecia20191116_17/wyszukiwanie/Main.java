package zajecia20191116_17.wyszukiwanie;

public class Main {
    public static void main(String[] args) {
ArrayImpl array = new ArrayImpl();

array.addElement(33);

array.print();
        System.out.println("index elementu  33 to: " + array.indexElementu(33));
        MyArrayImpl myArray = new MyArrayImpl();
        myArray.addElement(77);
        myArray.addElement(22);
        myArray.addElement(33);
      //  myArray.insertElementBefore(23,2);
        myArray.print();
    }
}
