package str118;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class print {
    public static void print (HashMap<Menager, ArrayList<Employee>> dupa){
        for (Map.Entry<Menager,ArrayList<Employee>> entry: dupa.entrySet()
             ) {
            System.out.print(entry.getKey().getImie() + ":  ");
            for (Employee employee: entry.getValue()
                 ) {
                System.out.print(employee.getImie() + ", ");
            }
            System.out.println();
        }

    }
    public static void printPrac(ArrayList<Employee> listPrac){
        for (Employee emp:listPrac
             ) {
            System.out.println(emp.getImie());
       
        }
    }

}
