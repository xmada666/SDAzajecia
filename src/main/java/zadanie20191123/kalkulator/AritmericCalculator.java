package zadanie20191123.kalkulator;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class AritmericCalculator implements AritmCalc {
    private final char[] operators = {'+', '-', '*', '/'};
    private String[] data;
    private int counter;
    public AritmericCalculator() {

    }

    @Override
    public String[] mapStringToArray(String calculation) {
        List<String> elements = new LinkedList<>();
        while (!calculation.isEmpty()) {
            int index = findindexOf(calculation);
            if (index == -1) {
                elements.add(calculation);

            }
            String element = calculation.substring(0, index);
            elements.add(element);
            element = calculation.substring(index, index + 1);
            elements.add(element);
            calculation = calculation.substring(index + 1);
        }
        return elements.toArray(new String[0]);
    }

    private int findindexOf(String calculation) {
        for (int i = 0; i < calculation.length(); i++) {
            char symbol = calculation.charAt(i);
            for (char operator : operators) {
                if (operator == symbol)
                    return i;
            }
        }
        return -1;
    }
    @Override
    public void addElementsFromArray(String[] elementsToAdd) {
        for (int i = elementsToAdd.length - 1; i >= 0; i--) {
            push(elementsToAdd[i]);
        }
/*        List<String> listFromArray = Arrays.asList(elementsToAdd);
            Collections.reverse(listFromArray);
            listFromArray.stream()
                    .forEach(this::push);*/
    }
    @Override
    public int calculate() {
        Predicate<String> isSlashStarOrNull = s -> s != null && (s.equals("/") || s.equals("*"));
        int result = 0;
        String left = pop();
        while (!isEmpty()) {
            String op = pop();
            String right = pop();
            while (isSlashStarOrNull.test(peek())) {
                String opInner = pop();
                String rightInner = pop();
                right = Integer.toString(resultOperation(right, opInner, rightInner));
            }

            result += resultOperation(left, op, right);
            left=Integer.toString(result);
        }
        return result;
    }

    private String peek() {
        if (counter == 0) return null;
        String result = data[counter - 1];
        return result;
    }

    private String pop() {
        if (counter == 0) return null;
        String result = data[counter - 1];
        counter--;
        return result;
    }

    private void push(String element) {
        data[counter] = element;
        counter++;
    }

    private boolean isEmpty() {
        return counter == 0;
    }

    private int resultOperation(String left, String op, String right) {
        if (op != null)
            switch (op) {
                case "+":
                    return Integer.parseInt(left) + Integer.parseInt(right);
                case "-":
                    return Integer.parseInt(left) - Integer.parseInt(right);
                case "*":
                    return Integer.parseInt(left) * Integer.parseInt(right);
                case "/":
                    return Integer.parseInt(left) / Integer.parseInt(right);
            }
        return 0;
    }
}
