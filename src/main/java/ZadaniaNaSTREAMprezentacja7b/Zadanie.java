package ZadaniaNaSTREAMprezentacja7b;

import java.util.*;

public class Zadanie {
    public static void main(String[] args) {

        List<Integer> intList = List.of(1, 4, 6, 9, 3, 9, 5, 42, 5, 2, 3);
        //przykład
        List<Integer> other = Arrays.asList(1, 1, 3, 4);
//TODO doWszystkie elementy posortowane wg wartości od największej do najmniejszej
        sortowanie(intList);
////TODO Elementy parzyste (a za nimi pozostałe elementy) listy
        parzysteNieparzyste(intList);
        //TODO Wartość największego elementu na liście
        wartoscNajwiekszego(intList);
        //TODO Wartość wartość najmniejszego elementu na liście (można jak wyżej z :naturalorder
        intList.stream()
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);
        List<Integer> empty = new ArrayList<Integer>();
        try {
            Optional<Integer> optInt = empty.stream()
                    .min(Comparator.naturalOrder());
            Integer val = optInt.get();
        } catch (Throwable throwable) {
            System.out.println("no value present");
        }

        //TODO sumowanie
        sumowanie(intList);
        //TODO przykłąd 2
        int i =intList.stream()
        //        .reduce(0,(seed,nexNum) ->seed+=nexNum); // reduce zamienia na jedną pojedynczą wartość
        //System.out.println("SumaAA: " + i);
                .reduce(1,(seed,nexNum) -> seed*nexNum); // z iloczynem
        System.out.println("iloczyn: " + i);


    }

    private static void sumowanie(List<Integer> intList) {
        int sum = intList.stream()
                .mapToInt((x -> x))
                .sum();
        System.out.println("Suma: " + sum);
    }

    private static void wartoscNajwiekszego(List<Integer> intList) {
        intList.stream()
                .sorted(Comparator.reverseOrder())
                .findFirst()
                .ifPresent(n -> System.out.println("wartość największa " + n));
    }

    private static void parzysteNieparzyste(List<Integer> intList) {
        intList.stream()
                .sorted(Comparator.comparing(x -> x % 2))
                .forEach(System.out::println);
    }

    private static void sortowanie(List<Integer> intList) {
        intList.stream()
                //Wszystkie elementy posortowane wg wartości od największej do najmniejszej
                //.sorted((x1, x2) -> x1-x2)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
