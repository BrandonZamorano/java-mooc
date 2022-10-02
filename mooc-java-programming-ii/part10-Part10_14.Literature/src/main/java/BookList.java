
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brandonwebdev
 */
public class BookList {
    private List<Book> bookList;
    
    public BookList() {
        this.bookList = new ArrayList<>();
    }
    
    public void add(Book book) {
        if (bookList.contains(book)) {
            return;
        }
        
        bookList.add(book);
    }
    
    public int size() {
        return bookList.size();
    }
    
    public String toString() {
        String output = "Books:";
        output += bookList.stream()
                .map(book -> book.toString())
                .reduce("", (prev, curr) -> prev + "\n" + curr);
        return output;
    }
    
    public void orderBooksByAgeReccomendation() {
        Collections.sort(bookList, Comparator.comparing(Book::getReccomendedAge));
    }
    
    public void orderBooksByAgeAndReccomendation() {
        Collections.sort(bookList, Comparator.comparing(Book::getReccomendedAge)
                .thenComparing(Book::getTitle));
    }

    public List<Book> getBookList() {
        return bookList;
    }
    
    
    
    
}
