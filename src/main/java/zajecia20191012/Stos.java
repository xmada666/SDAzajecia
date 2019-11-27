package zajecia20191012;

import java.util.List;
import java.util.Stack;

public class Stos {
    public static void main(String[] args) {
      int[] tablica = new int[] {1,3,5,7,1,3,4,7,8,11};
      Stack stos = new Stack();
      for(int i = 0; i<10; i++)
          stos.push(tablica[i]);
          while ((!stos.empty())){
              System.out.println(stos.pop());
          }

    }
}
