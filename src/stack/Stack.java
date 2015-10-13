/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Paweł
 */
public class Stack {

    private Pair head;

    public void put(double wartosc) {

        Pair newitem = new Pair(wartosc);
        newitem.next = head;
        head = newitem;
    }

    public double get() throws EmptyStackException {

        if (this.isEmpty()) {
            throw new EmptyStackException();
        }

        double itemvalue = head.value;
        head = head.next;

        return itemvalue;
    }

    public boolean isEmpty() {

        return head == null;
    }

    public class EmptyStackException extends Exception {

        @Override
        public String toString() {
            return "Napotkano koniec stosu.";
        }
    }

    private class Pair {

        private double value;
        private Pair next;

        public Pair(double value) {
            this.value = value;
            this.next = null;
        }
    }
    
    /*
     public static void main(String[] args) {

     Stack stos = new Stack();

     // początek testu stosu
     for (int i = 0; i < 20; i++) {  // odłożenie 20 elementów na stos
     stos.put(i);
     System.out.println("Dodano: " + (double) i);
     }

     try {
     while (true) {      // zdjęcie wszystkich elementów ze stosu
     double wartosc = stos.get();
     System.out.println("Zdjeto: " + wartosc);
     }
     } catch (EmptyStackException e) {
     System.out.println(e.toString());
     }
     // koniec testu stosu
     }
     */
}
