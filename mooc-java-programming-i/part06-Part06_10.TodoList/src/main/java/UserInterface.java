
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

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

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
        } else {
            System.out.println("Command not found!");
        }
    }

    private void add() {
        System.out.print("To add: ");
        String task = scanner.nextLine();
        todoList.add(task);
    }

    private void list() {
        todoList.print();

    }

    private void remove() {
        System.out.print("Which one is removed? ");
        int taskToRemove = Integer.valueOf(scanner.nextLine());
        
        todoList.remove(taskToRemove);
    }

}
