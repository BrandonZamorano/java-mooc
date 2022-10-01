
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
public class UserInterface {

    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            printCommands();
            String command = scanner.nextLine();
            
            if (command.equals("X")) {
                break;
            }
            
            handleCommand(Integer.valueOf(command));
        }
    }
    
    private void handleCommand(int command) {
        if (command == 1) {
            addJoke();
        } else if (command == 2) {
            drawJoke();
        } else if (command == 3) {
            listJokes();
        }
    }
    
    private void addJoke() {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        jokeManager.addJoke(joke);
    }
    
    private void drawJoke() {
        System.out.println(jokeManager.drawJoke());
    }
    
    private void listJokes() {
        System.out.println("Printing the jokes.");
        jokeManager.printJokes();
    }

    private void printCommands() {

        String[] commands = {"add a joke", "draw a joke", "list jokes"};
        
        System.out.println("Commands:");
        for(int i = 0; i < commands.length; i++) {
            System.out.println((i + 1) + commands[i]);
        }
        System.out.println("X - stop");
    }
}
