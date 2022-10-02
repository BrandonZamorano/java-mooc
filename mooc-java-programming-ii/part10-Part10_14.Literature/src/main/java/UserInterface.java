
import java.util.ArrayList;
import java.util.List;
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
    private BookList bookList;

    public UserInterface(Scanner scanner, BookList bookList) {
        this.scanner = scanner;
        this.bookList = bookList;
    }

    public void start() {
        while (true) {
            String input;
            System.out.print("Input the name of the book, empty stops: ");
            input = scanner.nextLine();;

            if (input.isEmpty()) {
                break;
            }

            String title = input;

            System.out.print("Input the age reccomendation: ");
            input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            int ageGroup = Integer.valueOf(input);
            bookList.add(new Book(title, ageGroup));
            System.out.println("");
        }
        System.out.println("");
        System.out.println(bookList.size() + " books in total.");
        System.out.println("");
        bookList.orderBooksByAgeAndReccomendation();
        System.out.println(bookList);
    }

}
