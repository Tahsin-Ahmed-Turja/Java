import java.util.TreeSet;

public class Treesetexam {
    public static void main(String[] args) {
        // Create a new empty TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(7);
        treeSet.add(1);
        treeSet.add(9);
        System.out.println("TreeSet after adding elements: " + treeSet);

        // Remove an element from the TreeSet
        treeSet.remove(2);
        System.out.println("TreeSet after removing an element: " + treeSet);

        // Check if an element exists in the TreeSet
        boolean exists = treeSet.contains(7);
        System.out.println("Does the TreeSet contain 7? " + exists);

        // Get the first and last elements of the TreeSet
        int first = treeSet.first();
        int last = treeSet.last();
        System.out.println("First element of the TreeSet: " + first);
        System.out.println("Last element of the TreeSet: " + last);

        // Get the number of elements in the TreeSet
        int size = treeSet.size();
        System.out.println("Number of elements in the TreeSet: " + size);

        // Clear the TreeSet
        treeSet.clear();
        System.out.println("TreeSet after clearing all elements: " + treeSet);
    }
}
