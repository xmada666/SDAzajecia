package SerializacjaDeserializacja;

import jdk.nashorn.api.scripting.URLReader;

import java.net.URLConnection;

public class Pogoda {
    public static void main(String[] args) {
        String adres ="http://api.openweathermap.org/data/2.5/weather?q=Poznan&units=metric&APPID=991ad9845f826c20b44dec9d655dd928";
        String content ="";
        String wynik ="{\"coord\":{\"lon\":27.47,\"lat\":51.59},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04d\"}],\"base\":\"model\",\"main\":{\"temp\":11.24,\"pressure\":1016,\"humidity\":57,\"temp_min\":11.24,\"temp_max\":11.24,\"sea_level\":1016,\"grnd_level\":997},\"wind\":{\"speed\":3.58,\"deg\":287},\"clouds\":{\"all\":100},\"dt\":1572267571,\"sys\":{\"country\":\"BY\",\"sunrise\":1572238548,\"sunset\":1572274312},\"timezone\":7200,\"id\":706075,\"name\":\"Poznan\",\"cod\":200}";
    }
}
