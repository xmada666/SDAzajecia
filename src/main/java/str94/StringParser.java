package str94;

import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringParser {

    static String imie;
    static String pojazd ;

    static String wezImie(String tekst) {

        String pattern = "([A-Z][a-z]+),\\s+([A-z][a-z]+).\\s+([A-z][a-z]+),\\s+([A-z][a-z]+)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(tekst);


        if (m.find()) {
            //System.out.println(m.group(1));
           imie = m.group(1);
            //System.out.println(m.group(2));
            pojazd = m.group(2);
            //System.out.println(m.group(3));

        }
        return m.group();

    }
}
