import java.util.Scanner;

public class TotalIncomeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary (INR): ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your bonus (INR): ");
        double bonus = scanner.nextDouble();

        // Calculate the total income by adding salary and bonus
        double totalIncome = salary + bonus;

        // Display the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence, Total Income is INR " + totalIncome);
    }
}
