import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        
        // Creating an ArrayList of strings
        ArrayList<String> list = new ArrayList<>();
        
        // Adding elements to the ArrayList
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        
        // Accessing elements by index
        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("Element at index 2: " + list.get(2));
        
        // Changing an element by index
        list.set(1, "orange");
        System.out.println("Updated element at index 1: " + list.get(1));
        
        // Removing an element by index
        list.remove(2);
        System.out.println("After removing element at index 2: " + list);
        
        // Checking if the ArrayList contains an element
        System.out.println("Does the ArrayList contain 'banana'? " + list.contains("banana"));
        
        // Getting the size of the ArrayList
        System.out.println("The size of the ArrayList is: " + list.size());
        
        // Removing all elements from the ArrayList
        list.clear();
        System.out.println("After clearing the ArrayList: " + list);
        
        // Checking if the ArrayList is empty
        System.out.println("Is the ArrayList empty? " + list.isEmpty());
        
        // Adding elements back to the ArrayList
        list.add("grape");
        list.add("kiwi");
        list.add("mango");
        System.out.println("After adding elements back to the ArrayList: " + list);
    }
}
