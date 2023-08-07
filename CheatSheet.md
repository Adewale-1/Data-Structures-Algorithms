

Convert an interger into a string using ```String.valueOf(x)```.
Convert a String to integer using ```Integer.parseInt(string)``` or ```Integer.parseDouble(string)```.
When finding the kth element or kth most frequent element 
```java
    PriorityQueue<Integer> queue = new PriorityQueue<>(Collection.reverseOrder());
```
using a map
```java
    PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> b.getValue()-a.getValue());
```

LinkedList
When getting a node in a linkedlist or trying to know if a linked list is cyclic use ```fast``` and ```slow```

While creating a new Linked list, always intanciate the object declaration and return the object.next.
```java
    LinkedNode node = new LinkedNode();
    ListNode head = node;

    return node.next;
```

When adding to a string use ```StringBuilder```, then return ```Object.toString()```. Using a string adds more space complexity because a new string is created when a value is concatenated with it.
```java
    StringBuilder s = new StringBuilder();

    s.append(value)

    return s.toString()
```
Get the value of a key in a map at a specific index in an HashMap.First only works in the maps iteration
```java
    for (Map.Entry<Integer, Integer> entry : map.entrySet()){
        Integer v = entry.getValue();
        Integer k = entry.getKey();
    }
```
##
Question 128 .Longest Sequence
Question 206  Reverse LinkedList given head
Question 26 Remove Duplicates from Sorted Array
Question 121 Best Time to buy and sell stock
Question 238 Product of array except self
