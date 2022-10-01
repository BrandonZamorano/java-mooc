
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPositive = 0;
        int sumPositive = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number > 0) {
                numPositive++;
                sumPositive += number;
            }
        }

        if (numPositive == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(1.0 * sumPositive / numPositive);
        }
    }
}
