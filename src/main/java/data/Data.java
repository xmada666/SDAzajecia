package data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {
    public static void main(String[] args) {
        LocalDateTime aktualnaData = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMdd");
        String a = aktualnaData.format(formatter);
        System.out.println(a);
    }
}
