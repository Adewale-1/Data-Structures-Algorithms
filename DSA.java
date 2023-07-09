import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class DSA {
    public static void main(String[] args) {
        int[] arr = { 3, 9, 2, 1, 6 };
        // bubbleSort(arr);
        // int value2 = LinearSearch(arr, 3737);
        // SelectionSort(arr);
        // System.out.println("Value found at index: " + value);
        // System.out.println("Value found at index: " + value2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    // Sort Algorithms
    // This method takes in a disordered array and sort it in accending order
    /**
     * @param
     * array
     * @requires
     *           array is an array
     * @ensures
     *          array is sorted
     */
    public static void bubbleSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * @param
     * array
     * @requires
     *           array is an array
     * @ensures
     *          array is sorted
     */
    public static void SelectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minimum = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minimum] > array[j]) {
                    minimum = j;
                }
            }
            int temporary = array[i];
            array[i] = array[minimum];
            array[minimum] = temporary;
        }
    }

    public static void InsertionSort() {

    }

    private static void MergeSort() {

    }

    // Search Algorithms
    // This method takes in an array and gets the index of a value
    /**
     * @param
     * array,        integer
     * @requires
     *           array is an array, target is an integer
     * @ensures
     *          index of terget in array
     */
    public static int binarySearch(int array[], int target) {
        int high = array.length - 1;
        int low = 0;
        int index = -1;

        while (low <= high) {
            int middle = (high + low) / 2;

            if (array[middle] < target) {
                // Too low
                low = middle + 1;
            } else if (array[middle] > target) {
                // Too high
                high = middle - 1;
            } else {
                // Value found
                return middle;
            }
        }

        return index;
    }

    // This method takes in an array and gets the index of a value
    /**
     * @param
     * array,        integer
     * @requires
     *           array is an array, target is an integer
     * @ensures
     *          index of terget in array
     */
    public static int LinearSearch(int array[], int target) {
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                index = i;
            }
        }

        return index;
    }

}
