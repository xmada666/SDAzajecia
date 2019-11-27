package Catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class wyjatek{
        public static void main (String[] args ){
            Scanner wejscie = new Scanner(System.in);
            int wprowadzonaWartosc;
            System.out.println("Podaj dowolna wartosc typu int");
            try {
                wprowadzonaWartosc = wejscie.nextInt();
            }
            catch (InputMismatchException aa) {
                System.out.println("Wprowadzona wartosc nie jest typu int\n" + aa);
                return;

          }
           System.out.println("Wprowadzona wartosc to : " + wprowadzonaWartosc);
}}