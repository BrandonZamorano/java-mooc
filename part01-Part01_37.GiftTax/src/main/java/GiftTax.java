
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scanner.nextLine());
        
        if (giftValue  < 5000) {
            System.out.println("No tax!");
        } else if (giftValue < 25000) {
            double taxRate = 0.08;
            int minTax =  100;
            int minValue = 5000;
            System.out.println("Tax: " + (minTax + (giftValue - minValue) * taxRate));
        } else if (giftValue < 55000) {

            double taxRate = 0.10;
            int minTax =  1700;
            int minValue = 25000;
            System.out.println("Tax: " + (minTax + (giftValue - minValue) * taxRate));
        } else if (giftValue < 200000) {
            
            double taxRate = 0.12;
            int minTax =  4700;
            int minValue = 55000;
            System.out.println("Tax: " + (minTax + (giftValue - minValue) * taxRate));
        } else if (giftValue < 1000000) {
            
            double taxRate = 0.15;
            int minTax =  22100;
            int minValue = 200000;
            System.out.println("Tax: " + (minTax + (giftValue - minValue) * taxRate));
        } else {
            
            double taxRate = 0.17;
            int minTax =  142100;
            int minValue = 1000000;
            System.out.println("Tax: " + (minTax + (giftValue - minValue) * taxRate));
        }

    }
}
