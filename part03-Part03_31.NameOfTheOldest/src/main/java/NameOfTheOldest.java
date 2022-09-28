
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldestName = "";
        int oldestAge = -1;
        while (true) {
            String input = scanner.nextLine();
            
            if (input.length() == 0) {
                break;
            }
            
            String[] pieces = input.split(",");
            String name = pieces[0];
            int age = Integer.valueOf(pieces[1]);
            
            if (age > oldestAge) {
                oldestAge = age;
                oldestName = name;
            }
            
        }
        
        System.out.println("Name of the oldest: " + oldestName);


    }
}
