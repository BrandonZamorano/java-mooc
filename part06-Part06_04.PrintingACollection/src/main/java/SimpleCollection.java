
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String output = "The collection " + name;
        if (elements.size() == 0) {
            return output + " is empty.";
        }

        output += " has " + elements.size()
                + " element";

        if (elements.size() == 1) {
            output += ":";
        } else {
            output += "s:";
        }

        for (String element : elements) {
            output += "\n" + element;
        }

        return output;
    }

}
