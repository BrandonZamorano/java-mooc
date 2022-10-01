
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
public class Abbreviations {

    private HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        if (hasAbbreviation(abbreviation)) {
            System.out.println("Already contains abbreviation: " + abbreviation);
            return;
        }

        abbreviations.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {

        abbreviation = sanitizeAbbreviation(abbreviation);
        return abbreviations.containsKey(abbreviation);
    }

    private String sanitizeAbbreviation(String abbreviation) {
        return abbreviation.toLowerCase().trim();
    }

    public String findExplanationFor(String abbreviation) {
        abbreviation = sanitizeAbbreviation(abbreviation);
        return abbreviations.get(abbreviation);
    }

}
