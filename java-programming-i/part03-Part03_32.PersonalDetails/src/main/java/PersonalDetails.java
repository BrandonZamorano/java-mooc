
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int count = 0;
        int sum = 0;
        while (true) {
            String input = scanner.nextLine();
            
            if (input.length() == 0) {
                break;
            }
            
            String[] pieces = input.split(",");
            String name = pieces[0];
            int year = Integer.valueOf(pieces[1]);
            
            if (name.length() > longestName.length()) {
                longestName = name;
            }
            
            count++;
            sum += year;
            
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));

    }
}
