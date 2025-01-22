import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Initialize counters
        int vowelCount = 0;
        int consonantCount = 0;

        // Convert the string to lowercase to make comparison case-insensitive
        input = input.toLowerCase();

        // Iterate through the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } 
            // Check if the character is a consonant (a letter that is not a vowel)
            else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
        }

        // Print the counts
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);

        scanner.close();
    }
}
