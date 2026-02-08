class StringTest {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.length()); // Output: 11
        System.out.println(str.charAt(0)); // Output: H
        System.out.println(str.substring(0, 5)); // Output: Hello
        System.out.println(str.toUpperCase()); // Output: HELLO WORLD
        System.out.println(str.contains("World")); // Output: true

        // Strings are immutable in Java, meaning that once a String object is created, it cannot be changed.
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1 == str2); // Output: true (because of string interning)
        System.out.println(str1.equals(str2)); // Output: true (because the content is the same)    
        // String concatenation
        String str3 = str1 + " " + "World";
        System.out.println(str3); // Output: Hello World
        // StringBuilder is a mutable sequence of characters. It is used to create and manipulate strings that can be modified after they are created.
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" World");
        System.out.println(stringBuilder.toString()); // Output: Hello World    
        // StringBuffer is similar to StringBuilder but is thread-safe, meaning that it can be used in a multi-threaded environment without causing issues with concurrent access.
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World");
        System.out.println(stringBuffer.toString()); // Output: Hello World

        //String values are stored in a special area of memory called the string pool. 
        //using new keyword to create a string will create a new object in the heap memory, while using string literals will refer to the same object in the string pool if it already exists.
         String str4 = new String("Hello");

         System.out.println(str1 == str4); // Output: false (because str4 is a new object in the heap)
         System.out.println(str1.equals(str4)); // Output: true (because the content is the same)

         //different between String, StringBuilder and StringBuffer
         //String is immutable, while StringBuilder and StringBuffer are mutable.
         //StringBuilder is not thread-safe, while StringBuffer is thread-safe.
         //StringBuilder is faster than StringBuffer because it does not have the overhead of synchronization, but StringBuffer is safer to use in a multi-threaded environment.
         //what is string interning?
         //String interning is a method of storing only one copy of each distinct string value
    }
}