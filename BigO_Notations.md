
# Big O
It is used to classify algorithms according to how their runtime or space requirements grows as the input size grows.

  <img src="/Assets/BigO.png" width="900" />

## Question 1
What is the BigO of the algorithm below?
```python
    def example(num):
        return num % 2 == 0
```
The answer is ```O(1)```, Contant time, whatever value of n is, it get divided by 2.
## Question 2
What is the BigO of the algorithm below?
```python
    def example(nums):
        total = 0
        for number in nums:
            total += number

        return total
```
The answer is ```O(n)```, n is the number of numbers in nums. 
the for loop takes ```n``` times, so as n gets larger then more time is needed to iterate over the numbers in nums.
## Question 3
What is the BigO of the algorithm below?
```python
    def example(nums):
        results = [1 for _ in range(len(nums))]

        for i, num1 in enumerate(nums):
            for num2 in nums:
                if num1 == num2:
                    continue
                result[i] *= nums2
```
The answer is ```O(n^2)``` 
### Explanation
In the first line a list is created using a for loop
```
    results = [1 for _ in range(len(nums))]
```
This is ```0(n)```
In the first for loop:
```
    for i, num1 in enumerate(nums):
```
It is also going to take ```n``` times to run, so ```O(n)```
In the last nested for loop, it also need to run ```n``` times.
```
    for num2 in nums:
```
So it is also ```O(n)```.
All other operations within the loop are in constant time ```O(1)```.
Since the second ```O(n)``` for loop is within the first for loop of ```O(n)```
So we have:
``` 
    O(n) * O(n)
```
But within the secont for loop we have 3 operations done is Constant time O(1). So
``` 
    O(n) * O(3n)
```
Including the list generation using a for loop 
``` 
    0(n) + (O(n) * O(3n))
```
In mathematical terms:
```
    n + n(3n)
```
Since all constant are insignificant,then 
```
    n + n(n) => n + n^2
```
The more dominant term is ```n^2```, the the method runs in ```O(n^2)```

## Question 4
What is the BigO of the algorithm below?
```python
    def example(nums1, nums2):
        results = []

        for num in mums1:
            results.append(num)
        
        for i, num in enumerate(nums2):
            if i > len(results):
                results.append(1)
            results[i] *= num

        return results
```
The answer is O(n + m) 
### Explanation
Let ```nums1``` is ```n``` and ```nums2``` is ```m```. In the first first for loop ```for num in mums1:```, that is in Linear time of O(n) and operations append with it is in Constant time of O(1). 
The second for loop```for i, num in enumerate(nums2):``` is of O(m), and operations within it are O(1),O(1), and O(1).
So in total, all operations in the method are
```
    O(1) + O(n) + O(3m) + O(1)
```
Mathematically,
```
    1 + n + m + 1
```
All constants are dropped.
```
    n + m
```
So O(n + m)

## Question 5
What is the BigO of the algorithm below?
```python
    def example(nested_list):
        total = 0

        for inner_list in nested_list:
            for num in  inner_list:
                total += num
            
            for num in inner_list:
                total += num

            for num in inner_list:
                total += num

        return total
```
This answer is ```O(hw)```
<details>
 <summary><h3>Explanation</h3></summary>
Here is a nested list
    ```
        [[] [] []]
    ```
In the form
```
    [
        []
        []
        []
    ]
```
So we say, ```h``` is the height if the list, and ```w``` is the width of the each nested list in the list. 
Going over the lines,In the first for loop, it iterate over the Height of the list for the amount of list resent so that is ```0(h)```, as the number of nested list increases so does the value of ```h```.
In the Operations(3) within the first for loop, they iterate over the elements present in each nested list, that is in ```O(w)```.Since there are 3 operations, we could say it is in ```O(3w)```. 
So,
```
    0(1) + (0(h) * O(3w)) + 0(1)
```
Mathematically,
```
    1 + (3hw) + 1
```
All constant are dropped
```
    hw
```
Thus ```O(hw)```