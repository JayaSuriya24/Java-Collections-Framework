class Array {
    public static void main(String[] args) {
        //Array is a data structure that can hold a fixed number of values of the same data type.
        //Arrays ae static in size, meaning that once an array is created, its size cannot be changed.
        //Arrays are indexed, meaning that each element in the array can be accessed using its index.
        //To print an array, we can use a loop to iterate through the elements of the array and print them.
        int[] arr = new int[5]; // Declaration and instantiation of an array
        arr[0] = 10; // Assigning values to the array
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // Accessing and printing the elements of the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
}