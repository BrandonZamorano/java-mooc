/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brandonwebdev
 */
public class Person implements Saveable {
    private String name;
    private String address;

    @Override
    public void save() {
        System.out.println(name + " was saved!");
    }

    @Override
    public void delete() {
        System.out.println(name + " was deleted!");
    }

    @Override
    public void load(String address) {
        System.out.println(name + " was loaded!");
    }
}
