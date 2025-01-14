import java.util.Scanner;

public class IntOperation{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Prompt the user to enter values for a, b, and c
        System.out.print("Enter value for a: ");
        int a = sc.nextInt();

        System.out.print("Enter value for b: ");
        int b = sc.nextInt();

        System.out.print("Enter value for c: ");
        int c = sc.nextInt();

        // Perform the integer operations
        int result1 = a + b * c;    // Operation 1: a + (b * c)
        int result2 = a * b + c;    // Operation 2: (a * b) + c
        int result3 = c + a / b;    // Operation 3: c + (a / b)
        int result4 = a % b + c;    // Operation 4: (a % b) + c

        // Display the results
        System.out.println("The results of Int Operations are: ");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
    }
}
