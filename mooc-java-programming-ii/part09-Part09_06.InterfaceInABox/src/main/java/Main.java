
public class Main {

    public static void main(String[] args) {
        Box box = new Box(10);

//        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        Box newBox = new Box(10);
        newBox.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        newBox.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        newBox.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));
        
        newBox.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        newBox.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        newBox.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        newBox.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        newBox.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        
        box.add(newBox);

        System.out.println(box);
        System.out.println(newBox);

    }

}
