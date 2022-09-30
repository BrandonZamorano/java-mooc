
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here

        // indices:       0  1  2  3   4
        int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));

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

}
