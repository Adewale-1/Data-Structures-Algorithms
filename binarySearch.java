public class binarySearch {
    public static void main(String[] args) {

    }
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
    public static int binarySearch(int array[], int target){
        int low = 0;
        int high = array.length - 1;

        while(low <= high){
            int middle = (low + high) / 2;

            if (array[middle] < target){
                low = middle + 1;
            }
            else if (array[middle] > target){
                high = middle - 1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }
}
