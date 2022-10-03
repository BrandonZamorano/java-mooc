/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brandonwebdev
 */
public class Person {
    private String name;
    private Education education;

    public Person(String name, Education education) {
        this.name = name;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public Education getEducation() {
        return education;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name);
        sb.append(", ");
        sb.append(education);
        return sb.toString();
    }
}
