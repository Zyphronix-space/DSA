import java.util.LinkedList;
import java.util.SequencedCollection;

public class LinkedListSequenced {
    public static void main(String[] args) {
        // LinkedList now implements SequencedCollection in Java 21
        SequencedCollection<String> colors = new LinkedList<>();

        // Add elements
        colors.addFirst("Red");
        colors.addLast("Blue");
        colors.add("Green"); // equivalent to addLast

        System.out.println("Original Order:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Get first and last elements
        System.out.println("\nFirst Element: " + colors.getFirst());
        System.out.println("Last Element: " + colors.getLast());

        // Reversed view
        SequencedCollection<String> reversed = colors.reversed();
        System.out.println("\nReversed Order:");
        for (String color : reversed) {
            System.out.println(color);
        }

        // Remove first and last
        colors.removeFirst();
        colors.removeLast();

        System.out.println("\nAfter removing first and last:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
