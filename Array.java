public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        
        // Accessing elements
        System.out.println("Element at index 2: " + array[2]);
        
        // Traversing the array
        System.out.println("Array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
