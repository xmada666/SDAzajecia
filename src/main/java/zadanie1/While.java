package zadanie1;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int i = 0;
        Scanner skaner = new Scanner(System.in);
         int sss;
       int ia =0;
        while(i <5) {
            sss = skaner.nextInt();
            if (sss > 10) {
                ia = ia + sss ;

            }
            i++;
        }
        System.out.println(ia);
    }
}

