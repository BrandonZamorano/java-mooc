
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("");
            // Print out status of each container
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            // Handle commands
            if (command.equals("add")) {
                first.add(amount);
            } else if (command.equals("move")) {
                //move the amount of liquid from first to second
                //if amount is more than first, move all of remainng first
                if (amount > first.contains()) {
                    amount = first.contains();
                }

                first.remove(amount);
                second.add(amount);
            } else if (command.equals("remove")) {
                second.remove(amount);
            }
        }
    }

}
