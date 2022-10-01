
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

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            //handle command
            handleCommand(command);
        }

    }

    private void handleCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("list")) {
            list();
        } else if (command.equals("remove")) {
            remove();
        }
    }

    private void add() {
        System.out.print("To add: ");
        String task = scanner.nextLine();
        list.add(task);
    }

    private void list() {
        list.print();
    }

    private void remove() {
        System.out.print("Which one is removed? ");
        int taskNumber = Integer.valueOf(scanner.nextLine());
        list.remove(taskNumber);
    }

}
