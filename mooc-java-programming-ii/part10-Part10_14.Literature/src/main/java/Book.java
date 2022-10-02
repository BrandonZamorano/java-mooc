/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brandonwebdev
 */
public class Book {
    private String title;
    private int reccomendedAge;
    
    public Book(String title, int reccomendedAge) {
        this.title = title;
        this.reccomendedAge = reccomendedAge;
    }

    public String getTitle() {
        return title;
    }

    public int getReccomendedAge() {
        return reccomendedAge;
    }
    
    public String toString() {
        return title + " (reccomended for " + reccomendedAge + " year-olds or older)";
    }
    
    
}
