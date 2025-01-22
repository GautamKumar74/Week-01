public class LongestWordFinder {

    // Method to find the longest word in a sentence
    public static String findLongestWord(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }

        String[] words = sentence.split("\\s+"); // Split sentence into words
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    // Main method to test the findLongestWord method
    public static void main(String[] args) {
        String sentence1 = "The quick brown fox jumps over the lazy dog";
        String sentence2 = "Java programming is fun";
        String sentence3 = "A journey of a thousand miles begins with a single step";

        System.out.println("Longest word in sentence 1: " + findLongestWord(sentence1));
        System.out.println("Longest word in sentence 2: " + findLongestWord(sentence2));
        System.out.println("Longest word in sentence 3: " + findLongestWord(sentence3));
    }
}
