
public class ArrayList{
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        java.util.ArrayList<String> list = new java.util.ArrayList<>();

        //implementation of list interface of collection framework
        //arraylist is a resizable array, which can grow and shrink in size dynamically as elements are added or removed.
        //mainly used when we want to have fast access to the elements.

        // Add elements to the ArrayList
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("ArrayList");

        // Print the ArrayList
        System.out.println("ArrayList: " + list);

        // Access an element by index
        String element = list.get(1);
        System.out.println("Element at index 1: " + element);

        // Remove an element
        list.remove(2);
        System.out.println("ArrayList after removal: " + list);

        // Check if the ArrayList contains a specific element
        boolean containsHello = list.contains("Hello");
        System.out.println("Contains 'Hello': " + containsHello);

        // Get the size of the ArrayList
        int size = list.size();
        System.out.println("Size of ArrayList: " + size);
    }
}