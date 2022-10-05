package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (!(name instanceof String) || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Length of name has to be > 0 and <= 40");
        }
        
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age should be > 0 and <= 120");
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
