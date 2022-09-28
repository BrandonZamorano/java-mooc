
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author brandonwebdev
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                break;
            }

            handleCommand(command);
        }

        System.out.println("Bye bye!");
    }

    private void handleCommand(String command) {
        if (command.equals("add")) {
            System.out.print("Word: ");
            String word = scanner.nextLine();

            System.out.print("Trnaslation: ");
            String translation = scanner.nextLine();

            dictionary.add(word, translation);
        } else if (command.equals("search")) {
            System.out.print("To be translated: ");
            String word = scanner.nextLine();
            String translation = dictionary.translate(word);
            if (translation == null) {
                System.out.println("Word " + word + " was not found");
                return;
            }

            System.out.println("Translation: " + translation);

        } else {
            System.out.println("Unkown command");
        }
    }

}
