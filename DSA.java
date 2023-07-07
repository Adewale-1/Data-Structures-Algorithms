
public class DSA {
    public static void main(String[] args) {
        int[] arr = { 9, 3, 5 };
        bubbleSort(arr);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }
        int value = binarySearch(arr, 5);
        System.out.println("Value found at index: " + value);

    }

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

    // {2,3,5}
    // value = 5
    // high = 2
    // low = 0
    // middle = 1
    // target = 2

    public static int binarySearch(int array[], int value) {
        int high = array.length - 1;
        int low = 0;
        int index = 0;

        while (low <= high) {
            int middle = low + (low + high) / 2;
            int target = array[middle];

            if (value < target) {
                // Too high
                high = middle + 1;
            } else if (value > target) {
                // Too Low
                low = middle - 1;
            } else {
                // Value found
                index = array[middle];
            }
        }

        return index;
    }
}