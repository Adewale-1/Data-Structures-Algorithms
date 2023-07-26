## Two Sums
Given an array of integers ```nums``` and an integer ```target```, return indices of the two numbers such that they add up to ```target```.You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

```java
    class Solution {
        
        public int[] twoSum(int[] nums, int target) {
            int[] newArray = new int[2];

            for (int i = 0; i < nums.length; i++){
                for (int j = i + 1; j < nums.length; j++){
                    int temp = nums[i];
                    int sum = temp + nums[j];
                    if (sum == target){
                        newArray[0] = i;
                        newArray[1] = j;
                    }
                }
            }
            return newArray;
        }
    }
```
## Valid Anagrams
Given two strings ```s``` and ```t```, return ```true``` if ```t``` is an anagram of ```s```, and ```false``` otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
```java
    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()){
                return false;
            }
            char[] sChar = s.toCharArray();
            char[] tChar = t.toCharArray();
        
            Arrays.sort(sChar);
            Arrays.sort(tChar);

            return Arrays.equals(sChar,tChar);
        }
    }
```
## Contains Duplicates
Given an integer array ```nums```, return ```true``` if any value appears at least twice in the array, and return ```false``` if every element is distinct.
```java
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++){
                if(set.contains(nums[i])){
                    return true;
                }
                set.add(nums[i]);
            }
            return false;
        }
    }
```
## Remove Duplicate from Sorted Array
Given an integer array ```nums``` sorted in non-decreasing order, remove the duplicates ```in-place``` such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in ```nums```.Consider the number of unique elements of ```nums``` to be ```k```, to get accepted, you need to do the following things:
Change the array ```nums``` such that the first ```k``` elements of ```nums``` contain the unique elements in the order they were present in ```nums``` initially. The remaining elements of ```nums``` are not important as well as the size of ```nums```.
Return k.
```java
    class Solution {
        public int removeDuplicates(int[] nums) {
            int left_pointer = 1;

            for (int right_pointer = 1;right_pointer < nums.length;right_pointer++){
                if(nums[right_pointer] != nums[right_pointer - 1]){
                    nums[left_pointer] = nums[right_pointer];
                    left_pointer++;
                }
            }
            return left_pointer;
        }
    }
```