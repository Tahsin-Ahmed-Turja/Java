import java.util.LinkedList;

public class Linklistexample {
    public static void main(String[] args) {
        // Create a new empty LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(7);
        linkedList.add(1);
        linkedList.add(9);
        System.out.println("LinkedList after adding elements: " + linkedList);

        // Remove an element from the LinkedList
        linkedList.remove(2);
        System.out.println("LinkedList after removing an element: " + linkedList);

        // Check if an element exists in the LinkedList
        boolean exists = linkedList.contains(7);
        System.out.println("Does the LinkedList contain 7? " + exists);

        // Get the first and last elements of the LinkedList
        int first = linkedList.getFirst();
        int last = linkedList.getLast();
        System.out.println("First element of the LinkedList: " + first);
        System.out.println("Last element of the LinkedList: " + last);

        // Get the element at a specific index
        int element = linkedList.get(2);
        System.out.println("Element at index 2: " + element);

        // Get the index of an element
        int index = linkedList.indexOf(7);
        System.out.println("Index of element 7: " + index);

        // Get the size of the LinkedList
        int size = linkedList.size();
        System.out.println("Number of elements in the LinkedList: " + size);

        // Clear the LinkedList
        linkedList.clear();
        System.out.println("LinkedList after clearing all elements: " + linkedList);
    }
}
