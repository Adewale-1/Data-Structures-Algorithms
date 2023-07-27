## Valid Palindrome
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string ```s```, return ```true``` if it is a palindrome, or ```false``` otherwise.
```java
    class Solution {
    public boolean isPalindrome(String s) {
        int a_pointer = 0;
        int b_pointer = s.length() - 1;

        while(a_pointer < b_pointer){
            
            if(!Character.isLetterOrDigit(s.charAt(a_pointer))){
                a_pointer++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(b_pointer))){
                b_pointer--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(a_pointer)) != Character.toLowerCase(s.charAt(b_pointer))){
                return false;
            }
            a_pointer++;
            b_pointer--;
        }
        return true;
	}
}
```

Given a 1-indexed array of integers ```numbers``` that is already sorted in non-decreasing order, find two numbers such that they add up to a specific ```target``` number. Let these two numbers be ```numbers[index1]``` and ```numbers[index2]``` where ```1 <= index1 < index2 < numbers.length.```Return the indices of the two numbers, ```index1``` and ```index2```, added by one as an integer array ```[index1, index2]``` of length 2.The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.
```java
    class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a_pointer = 0;
        int b_pointer = numbers.length - 1;

        while (a_pointer < b_pointer){
            int sum = numbers[a_pointer] + numbers[b_pointer];

            if (sum > target){
                b_pointer--;
            }
            else if (sum < target){
                a_pointer++;
            }
            else{
                return new int[] {a_pointer + 1, b_pointer + 1};
            }            
        }
        return new int[] {a_pointer + 1, b_pointer + 1};
    }
}
```