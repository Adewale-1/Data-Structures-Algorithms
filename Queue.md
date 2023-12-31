# Queue
This is a linear data structure which models real world queues by having two primary operations, namely enqueue and dequeue.

## As a LinkedList implementation

```java
    Queue<Integer> queue = new LinkedList<>();
```
 
For example:

```java
    Queue<Integer> queue = new LinkedList<>();
    queue.add(100);
    queue.add(2);
    queue.add(30);
    System.out.print(queue.poll());

    output => 100
```

## As a PriorityQueue implementation:

In order of priority

```java
    Queue<Integer> queue = new PriorityQueue<>();
```

For example:

```java
    Queue<Integer> queue = new PriorityQueue<>();
    queue.add(100);
    queue.add(2);
    queue.add(30);
    System.out.print(queue.poll());

    output => 2
```

## Methods:

### add(int index,Object o):

This method is used to add an element at a possible index in the queue.If no index is specified,it simply adds the element at the end of the queue.

```java
	Queue<String> queue2 = new LinkedList<>();
    queue2.add("Cat");
	queue2.add("Bat");
	queue2.add("Rat");
	System.out.print(queue2);

    output => [Cat, Bat, Rat]
```

### addAll(int index, Collections c)

Adds all the element in a collection into a queue.

### size():

Returns the size of a queue.

### clear()

Remove all the elements in the queue.

### remove()

Remove the element from the front.

```java
	Queue<String> queue2 = new LinkedList<>();
    queue2.add("Cat");
	queue2.add("Bat");
	queue2.add("Rat");
	queue2.remove();
	System.out.print(queue2);

    output => [Bat, Rat]
```

### remove(int index)

Remove the element from a specific index, It shifts subsequent element to the left and the size of the queue reduces by 1.

### remove(element):

Remove and return the first occurrence of the given element in the queue.

```java
	Queue<String> queue2 = new LinkedList<>();
    queue2.add("Cat");
	queue2.add("Bat");
	queue2.add("Rat");
	queue2.remove("Bat");
	System.out.print(queue2);

    output => [Cat, Rat]
```

### get(int index)

Return element at the specified index

### set(int index, element)

Replaces element at a given index with the new element.

### indexOf(element)

Returns the first occurrence of the given element in the queue or -1 if the element is not present.

### lastIndexOf(element) :

Returns the last occurrence of the element or -1 if the element is not present.

### equals(element):

Compare the element in the queue with the element

### isEmpty():

Returns true if the queue is not empty, false otherwise.

### contains(element):

Returns true if the element is in the queue, false otherwise.

```java
	Queue<String> queue2 = new LinkedList<>();
    queue2.add("Cat");
	queue2.add("Bat");
	queue2.add("Rat");
	System.out.print(queue2.contains("Rat"));

    output => true
```

### containsAll(Collections c)

check if the queue contains all the collection of another queue.

### offer(Object o)

This method adds a specified element into the queue.

### poll()

This method is used to return and remove the head of the queue.

### peek()

This method returns a copy of the head of the queue.





add(element)
addAll(element)
offer(element)
poll()
remove(element)
size()
peek()

contains(element)
isEmpty()
removeAll()
get(index)
set(element, index)
indexOf(element)
conatinsAll(collection)