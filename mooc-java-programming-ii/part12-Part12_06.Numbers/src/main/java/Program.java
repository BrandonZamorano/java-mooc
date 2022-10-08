
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers should be printed?");
        int input = Integer.valueOf(scanner.nextLine());
        Random ladyLuck = new Random();
        
        for (int i = 0; i < input; i++) {
            int randomValue = ladyLuck.nextInt(11);
            System.out.println(randomValue);
        }
    }

}
