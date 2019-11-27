package zadanie20191123;

public class Main {
    public static void main(String[] args) {

        Stack stack = new StackImpl(10);
        stack.push(1);
        testPop(stack);
        testPeek(stack);

      //  System.out.println(stack.toString());

        }
        private static void testPop(Stack stack){
            System.out.println("Test Pop");
        stack.push(7);
            int actualSize = stack.size();

        int actual = stack.pop();
            System.out.println(actualSize==stack.size()+1);
            System.out.println(actual==7);
        }
    private static void testPeek(Stack stack){
        System.out.println("Test Peek");
        stack.push(8);
        int actual = stack.peek();
        int actualSize = stack.size();
        System.out.println(actualSize==stack.size());
        System.out.println(actual==8);
    }
    }

