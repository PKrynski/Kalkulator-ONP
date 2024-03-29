package onpcalc;

import stack.Stack;

/**
 *
 * @author Paweł
 */
public class ONPcalc {

    public static void count(String[] input) throws Stack.EmptyStackException {

        Stack stos = new Stack();

        for (String expr : input) {
            //System.out.println("Argument: " + expr);

            Double number = null;

            try {
                number = Double.parseDouble(expr);
            } catch (Exception e) {
                if (!expr.equals("+") && !expr.equals("-") && !expr.equals("x") && !expr.equals(":")) {
                    System.out.println("Wyrażenie nie może być przetworzone: " + expr);
                    return;
                }
            }

            if (number != null) {
                stos.put(number);
            } else if (expr.equals("+")) {
                double second = stos.get();
                double first = stos.get();
                stos.put(first + second);

            } else if (expr.equals("-")) {
                double second = stos.get();
                double first = stos.get();
                stos.put(first - second);

            } else if (expr.equals("x")) {
                double second = stos.get();
                double first = stos.get();
                stos.put(first * second);

            } else if (expr.equals(":")) {
                double second = stos.get();
                double first = stos.get();
                stos.put(first / second);
            }
        }

        double result = stos.get();

        if (stos.isEmpty()) {
            System.out.println("Wynik: " + result);
        } else {
            System.out.println("Nieprawidłowe wyrażenie: za dużo liczb / za mało operatorów");
        }

    }

    public static void main(String[] args) {

        try {
            count(args);
        } catch (Stack.EmptyStackException ex) {
            System.out.println("Zła składnia: za mało liczb / za dużo operacji");
        }

    }

}
