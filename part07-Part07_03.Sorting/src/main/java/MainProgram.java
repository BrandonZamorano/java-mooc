
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));

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

}
