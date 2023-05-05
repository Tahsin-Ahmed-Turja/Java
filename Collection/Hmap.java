import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hmap {
    public static void main(String[] args) {
        
        // Creating a HashMap with keys of type String and values of type Integer
        HashMap<String, Integer> map = new HashMap<>();
        
        // Adding elements to the HashMap
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);
        
        // Accessing an element of the HashMap by key
        System.out.println("The value of 'banana' in the HashMap is: " + map.get("banana"));
        
        // Checking if the HashMap contains a key
        System.out.println("Does the HashMap contain the key 'cherry'? " + map.containsKey("cherry"));
        
        // Checking if the HashMap contains a value
        System.out.println("Does the HashMap contain the value 2? " + map.containsValue(2));
        
        // Getting the size of the HashMap
        System.out.println("The size of the HashMap is: " + map.size());
        
        // Removing an element from the HashMap by key
        map.remove("banana");
        System.out.println("After removing 'banana' from the HashMap: " + map);
        
        // Removing all elements from the HashMap
        map.clear();
        System.out.println("After clearing the HashMap: " + map);
        
        // Adding elements back to the HashMap
        map.put("grape", 4);
        map.put("kiwi", 5);
        map.put("mango", 6);
        System.out.println("After adding elements back to the HashMap: " + map);
        
        // Iterating over the keys of the HashMap
        Set<String> keys = map.keySet();
        System.out.println("The keys of the HashMap are:");
        for (String key : keys) {
            System.out.println(key);
        }
        
        // Iterating over the values of the HashMap
        System.out.println("The values of the HashMap are:");
        for (int value : map.values()) {
            System.out.println(value);
        }
        
        // Iterating over the entries of the HashMap using a Map.Entry set
        System.out.println("The entries of the HashMap are:");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
