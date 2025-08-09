import java.util.LinkedList;
import java.util.Iterator;

public class linkedList {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> fruits = new LinkedList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Adding element at the first position
        fruits.addFirst("Strawberry");

        // Adding element at the last position
        fruits.addLast("Grapes");

        // Display the LinkedList
        System.out.println("Fruits list: " + fruits);

        // Accessing elements
        System.out.println("First fruit: " + fruits.getFirst());
        System.out.println("Last fruit: " + fruits.getLast());

        // Removing elements
        fruits.remove("Banana"); // by value
        fruits.removeFirst();    // first element
        fruits.removeLast();     // last element

        System.out.println("After removals: " + fruits);

        // Iterating using iterator
        System.out.println("Iterating through LinkedList:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
