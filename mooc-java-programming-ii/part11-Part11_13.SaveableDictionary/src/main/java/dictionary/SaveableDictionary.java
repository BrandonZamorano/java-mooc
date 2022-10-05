/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author brandonwebdev
 */
public class SaveableDictionary {

    private Map<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this(null);
    }

    public SaveableDictionary(String file) {
        this.file = file;
        this.dictionary = new HashMap<>();
    }

    public boolean load() {
        try {
            Files.lines(Paths.get(file))
                    .map(line -> line.split(":"))
                    .forEach(parts -> this.add(parts[0], parts[1]));

            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return false;
    }

    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, translation);
    }

    public void delete(String word) {

        if (this.dictionary.remove(word) == null) {
            Iterator<Map.Entry<String, String>> iterator = dictionary.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();

                if (entry.getValue().equals(word)) {
                    iterator.remove();
                }
            }
        }

    }

    public String translate(String word) {
        String translation = dictionary.getOrDefault(word, "");
        if (!translation.isEmpty()) {
            return translation;
        }

        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            if (entry.getValue().equals(word)) {
                return entry.getKey();
            }
        }

        return null;
    }

    public boolean save() {
        try {
            PrintWriter printer = new PrintWriter(file);
            dictionary.keySet().forEach(k -> {
                System.out.println(k + ":" + dictionary.get(k));
                printer.println(k + ":" + dictionary.get(k));
            });
            
            printer.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } 

        return false;
    }

}
