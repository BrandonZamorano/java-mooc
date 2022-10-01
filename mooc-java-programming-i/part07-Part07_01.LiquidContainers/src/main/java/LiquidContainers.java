
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;
        int CONTAINER_MAX = 100;

        while (true) {
            System.out.println("");
//Print the contents of both containers
            System.out.println("First: " + firstContainer + "/" + CONTAINER_MAX);
            System.out.println("Second: " + secondContainer + "/" + CONTAINER_MAX);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                // handle add command

                if (amount < 0) {
                    continue;
                }

                int newAmount = firstContainer + amount;

                if (newAmount > CONTAINER_MAX) {
                    firstContainer = CONTAINER_MAX;
                    continue;
                }

                firstContainer += amount;

            } else if (command.equals("move")) {
                if (amount < 0) {
                    continue;
                }

                int amountToMove = amount;

                if (firstContainer - amountToMove < 0) {
                    // amount to move is greater than amount in first container
                    amountToMove = firstContainer;
                }

                firstContainer -= amountToMove;

                int newAmount = secondContainer + amountToMove;

                // second container can't hold more than the max
                if (newAmount > CONTAINER_MAX) {
                    newAmount = CONTAINER_MAX;
                }

                secondContainer = newAmount;

            } else if (command.equals("remove")) {

                if (amount < 0) {
                    continue;
                }

                int amountToRemove = amount;

                if (secondContainer - amountToRemove < 0) {
                    amountToRemove = secondContainer;
                }

                secondContainer -= amountToRemove;

            }

        }

    }
}
