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

}
