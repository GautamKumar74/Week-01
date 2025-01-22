public class ToggleCase {

    public static String toggleCase(String str) {
        StringBuilder toggledString = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggledString.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggledString.append(Character.toUpperCase(c));
            } else {
                toggledString.append(c); // For non-alphabetic characters, keep as is
            }
        }

        return toggledString.toString();
    }

    public static void main(String[] args) {
        String input = "Hello World!";
        String result = toggleCase(input);
        System.out.println("Original String: " + input);
        System.out.println("Toggled String: " + result);
    }
}
