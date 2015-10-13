/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onpcalc;

import stack.Stack;

/**
 *
 * @author Paweł
 */
public class ONPcalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Stack stos = new Stack();

        for (String expr : args) {
            System.out.println("Argument: " + expr);

            Double number = null;

            try {
                number = Double.parseDouble(expr);
            } catch (Exception e) {
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
    }

}
