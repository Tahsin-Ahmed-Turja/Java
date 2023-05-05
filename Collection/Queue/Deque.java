import java.util.Deque;
import java.util.LinkedList;

public class Deque {
    public static void main(String[] args) {
        // Create a new empty Deque
        Deque<Integer> deque = new LinkedList<>();

        // Add elements to the beginning of the Deque
        deque.addFirst(5);
        deque.addFirst(2);
        deque.addFirst(7);
        System.out.println("Deque after adding elements to the beginning: " + deque);

        // Add elements to the end of the Deque
        deque.addLast(1);
        deque.addLast(9);
        System.out.println("Deque after adding elements to the end: " + deque);

        // Remove the first and last elements of the Deque
        int first = deque.removeFirst();
        int last = deque.removeLast();
        System.out.println("Deque after removing the first and last elements: " + deque);
        System.out.println("First element removed: " + first);
        System.out.println("Last element removed: " + last);

        // Check if an element exists in the Deque
        boolean exists = deque.contains(7);
        System.out.println("Does the Deque contain 7? " + exists);

        // Get the first and last elements of the Deque without removing them
        int firstElement = deque.getFirst();
        int lastElement = deque.getLast();
        System.out.println("First element of the Deque: " + firstElement);
        System.out.println("Last element of the Deque: " + lastElement);

        // Get the size of the Deque
        int size = deque.size();
        System.out.println("Number of elements in the Deque: " + size);

        // Clear the Deque
        deque.clear();
        System.out.println("Deque after clearing all elements: " + deque);
    }
}
