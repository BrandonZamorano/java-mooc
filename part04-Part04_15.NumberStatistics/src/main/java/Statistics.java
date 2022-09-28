
public class Statistics {

    private int count;

    public Statistics() {
        this.count = 0;
    }

    public void addNumber(int number) {
        this.count++;
    }

    public int getCount() {
        return this.count;
    }
}
