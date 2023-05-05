import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        
        // Creating a HashSet of strings
        HashSet<String> set = new HashSet<>();
        
        // Adding elements to the HashSet
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("banana"); // Adding duplicate element
        
        // Printing the HashSet
        System.out.println("The HashSet contains: " + set);
        
        // Checking if the HashSet contains an element
        System.out.println("Does the HashSet contain 'banana'? " + set.contains("banana"));
        
        // Getting the size of the HashSet
        System.out.println("The size of the HashSet is: " + set.size());
        
        // Removing an element from the HashSet
        set.remove("cherry");
        System.out.println("After removing 'cherry' from the HashSet: " + set);
        
        // Removing all elements from the HashSet
        set.clear();
        System.out.println("After clearing the HashSet: " + set);
        
        // Adding elements back to the HashSet
        set.add("grape");
        set.add("kiwi");
        set.add("mango");
        System.out.println("After adding elements back to the HashSet: " + set);
        
        // Iterating over the elements of the HashSet using an iterator
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Element: " + element);
        }
    }
}
