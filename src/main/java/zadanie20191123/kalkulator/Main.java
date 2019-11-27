package zadanie20191123.kalkulator;

public class Main {
    public static void main(String[] args) {
        String input = "1+2*6/3+2";
        int expected =7;
        AritmericCalculator calculator = new AritmericCalculator();
        String[] arrOfElements = calculator.mapStringToArray(input);
        calculator.addElementsFromArray(arrOfElements);
        System.out.println();
    }
}
