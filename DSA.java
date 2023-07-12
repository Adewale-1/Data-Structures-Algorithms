import javax.print.attribute.SetOfIntegerSyntax;

public class DSA {
    public static void main(String[] args) {
        int[] arr = { 3, 9, 2 };
        // InsertionSort(arr);
        QuickSort(arr, 0, arr.length - 1);
        // int value2 = binarySearch(arr, 475);
        // int value2 = LinearSearch(arr, 475);
        // int value2 = InterpolationSearch(arr, 475);
        // SelectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        // if (value2 != -1){
        // System.out.println("Value found at index: " + value2);
        // }
        // else{
        // System.out.println("Value not found");
        // }
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

    // After computing elements to the left, shift elements to the right to make
    // room to insert a value
    // Runtime complexity of O(n^2)
    // Not good for large datasets
    // Best case: O(n) compared to Selection sort O(n^2)
    /**
     * @param
     * array
     * @requires
     *           array is an array
     * @ensures
     *          array is sorted
     */
    public static void InsertionSort(int array[]) {

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    /*
     * Merge sort = recursively divide array in 2, sort, re-combine
     * runtime complexity = O(n Log n)
     * space complexity = O(n)
     */
    private static void MergeSort(int[] array) {

    }

    /*
     * Quick sort = moves smaller elements to left of a pivot.
     *              Recursively divide array in 2 partitions
     * 
     * runtime complexity = Best case O(n Log n)
     *                      Average case O(n log(n))
     *                      Worst case O(n^2) if already sorted
     * 
     * space complexity   = O(log(n)) due to recursion
     */
    private static void QuickSort(int[] array, int start, int end) {
        if (end <= start) {
            return;
        }
        int pivot = partition(array, start, end);

        QuickSort(array, start, pivot - 1);
        QuickSort(array, pivot + 1, end);
    }

    private static int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;
        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }

    // Search Algorithms
    // This method searches for the position of a target within a sorted array. Half
    // of the array was elimated during each step
    // Runtime complexity : O(log n)

    // Disadvantages:
    // Not suitable for large data Sets

    // Advantages:
    // Fast for small data Sets
    // Suitable for data structures that do not have random access
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

    /**
     * Iterate through the array one element at a time
     * Runtime complexity : O(n)
     * Disadvantages:
     * Not suitable for large data Sets
     * 
     * Advantages:
     * Fast for small data Sets
     * Suitable for data structures that do not have random access
     * 
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

    // Improvement over binary search for uniformly distributed.
    // It guesses where a value might be based on calculated probe results
    // If probe is incorrect, search area is narrowed, and the probe is calculated

    // Runtime complexity : O(Log(Log n))
    // Worst case: 0(n)

    // Disadvantages:
    // Not suitable for large data Sets

    // Advantages:
    // Fast for small data Sets
    // Suitable for data structures that do not have random access
    /**
     * @param
     * array,        integer
     * @requires
     *           array is an array, target is an integer
     * @ensures
     *          index of terget in array
     */
    public static int InterpolationSearch(int array[], int target) {
        int high = array.length - 1;
        int low = 0;
        int index = -1;
        while (target >= array[low] && target <= array[high] && low <= high && index == -1) {
            int probe = low + (high - low) * (target - array[low]) / (array[high] - array[low]);

            if (array[probe] == target) {
                index = probe;
            } else if (array[probe] < target) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }
        return index;
    }


    

}
