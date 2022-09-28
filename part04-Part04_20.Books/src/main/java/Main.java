
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.length() == 0) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int yearPublished = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, yearPublished));
        }
        System.out.println();

        System.out.print("WHat information will be printed? ");
        String searchValue = scanner.nextLine();

        for (Book book : books) {

            if (searchValue.equals("everything")) {
                System.out.println(book);
            } else if (searchValue.equals("name")) {
                System.out.println(book.getTitle());
            }
        }

    }
}
