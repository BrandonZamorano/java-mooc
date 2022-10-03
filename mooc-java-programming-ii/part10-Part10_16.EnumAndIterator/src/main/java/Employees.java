
import java.util.ArrayList;
import java.util.Iterator;
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
public class Employees {

    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.forEach(p -> employees.add(p));
    }

    public void print() {
//        employees.forEach(e -> System.out.println(e));
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Person currentPerson = iterator.next();

            if (currentPerson.getEducation().equals(education)) {
                System.out.println(currentPerson);
            }
        }

    }

    public void fire(Education education) {

        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Person currentPerson = iterator.next();

            if (currentPerson.getEducation().equals(education)) {
                iterator.remove();
            }
        }

    }

}
