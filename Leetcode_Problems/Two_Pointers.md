## Valid Palindrome
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
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