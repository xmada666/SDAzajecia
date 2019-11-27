package zadanie20191123.Lista;

public class Main {
    public static void main(String[] args) {
        ListaSDA listaSDA = new ListtaSDAimpl();
        listaSDA.addElement("Sda jest super, ale nie ma kawy");
        listaSDA.addElement("Sda jest super, ale nie ma kawy i ciastek");
listaSDA.addElement(1,"dupa");
        System.out.println(listaSDA.print());
        System.out.println(listaSDA.size());
    }
}
