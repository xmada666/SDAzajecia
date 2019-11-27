package str118;

import java.util.*;

public class Zadanie1 {
    public static void main(String[] args) {
        Menager ziutek = new Menager("ziutek");
        Menager marian = new Menager("marian");

        HashMap<Menager, ArrayList<Employee>> mapa = new HashMap();
        mapa.put(ziutek, new ArrayList<>());
        mapa.put(marian, new ArrayList<>());

        Scanner scanner = new Scanner(System.in);

        System.out.println(" + - end");
        String odp = scanner.nextLine();
        while (true) {
            String men;
            String prac;
            if (odp.equals("+")) {
                System.out.println("któr menedżer ");
                men = scanner.nextLine();
                System.out.println("imię pracownika");
                prac = scanner.nextLine();
                if (men.equals("ziutek")) {
                    mapa.get(ziutek).add(new Employee(prac));
                }
                if (men.equals("marian")) {
                    mapa.get(marian).add(new Employee(prac));
                }
            }
            if (odp.equals("-")) {
                ArrayList <Employee> temp = new ArrayList<>();
                System.out.println("który menadżer");
                men = scanner.nextLine();
                if (men.equals("ziutek")) {
                    print.printPrac(mapa.get(ziutek));

                    System.out.println("imie pracownika");
                    prac = scanner.nextLine();
                    for (Employee epm : mapa.get(ziutek)
                    ) {
                        if (!epm.getImie().equals(prac))
                            temp.add(epm);
                    }
                    mapa.put(ziutek,temp);
                }
                else if (men.equals("marian")) {
                    print.printPrac(mapa.get(marian));

                    System.out.println("imie pracownika");
                    prac = scanner.nextLine();
                    for (Employee epm : mapa.get(marian)
                    ) {
                        if (!epm.getImie().equals(prac))
                            temp.add(epm);
                    }
                    mapa.put(marian,temp);
                }

            }

            if (odp.equals("end"))
                return;

            print.print(mapa);

            System.out.println(" + - end");
            odp = scanner.nextLine();
        }

    }
}

