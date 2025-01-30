package datastructures.hashmaphashfunctions.customhashmap;

public class CustomHashMap {
    public static void main(String[] args) {
        // Create a new hash map
        HashMap<String, Integer> map = new HashMap<>();

        // Insert key-value pairs
        map.put("apple", 5);
        map.put("banana", 7);
        map.put("grapes", 3);

        // Retrieve a value
        System.out.println("apple: " + map.get("apple")); // Output: apple: 5
        System.out.println("banana: " + map.get("banana")); // Output: banana: 7

        // Remove a key-value pair
        map.remove("grapes");
        System.out.println("grapes: " + map.get("grapes")); // Output: grapes: null

        // Check if a key exists
        System.out.println("Contains 'apple': " + map.containsKey("apple")); // Output: true
        System.out.println("Contains 'grapes': " + map.containsKey("grapes")); // Output: false

        // Get the size of the map
        System.out.println("Size of map: " + map.size()); // Output: Size of map: 2
    }
}

