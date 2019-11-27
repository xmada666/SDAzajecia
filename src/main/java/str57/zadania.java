package str57;

import java.util.Scanner;

public class zadania {
    public static void main(String[] args) {

        int k= 3;
        String[]tablica = new String[k];
        tablica[0]= "konbinerki";
        tablica[1]= "nożyczki";
        tablica[2]= "śrubokręt";

        Scanner skaner = new Scanner(System.in);
        System.out.println("witaj " + skaner.nextLine() + " w ofercie mamy ");
        for (String item: tablica
             ) {
            System.out.println("- " + item);

        }
        System.out.println("co chcesz kupić?");
        switch (skaner.nextLine()){
            case "nożyczki":
                tablica[1]=null;
                k=k-1;
                break;
            case "kombinerki":
                tablica[0]=null;
                k=k-1;
                break;
            case "śrubokręt":
                tablica[2]=null;
                k=k-1;
                break;

        }
        for (String item: tablica
        ) {
            int i =0;
            if (item == null){

            }
            else{tablica= new String[k];
            for (i =0; i <k; i++){
            tablica[i]=item;

            }
           System.out.println("- " + item);

        }


        }
        for (String item2: tablica
        ) {
            //System.out.println("ddd"+item2);
        }
}}
