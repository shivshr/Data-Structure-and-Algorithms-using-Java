import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // Inserting key-value pairs
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Accessing a value by key
        System.out.println("Bob's age: " + map.get("Bob"));

        // Iterating over keys
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
