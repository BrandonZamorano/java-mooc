
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String word = scanner.nextLine();
            
            if (word.length() == 0) {
                break;
            }
            
            String[] pieces = word.split(" ");
            
            for (String piece : pieces) {
                if (piece.contains("av")) {
                    System.out.println(piece);
                }
            }
        }


    }
}
