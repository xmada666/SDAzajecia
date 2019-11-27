package str94;

import java.time.LocalDateTime;

public class Person {
    String imie;
    Car vehicle;
    LocalDateTime data;


    public Person(String imie, Car vehicle, LocalDateTime data) {
        this.imie = imie;
        this.vehicle = vehicle;
        this.data = data;
    }
}
