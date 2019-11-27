package str98;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class zadanie {
    public static void main(String[] args) throws FileNotFoundException {
        
        File lorem = new File("d:\\lorem.txt");
        Scanner skaner = new Scanner(lorem);
        String text = skaner.nextLine();
        text = text.replace(",", "").replace(".", "").toLowerCase();
        Scanner skaner2 = new Scanner(lorem);

        int a = 0;
        while (skaner2.hasNext()) {
            if (skaner2.next().equals("lorem"))
                a++;




        }
        System.out.println(a);
        PrintWriter zapis = new PrintWriter("d:\\lorem3.txt");
       zapis.print(text);
       zapis.close();
    }
}


