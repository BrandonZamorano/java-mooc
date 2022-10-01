
import java.util.Scanner;

public class LiquidContainers2 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

//        int firstContainer = 0;
//        int secondContainer = 0;
//        int CONTAINER_MAX = 100;
        Container firstContainer = new Container();
        Container secondContainer = new Container();
        
        while (true) {
            System.out.println("");
            //Print the contents of both containers
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                // handle add command
                
                firstContainer.add(amount);
            } else if (command.equals("move")) {
                
                int amountToMove = amount;
                
                if (firstContainer.contains() - amountToMove < 0) {
                    // amount to move is greater than amount in first container
                    amountToMove = firstContainer.contains();
                }
                
                firstContainer.remove(amountToMove);
                secondContainer.add(amountToMove);
                
            } else if (command.equals("remove")) {
                secondContainer.remove(amount);
            }
            
        }
        
    }
    
}
