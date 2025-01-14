import java.util.Scanner;

class TravelComputation {
    public static void main(String[] args) {
        // Create a scanner object for taking inputs
        Scanner scanner = new Scanner(System.in);

        // Take the name of the traveler
        System.out.print("Enter the name of the traveler: ");
        String name = scanner.nextLine();

        // Take the names of the cities
        System.out.print("Enter the city you're starting from: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the city you're traveling via: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter the final city you're traveling to: ");
        String toCity = scanner.nextLine();

        // Take the distances in miles
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double distanceFromToVia = scanner.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double distanceViaToFinalCity = scanner.nextDouble();

        // Take the time taken for each leg of the journey in hours and minutes
        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " in hours and minutes (e.g., 4 4 for 4 hours 4 minutes): ");
        int hoursFromToVia = scanner.nextInt();
        int minutesFromToVia = scanner.nextInt();
        int timeFromToVia = hoursFromToVia * 60 + minutesFromToVia;

        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " in hours and minutes (e.g., 4 25 for 4 hours 25 minutes): ");
        int hoursViaToFinalCity = scanner.nextInt();
        int minutesViaToFinalCity = scanner.nextInt();
        int timeViaToFinalCity = hoursViaToFinalCity * 60 + minutesViaToFinalCity;

        // Calculate the total distance in miles
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;

        // Calculate the total time in minutes
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Print the travel details
        System.out.println("The Total Distance travelled by " + name + " from " +
                           fromCity + " to " + toCity + " via " + viaCity +
                           " is " + totalDistance + " miles and " +
                           "the Total Time taken is " + totalTime + " minutes");
    }
}