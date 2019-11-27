package pl.sda.collections.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        String[] names = {"Andrzej", "Jacek", "Placek"};
        //dodać do tablicy names  Marek - wynikiem ma być tabilca 4 elementowa z Markiem na końcu


        String[] cars ={"fiat", "polonez", "warszawa"};
        String[] carsSmaller = remoweCar (cars, "polonez");

        System.out.println(Arrays.toString(carsSmaller));

        }



    private static String[] remoweCar(String[] cars,String carToRemove) {
        String[] newCars = new  String[cars.length-1];
        for (int i=0,j=0; i<cars.length; i++){
            if (!cars[i].equals(carToRemove)){


            newCars[j] =cars[i];
            j++;}
    }

     return newCars;
}}
