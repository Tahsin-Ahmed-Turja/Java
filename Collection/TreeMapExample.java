import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap with Integer keys and String values
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding elements to the TreeMap
        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(4, "Orange");
        treeMap.put(2, "Grape");

        // Printing the TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Accessing elements from the TreeMap
        System.out.println("Value of key 2: " + treeMap.get(2));
        System.out.println("First key: " + treeMap.firstKey());
        System.out.println("Last key: " + treeMap.lastKey());

        // Removing elements from the TreeMap
        treeMap.remove(3);
        System.out.println("TreeMap after removing key 3: " + treeMap);

        // Iterating over the TreeMap
        System.out.print("Iterating over TreeMap: ");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
        System.out.println();

        // Checking if the TreeMap contains a key or value
        System.out.println("TreeMap contains key 4: " + treeMap.containsKey(4));
        System.out.println("TreeMap contains value 'Grape': " + treeMap.containsValue("Grape"));
    }
}
