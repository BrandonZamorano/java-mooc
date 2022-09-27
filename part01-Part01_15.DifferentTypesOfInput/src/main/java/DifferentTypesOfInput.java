
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String str = scanner.nextLine();
        
        System.out.println("Give an integer:");
        int numInt = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give a double:");
        double numDouble = Double.valueOf(scanner.nextLine());
        
        System.out.println("Give a boolean:");
        boolean bool = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string " + str);
        System.out.println("You gave the integer " + numInt);
        System.out.println("You gave the double " + numDouble);
        System.out.println("You gave the boolean " + bool);
        

    }
}
