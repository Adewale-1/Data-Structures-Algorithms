
## Binary Search
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.
```java
    class Solution {
        public int search(int[] nums, int target) {

            Arrays.sort(nums);
            return binarySearch(nums,target);
        
        }
        public static int binarySearch(int[] array, int target){
            int high = array.length - 1;
            int low = 0;
            int index = -1;
            while(low <= high){
                int middle = (high + low)/2;


                if (array[middle] < target){
                    low = middle + 1;
                }
                else if (array[middle] > target){
                    high = middle - 1;
                }
                else{
                    return middle;
                }
            }

            return index;
        }
    }
```

## Search a 2D Matrix
You are given an ```m x n``` integer matrix ```matrix``` with the following two properties:

- Each row is sorted in non-decreasing order.
- The first integer of each row is greater than the last integer of the previous row.
Given an integer ```target```, return ```true``` if ```target``` is in ```matrix``` or ```false``` otherwise.
You must write a solution in O(log(m * n)) time complexity.
```java
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            for (int i = 0; i < matrix.length; i++){
                for (int j = 0; j < matrix[i].length; j++){
                    if (matrix[i][j] == target){
                        return true;
                    }
                }
            }
            return false;
        }
    }
```