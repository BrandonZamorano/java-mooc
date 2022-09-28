
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author brandonwebdev
 */
public class WordSet {

    private ArrayList<String> words;

    public WordSet() {
        this.words = new ArrayList<>();
    }

    public boolean contains(String word) {
        // implementation of the contains method
        return words.contains(word);
    }

    public void add(String word) {
        words.add(word);
    }

    public boolean isPalindrome(String word) {
        int end = word.length() - 1;

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(end - i)) {
                return false;
            }
        }

        return true;
    }

    public int palindromes() {
        int count = 0;

        for (String word : words) {
            if (isPalindrome(word)) {
                count++;
            }
        }
        return count;
    }

}
