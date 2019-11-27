package Kalkulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);
        System.out.println("jakie dziłanie?\n" +
                "+\n" +
                "-\n" +
                "/" );

        String wybor = skaner.nextLine();
        double a = skaner.nextDouble();
        double b =skaner.nextDouble();


        switch (wybor){
            case "+":
                System.out.println(Kalkulator.dodawanie(a,b));
                break;
            case "-":
                System.out.println(Kalkulator.odejmowanie(a,b));
                break;
            case "/":
                    Kalkulator.dzielenie(a,b);
               break;
            case "r":
                Kalkulator.resztaZdzielenia(a,b);
                }

        }
    }

