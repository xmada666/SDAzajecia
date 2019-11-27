package zadanie1;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        int aaa;

        Scanner skaner = new Scanner(System.in);
        double odp = skaner.nextDouble();
        double odp2 =skaner.nextDouble();
   if (odp%2 ==0&& odp/odp2==0){
       System.out.println("parzysta");
       System.out.println("podzielna");

   }
   else if(odp%2 ==0&& odp/odp2 !=0){
       System.out.println("parzysta");
       System.out.println("niepodzielna");

   }
   else if(odp%2 !=0&& odp/odp2 ==0){
       System.out.println("nieparzysta");
       System.out.println("podzielna");
   }
   else{
       System.out.println("nieparzysta");
       System.out.println("niepodzielna");
   }
    }
    }


