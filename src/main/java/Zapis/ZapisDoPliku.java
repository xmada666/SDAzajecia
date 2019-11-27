package Zapis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ZapisDoPliku {
    public static void main(String[] args) throws FileNotFoundException {


/*    PrintWriter zapis = new PrintWriter("d:\\1\\aa.txt");
    zapis.println("dupa");
    zapis.close();*/
        File plik = new File("d:\\1\\aa.txt");
        Scanner scanner = new Scanner(plik);
        System.out.println(scanner.nextLine());
}}
