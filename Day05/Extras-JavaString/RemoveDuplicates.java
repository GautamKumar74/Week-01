import java.util.LinkedHashSet;

public class RemoveDuplicates {

    // Method to remove duplicate characters from a string
    public static String removeDuplicates(String str) {
        // Use LinkedHashSet to maintain insertion order and remove duplicates
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        
        // Build the resulting string without duplicates
        StringBuilder result = new StringBuilder();
        for (char c : set) {
            result.append(c);
        }
        
        return result.toString();
    }

    // Main method to test the removeDuplicates method
    public static void main(String[] args) {
        String testStr1 = "programming";
        String testStr2 = "hello world";
        String testStr3 = "Java";

        System.out.println("Original: " + testStr1 + " -> Modified: " + removeDuplicates(testStr1));
        System.out.println("Original: " + testStr2 + " -> Modified: " + removeDuplicates(testStr2));
        System.out.println("Original: " + testStr3 + " -> Modified: " + removeDuplicates(testStr3));
    }
}
