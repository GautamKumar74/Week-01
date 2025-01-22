public class PalindromeCheck {

    // Method to check if a given string is a palindrome
    public static boolean isPalindrome(String str) {
        // Removing all non-alphanumeric characters and converting to lowercase
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanedStr.length() - 1;

        // Check characters from both ends moving towards the center
        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Main method to test the isPalindrome method
    public static void main(String[] args) {
        String testStr1 = "A man, a plan, a canal, Panama";
        String testStr2 = "hello";
        String testStr3 = "No 'x' in Nixon";

        System.out.println("\"" + testStr1 + "\" is a palindrome: " + isPalindrome(testStr1));
        System.out.println("\"" + testStr2 + "\" is a palindrome: " + isPalindrome(testStr2));
        System.out.println("\"" + testStr3 + "\" is a palindrome: " + isPalindrome(testStr3));
    }
}
