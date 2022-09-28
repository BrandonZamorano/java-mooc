
import java.util.Scanner;


public class Sandbox {

    public static void main(String[] args) {
        WordSet wordSet = new WordSet();
        Scanner scanner = new Scanner(System.in);
        UserInterface userInterface = new UserInterface(wordSet, scanner);
        userInterface.start();
        
    }
}
