
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Give a word: ");
        String word = scanner.nextLine();
        
        repeatString(word, 3);
    }
    
    public static void repeatString(String str, int timesToRepeat) {
        for (int i = 0; i < timesToRepeat; i++) {
            System.out.print(str);
        }
        System.out.println("");
    }
}
