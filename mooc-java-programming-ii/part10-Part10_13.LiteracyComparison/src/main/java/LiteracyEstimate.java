/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brandonwebdev
 */
public class LiteracyEstimate implements Comparable<LiteracyEstimate>{
    private String theme;
    private String ageGroup;
    private String gender;
    private String country;
    private int year;
    private double literacyPercent;

    public LiteracyEstimate(String theme, String ageGroup, String gender, String country, int year, double literacyPercent) {
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }

    @Override
    public int compareTo(LiteracyEstimate otherEstimate) {
        if (this.literacyPercent > otherEstimate.literacyPercent) {
            return 1;
        }
        
        if (this.literacyPercent < otherEstimate.literacyPercent) {
            return -1;
        }
        
        return 0;
    }
    
    @Override
    public String toString() {
        return country + " (" + year + "), " + gender + ", " + literacyPercent;
    }
    
    
    
}
