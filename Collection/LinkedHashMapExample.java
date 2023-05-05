import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Creating a LinkedHashMap with String keys and Integer values
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Adding elements to the LinkedHashMap
        linkedHashMap.put("Apple", 3);
        linkedHashMap.put("Banana", 1);
        linkedHashMap.put("Orange", 4);
        linkedHashMap.put("Grape", 2);

        // Printing the LinkedHashMap
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // Accessing elements from the LinkedHashMap
        System.out.println("Value of key 'Grape': " + linkedHashMap.get("Grape"));
        System.out.println("First key: " + linkedHashMap.keySet().iterator().next());
        System.out.println("Last key: " + getKeyByIndex(linkedHashMap, linkedHashMap.size()-1));

        // Removing elements from the LinkedHashMap
        linkedHashMap.remove("Apple");
        System.out.println("LinkedHashMap after removing key 'Apple': " + linkedHashMap);

        // Iterating over the LinkedHashMap
        System.out.print("Iterating over LinkedHashMap: ");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
        System.out.println();

        // Checking if the LinkedHashMap contains a key or value
        System.out.println("LinkedHashMap contains key 'Orange': " + linkedHashMap.containsKey("Orange"));
        System.out.println("LinkedHashMap contains value 1: " + linkedHashMap.containsValue(1));
    }

    // Helper method to get the key at a given index in a LinkedHashMap
    private static <K, V> K getKeyByIndex(LinkedHashMap<K, V> map, int index) {
        int i = 0;
        for (K key : map.keySet()) {
            if (i == index) {
                return key;
            }
            i++;
        }
        return null;
    }
}
