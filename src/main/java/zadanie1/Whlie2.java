package zadanie1;

import java.util.Scanner;

public class Whlie2 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        String aa;
        boolean boo= true;

        while ( boo){
           aa =skaner.nextLine();
           switch (aa ){
               case "koniec": boo = false;
               break;
               default:
               System.out.println(aa);
           }

        }


    }


}
