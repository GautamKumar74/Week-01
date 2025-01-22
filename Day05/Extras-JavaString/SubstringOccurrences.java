public class SubstringOccurrences {

    // Method to count occurrences of a substring in a string
    public static int countSubstringOccurrences(String str, String subStr) {
        if (subStr.isEmpty() || str.isEmpty() || subStr.length() > str.length()) {
            return 0;
        }

        int count = 0;
        int n = str.length();
        int m = subStr.length();

        // Iterate through the main string
        for (int i = 0; i <= n - m; i++) {
            // Check if substring matches at position i
            if (str.substring(i, i + m).equals(subStr)) {
                count++;
                i += m - 1; // Move the index to the end of the current match
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String mainString = "hello world, hello universe";
        String subString = "hello";

        int occurrences = countSubstringOccurrences(mainString, subString);
        System.out.println("The substring \"" + subString + "\" occurs " + occurrences + " times in the string.");
    }
}
