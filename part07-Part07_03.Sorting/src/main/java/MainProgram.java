
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);

    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int smallest = smallest(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) {
                index = i;
                break;
            }
        }

        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int[] subArray = new int[array.length - startIndex];

        for (int i = 0; i < subArray.length; i++) {
            subArray[i] = array[startIndex + i];
        }

        return indexOfSmallest(subArray) + startIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {

        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            // Examine the array starting from index i.
            // Swap the following two numbers with each other:
            // the number at index i, and the smallest number in the array starting from index 1
            swap(array, i, indexOfSmallestFrom(array, i));

            System.out.println(Arrays.toString(array));
        }

    }

}
