
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private final int TOTAL_NUMS_TO_DRAW = 7;
    private final int MIN_NUMBER = 1;
    private final int MAX_NUMBER = 40;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        numbers.clear();
        for (int i = 0; i < TOTAL_NUMS_TO_DRAW; i++) {
            numbers.add(getRandomNumber());
        }

    }
    
    private int getRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(MAX_NUMBER) + MIN_NUMBER;
        
        while (containsNumber(randomNumber)) {
            randomNumber = getRandomNumber();
        }
        return randomNumber;
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        return this.numbers.contains(number);
    }
}

