package zajecia20191116_17.zadDom;

public class zadaniePkt3 {
    public static void main(String[] args) {
        MyArrayInt lala = new MyArrayInt(new int[] {123,234,342,43,213,45642,3452435,6234,5356,23124,345,657,452,3,3});
        lala.printArray();
        lala.dodanieElementu(4);
        lala.printArray();
        System.out.println(lala.pobierzDlugosc());
    }
}
