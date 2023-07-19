
# Big O
It is used to classify algorithms according to how their runtime or space requirements grows as the input size grows.

  <img src="/Assets/BigO.png" width="900" />

## Question 1
What is the BigO of the algorithm below?
```python
    def example(num):
        return num % 2 == 0
```
The answer is O(1), Contant time, whatever value of n is, it get divided by 2.
## Question 2
What is the BigO of the algorithm below?
```python
    def example(nums):
        total = 0
        for number in nums:
            total += number

        return total
```
The answer is O(n), n is the number of numbers in nums. 
the for loop takes n times, so as n gets larger then more time is needed to iterate over the numbers in nums.
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
The answer is O(n^2), 
    In the first line a list is created using a for loop
    ```
        results = [1 for _ in range(len(nums))]
    ```
    This is 0(n)
    In the first for loop:
    ```
        for i, num1 in enumerate(nums):
    ```
    It is also going to take n times to run, so O(n)
    In the last nested forloop, it also need to run n times.
    ```
        for num2 in nums:
    ```
    So it is also O(n).
    All other operations within the loop are in constant time O(1).
    Since the second O(n) for loop is within the first for loop of O(n)
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
    The more dominant term is n^2, the the method runs in O(n^2)