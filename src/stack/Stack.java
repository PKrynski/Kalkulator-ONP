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

    public double get() {

        if (this.isEmpty()) {

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

    public static void main(String[] args) {

        Stack stos = new Stack();

        for (int i = 1; i < 10; i++) {
            stos.put(i);
            System.out.println("Dodano: " + (double) i);
        }

        double wartosc;
        for (int i = 1; i < 10; i++) {
            wartosc = stos.get();
            System.out.println("Zdjeto: " + wartosc);
        }

    }

    private class Pair {

        double value;
        Pair next;

        public Pair(double value) {
            this.value = value;
            this.next = null;
        }
    }
}
