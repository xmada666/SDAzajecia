package zajecia20191116_17;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        testLambda();
/*        String[] slowa={"samochód","krzesło","lampa","znak","ściana","okno", "szyba","stół","autobus","chodnik","słup","drzewo",
        "budynek","miasto"};
        Arrays.stream(slowa)
                .filter(a-> a.length()<5)
                .collect(Collectors.toList());*/
    }
    public static void testLambda(){
        char[] polishChars = new char[]{'ą','ę','ć','ł','ó','ś','ć'};
        Map<Integer,List<String>>result =Stream.of("samochód","krzesło","lampa","znak","ściana","okno", "szyba","stół","autobus","chodnik","słup","drzewo",
                "budynek","miasto")
                .filter(s->
                        s.chars().allMatch(c ->{
                            for (char polishCharacter: polishChars)
                                if (polishCharacter ==(char) c)
                                    return false;
                                return true;
                               })
                )
                .filter(a-> a.length()>=5)
                .collect(Collectors.groupingBy(String::length));
        System.out.println(result.values());


    }
}
