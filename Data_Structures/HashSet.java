import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ASUS
 */
public class LinkedHashSet {
    public static void main(String[] args) {
        // Create a Set using HashSet
        Set<String> animals = new HashSet<>();

        // Add elements to the set
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Charlie");
        animals.add("Dog"); // Duplicate - will not be added

        // Display the set
        System.out.println("Set elements:");
        for (String animal : animals) {
            System.out.println(animal);
        }

        // Check if an element exists
        if (animals.contains("Cat")) {
            System.out.println("\nCat is in the set.");
        }

        // Remove an element
        animals.remove("Charlie");

        // Check the size of the set
        System.out.println("\nSize of set after removal: " + animals.size());

        // Clear the set
        animals.clear();
        System.out.println("\nSet after clearing: " + animals);
    }
}

