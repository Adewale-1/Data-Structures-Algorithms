
# Big O
It is used to classify algorithms according to how their runtime or space requirements grows as the input size grows.

  <img src="/Assets/BigO.png" width="900" />

## Question 1
What is the BigO of the algorithm below?
```python
    def example(num):
        return num % 2 == 0
```
The answer is ```O(1)```, Constant time, whatever value of n is, it get divided by 2.
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
<details>
 <summary><h3>Explanation</h3></summary>

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
</details>

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
<details>
 <summary><h3>Explanation</h3></summary>

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
</details>

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
The answer is `O(hw)`

<details>
 <summary><b>Explanation</b></summary>

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
So we say, `h` is the height if the list, and `w` is the width of the each nested list in the list. 

Going over the lines,In the first for loop, it iterate over the Height of the list for the amount of list resent so that is `O(h)`, as the number of nested list increases so does the value of `h`.

In the Operations(3) within the first for loop, they iterate over the elements present in each nested list, that is in `O(w)`.Since there are 3 operations, we could say it is in `O(3w)`. 

So,
```
    O(1) + (O(h) * O(3w)) + O(1)
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
</details>

## Question 6
What is the BigO of the algorithm below?
```python
def example(n):
    if n == 1:
        return 1
    if n == 2:
        return 1

    # Recursive call
    last = example(n-1);
    second_last = example(n-2);

    return last + second_last
```
The answer is `O(2^n)`
<details>
 <summary><b>Explanation</b></summary>

In this recursive method, Recursion is being used ```twice```. Here is the structure of the algorithm if ```n = 5```
```
                            5
                        /       \
                    4            3
                / \             / \   
             3       2         2    1
            / \
         2       1
```

For each input to the function, 2 recursive calls are made.
<details>
 
## Question 7
What is the BigO of the algorithm below?
```python
def example(lst, search_lst):
    max_value = max(lst)

    for value in search_lst:
        if max_value == value:
            return True

    return False
```
The answer is ```O(n + m)```
<details>
 <summary><b>Explanation</b></summary>

Let ```lst = n``` and ```search_list = m```.In the first operation, finding the maximum value in a list require some sort of iteration over than list ```n``` times, so has the value of ```n``` increases so will the time taken to find the  ```max``` also increase.This is done in ```O(n)```.

In the for loop, that is in  ```O(m)```
So we have;
```
    O(n) + O(1m)
```
Mathematically,
```
    n + m
```
Thus ```O(n + m)```
<details>

## Question 8
What is the BigO of the algorithm below?
```python
def example(n):
    if n == 1:
        return 

    print(n)

    # Recursive call
    example(round(n/2))
```
This answer is `O(logn)`
<details>
 <summary><b>Explanation</b></summary>

If ```n = 40``` , then after each recursive call, ```n``` becomes smaller, ```20,10,5,2,1```. This is ```logrithemic base of 2``` ,```log(n)```. 

<details>

## Question 9 (Hard)
What is the BigO of the algorithm below?
```python
def example(strings):
    for i, string in enumerate(strings):
        digits = 0

        for char in string:
            if char in [str(i) for i in range(0,10)]:
                digit += 1
        if digits >= len(string) / 2:
            strings[i] = sorted(strings[i])

    return strings
```
The answer is ```nklog(k)```.
<details>
 <summary><b>Explanation</b></summary>

The first for loop takes ```O(n)```
```python
    for i, string in enumerate(strings):
```
and it contains an operation in ```constant time O(1)```.

For strings, the number of character in the strings dictates how long it takes to process that string.So to define the amount of time to process a string we need the ```length``` of the string. We could represent it the  ```length``` as ```k```. 
In the second for loop, the runtime is ```O(k)```,
```python
        for char in string:
```
The operations within the for loop is ```O(1)```, because the ```[str(i) for i in range(0,10)]``` has a ```fixed``` upper bound of ```10``` in each iteration.

For sorting, the most ```efficient solution``` is in ```nlog(n)```, which in this scenerio is in ```klog(k)```.

So
```
    O(n) * (O(k) + O(klog(k)))
```
Mathematically;
```
    n * (k +klog(k))
```
Thus, ```nklog(k)```
<details>

## Question 10 (Hard)
What is the BigO of the algorithm below?
```python
def example(strings):
    keys1 = sorted(dict1.keys())
    keys2 = sorted(dict2.keys())

    process = keys1 + keys2
    reults = set()

    while len(process) > 0:
        element = process.pop()
        results.append(element)

        if len(element) == 1:
            continue
        
        process.append(element[:-1])

    return results
```
The answer is ```O(nlog(n) + mlog(m) + (n + m)k )```.
<details>
 <summary><b>Explanation</b></summary>

Let ```dict1 = n``` and ```dict2 = m```. In the first line
```python
    keys1 = sorted(dict1.keys())
    keys2 = sorted(dict2.keys())
```
there is a runtime of ```nlog(n)``` and ```mlog(m)```.
The next line;
```python
    process = keys1 + keys2
```
takes ```O(n + m)```.
The set declaration is in ```Constant time```.
In the while loop, the
```python
        element = process.pop()
```
is in ```Linear time O(n + m)```. This is because, when an element is removed from the list, all other elements are shifted ```-1```.

The ```results.append(element)``` is in ```O(1)```. and the ```process.append(element[:-1])``` is in ```O((n + m)k)```, where ```k``` is the value of the length of the list.
So
```
    O(nlog(n)) + O(mlog(m)) + O(n + m) + O(n + m) +O((n + m)k)
```
Mathematically;
```
    nlog(n) + mlog(m) +2(n + m) + (n + m)k
```
Dropping constants and non-dominant terms
```
    nlog(n) + mlog(m) + (n + m)k   
```
Thus, ```O(nlog(n) + mlog(m) + (n + m)k )```
<details>

## Question 11 (Hard)
What is the BigO of the algorithm below?
```python
def example(n , results):
    if n == 0:
        return

    # Recursive call
    example(n//4, results)

    for i in range(n):
        results.append(i)

    results.sort()

```
The answer is ```O(nlog(n) + mlog(m) + (n + m)k )```.
<details>
 <summary><b>Explanation</b></summary>
 
<details>