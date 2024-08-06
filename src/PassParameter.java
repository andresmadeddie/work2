import java.util.Arrays;

/**
 * Accepts a command-line argument representing a user's name, and then prints it on the console.
 */

public class PassParameter {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java UserInfo <username>");
            System.exit(1);
        }

        String name = args[0];
        System.out.println("your name is: " + name);
    }

    public static class QuickSort {
        public static void main(String[] args) {
            int[] array = {5, 2, 4, 6, 1, 3};
            quickSort(array, 0, array.length - 1);
            System.out.println(Arrays.toString(array));
        }

        public static void quickSort(int[] array, int lowIndex, int highIndex) {
            if (lowIndex < highIndex) {
                int pivotIndex = partition(array, lowIndex, highIndex);
                quickSort(array, lowIndex, pivotIndex - 1);
                quickSort(array, pivotIndex + 1, highIndex);
            }
        }

        public static int partition(int[] array, int lowIndex, int highIndex) {
            int pivot = array[highIndex];
            int i = lowIndex - 1;

            for (int j = lowIndex; j < highIndex; j++) {
                if (array[j] <= pivot) {
                    i++;
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

            int temp = array[i + 1];
            array[i + 1] = array[highIndex];
            array[highIndex] = temp;

            return i + 1;
        }
    }
}