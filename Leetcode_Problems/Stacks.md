## Baseball Game
You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.
You are given a list of strings operations, where `operations[i]` is the `ith` operation you must apply to the record and is one of the following:

- An integer `x`.
  Record a new score of `x`.
  `'+'`.
- Record a new score that is the sum of the previous two scores.
  `'D'`.
- Record a new score that is the double of the previous score.
  `'C'`.
  Invalidate the previous score, removing it from the record.
  Return the sum of all the scores on the record after applying all the operations.

The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.

```java
    class Solution {

    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < operations.length; i++){
            if (operations[i].equals("C")){
                stack.pop();
            }
            else if (operations[i].equals("D")){
                stack.push(product(stack));
            }
            else if (operations[i].equals("+")){
                stack.push(sum(stack));
            }
            else{
                stack.push(Integer.parseInt(operations[i]));
            }
        }
        int total = totalSum(stack);
        return total;
    }
    public static Integer product(Stack<Integer> stack){
        Integer a = stack.peek();
        return a * 2;
    }
    public static Integer sum(Stack<Integer> stack){
        Integer sum = 0;
        Integer value1 = stack.pop();
        Integer value2 = stack.pop();
        stack.push(value2);
        stack.push(value1);
        return value1 + value2;
    }
    public static Integer totalSum(Stack<Integer> stack){
        Integer sum = 0;
        for (Integer a : stack){
            sum += a;
        }
        return sum;
    }
}
```
## Evaluate Reverse Polish Notation

You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

Evaluate the expression. Return an integer that represents the value of the expression.

Note that:

- The valid operators are ```'+'```, ```'-'```, ```'*'```, and ```'/'```.
- Each operand may be an integer or another expression.
- The division between two integers always truncates toward zero.
- There will not be any division by zero.
- The input represents a valid arithmetic expression in a reverse polish notation.
- The answer and all the intermediate calculations can be represented in a 32-bit integer.

```java
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++){
            if (!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")){
                stack.push(Integer.parseInt(tokens[i]));
            }
            else if (tokens[i].equals("+")){
                stack.push(sum(stack));
            }
            else if (tokens[i].equals("-")){
                stack.push(minus(stack));
            }
            else if (tokens[i].equals("*")){
                stack.push(product(stack));
            }
            else if (tokens[i].equals("/")){
                stack.push(divide(stack));
            }
        }
        Integer total = stack.pop();
        return total;
    }


    public static Integer sum(Stack<Integer> stack){
        Integer value1 = stack.pop();
        Integer value2 = stack.pop();
        return value1 + value2;
    }
    public static Integer minus(Stack<Integer> stack){
        Integer value1 = stack.pop();
        Integer value2 = stack.pop();  
        return value2 - value1;      
    }
    public static Integer product(Stack<Integer> stack){
        Integer value1 = stack.pop();
        Integer value2 = stack.pop(); 
        return value1 * value2;       
    }
    public static Integer divide(Stack<Integer> stack){
        Integer value1 = stack.pop();
        Integer value2 = stack.pop();  
        return value2 / value1;      
    }
}
```
