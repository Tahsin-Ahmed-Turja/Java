import java.util.LinkedList;
import java.util.Queue;

public class Josephus {
    public static void main(String[] args) {
        int n = 7; // number of people
        int k = 3; // count to k
        int startingIndex = 0; // index of person to start counting from
        Queue<Integer> queue = new LinkedList<>();

        // Add people to the queue
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        // Remove people from the queue until there is only one person left
        while (queue.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                queue.add(queue.remove());
            }
            System.out.println("Person " + queue.remove() + " is eliminated.");
        }

        // Print the index of the last person remaining
        System.out.println("The last person remaining is " + queue.remove() + ".");
    }
}
