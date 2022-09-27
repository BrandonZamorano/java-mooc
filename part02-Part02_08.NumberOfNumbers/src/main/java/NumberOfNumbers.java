
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNums = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            // Check for exit value
            if (number == 0) {
                break;
            }
            totalNums++;
        }
        System.out.println("Number of numbers: " + totalNums);

    }
}
