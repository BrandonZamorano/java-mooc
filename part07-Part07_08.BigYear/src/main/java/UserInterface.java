
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

    private Scanner scanner;
    private BirdDatabase database;

    public UserInterface(Scanner scanner, BirdDatabase database) {
        this.scanner = scanner;
        this.database = database;
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            handleCommand(command);
        }
    }

    private void handleCommand(String command) {
        if (command.equals("Add")) {
            addBird();
        } else if (command.equals("Observation")) {
            addObservation();
        } else if (command.equals("All")) {
            printAllBirds();
        } else if (command.equals("One")) {
            printBird();
        }
    }

    private void addBird() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = scanner.nextLine();
        
        database.addBird(new BirdEntry(name, latinName));
    }

    private void addObservation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void printAllBirds() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void printBird() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
