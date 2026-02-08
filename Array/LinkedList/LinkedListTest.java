import java.util.LinkedList;
class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        //linkedList is a data structure that allows for efficient insertion and deletion of elements.
        // It is implemented as a doubly linked list, 
        // where each element (node) contains a reference to the previous and next node in the list. 
        // This allows for easy traversal in both directions.
        //LinkedList is dynamic in size, meaning that it can grow and shrink as needed.

        // Adding elements to the LinkedList
        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.add("Java");
        linkedList.add("LinkedList");

        // Displaying the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Accessing elements
        System.out.println("First Element: " + linkedList.get(0));
        System.out.println("Last Element: " + linkedList.get(linkedList.size() - 1));

        // Removing an element
        linkedList.remove(1); // Removes "World"
        System.out.println("After removing 'World': " + linkedList);

        // Iterating through the LinkedList
        System.out.println("Iterating through LinkedList:");
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}