package Kalkulator;

public class Kalkulator {


    static double dodawanie(double a,double b) {
        return a + b;

    }
    static double odejmowanie (double a, double b){
        return a - b;
    }
    static void mnożenie (double a , double b){
        System.out.println(a*b);
    }
    static void dzielenie (double a, double b){
        System.out.println(a/b);
    }
    static void resztaZdzielenia (double a, double b){
        System.out.println(a%b);
    }

}
