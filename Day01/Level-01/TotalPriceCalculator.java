import java.util.Scanner;

public class TotalPriceCalculator{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Prompt the user to enter the unit price
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice= sc.nextDouble();

        // Prompt the user to enter the quantity
        System.out.print("Enter the quantity to be bought: ");
        int quantity= sc.nextInt();

        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // Display the result
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice + ".");
    }
}
