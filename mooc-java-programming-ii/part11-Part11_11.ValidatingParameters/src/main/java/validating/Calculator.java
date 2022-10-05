package validating;

public class Calculator {

    public int factorial(int num) {
        
        if (num < 0) {
            throw new IllegalArgumentException("num should be > 0)");
        }

        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        if (setSize < 0 || subsetSize < 0) {
            throw new IllegalArgumentException("Both parameters should be >= 0");
        }
        
        if (subsetSize > setSize) {
            throw new IllegalArgumentException("Subsetsize exceeds set size.");
        }

        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
