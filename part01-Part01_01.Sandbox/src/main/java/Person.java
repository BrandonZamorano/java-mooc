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
    private int age;

    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public void growOlder() {
        if (this.age < 30) {
            this.age = this.age + 1;
        }
    }
    // the added method
    public int returnAge() {
        return this.age;
    }
    
    public boolean isOfLegalAge() {
        if (this.age < 18) {
            return false;
        }
        
        return true;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", age" + this.age + " year";
    }
}
