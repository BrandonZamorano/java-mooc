
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author brandonwebdev
 */
public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> translationDictionary;

    public DictionaryOfManyTranslations() {
        this.translationDictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        // Initialize list if doesn't exist
        translationDictionary.putIfAbsent(word, new ArrayList<>());

        //get the current list
        ArrayList<String> translations = translationDictionary.get(word);

        // Add new translation to the list
        if (translations.contains(translation)) {
            return;
        }

        translations.add(translation);
    }
    
    public ArrayList<String> translate(String word) {
        // return list of translations for the word or empty list
        return translationDictionary.getOrDefault(word, new ArrayList<>());
    }
    
    public void remove(String word) {
        translationDictionary.remove(word);
    }

}
