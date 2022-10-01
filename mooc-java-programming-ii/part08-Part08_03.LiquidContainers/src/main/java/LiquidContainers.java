
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        int MAX_AMOUNT = 100;

        while (true) {
            System.out.println("");
            // Print out status of each container
            System.out.println("First: " + first + "/" + MAX_AMOUNT);
            System.out.println("Second: " + second + "/" + MAX_AMOUNT);
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            // Ignore negative amounts
            if (amount < 0) {
                continue;
            }

            // Handle commands
            if (command.equals("add")) {
                first += amount;

                if (first > MAX_AMOUNT) {
                    first = MAX_AMOUNT;
                }
            } else if (command.equals("move")) {
                //move the amount of liquid from first to second
                //if amount is more than first, move all of remainng first
                if (amount > first) {
                    amount = first;
                }
                first -= amount;
                second += amount;

                // second can't hold more than max amount
                if (second > MAX_AMOUNT) {
                    second = MAX_AMOUNT;
                }
            } else if (command.equals("remove")) {
                //remove the amount from second
                second -= amount;

                //if amount is more than second, remove remaining liquid
                if (second < 0) {
                    second = 0;
                }
            }
        }
    }

}
