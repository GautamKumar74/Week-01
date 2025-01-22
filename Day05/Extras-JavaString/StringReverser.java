import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Initialize pointers for the start and end of the array
        int left = 0;
        int right = charArray.length - 1;

        // Swap characters until the pointers meet in the middle
        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move the pointers
            left++;
            right--;
        }

        // Convert the character array back to a string
        String reversedString = new String(charArray);

        // Print the reversed string
        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }
}
