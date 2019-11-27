import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class zapisIodczytpliku   {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File file=new File("d:\\imie.txt");
        FileWriter writer = new FileWriter(file);
        writer.write(scanner.next());
        writer.close();

        System.out.println(new Scanner(file).next());

    }
}
