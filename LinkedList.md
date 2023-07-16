# LinkedList
This is a sequential list of nodes that holds data which point to other nodes also containing data

Used in many List,Queue and Stack implementations.

```java
	LinkedList<String> links = new LinkedList<String>();
```

## Methods:

### add(int index, element):

Insert element at the specified position.

```java
	LinkedList<String> links = new LinkedList<String>();

	links.add("Cat");
	links.add("Rat");
	links.add("Tat");

	System.out.print(links);
    output => [Cat, Rat, Tat]

    links.add(1,"tap");

    output => [Cat, tap, Rat, Tat]
```

### addAll(int index, Collections c):

This method appends all the elements in the specified collection to the end of the list.

```java
	LinkedList<String> links = new LinkedList<String>();

	links.add("Cat");
	links.add("Rat");
	links.add("Tat");
	links.add(1,"tap");
	LinkedList<String> links2 = new LinkedList<String>();

	links2.add("Hoo");
	links2.add("Loop");
	links2.add("Tar");
	links.addAll(links2);
	System.out.print(links);

	output => [Cat, tap, Rat, Tat, Hoo, Loop, Tar]
```

### addFirst(element):

This methods inserts the element at the beginning of the list.

```java
	LinkedList<String> links = new LinkedList<String>();

	links.add("Cat");
	links.add("Rat");
	links.add("Tat");
	links.add(1,"tap");
	links.addFirst("Dog");


	System.out.print(links);
	output => [Dog, Cat, tap, Rat, Tat]
```

### addLast(element):

This method insert the element at the end of the list.

```java
	LinkedList<String> links = new LinkedList<String>();

	links.add("Cat");
	links.add("Rat");
	links.add("Tat");
	links.add(1,"tap");
	links.addLast("Dog");
	System.out.print(links);
	output => [Cat, tap, Rat, Tat, Dog]
```

### clear()

The method clears the list.

### clone()

This method returns a shallow copy of the Linkedlist.

### contains(Object o):

It returns true if this list contains a specific element.

### get(int index):

This method returns the element at the specific position in the list.

```java
	LinkedList<String> links = new LinkedList<String>();

	links.add("Cat");
	links.add("Rat");
	links.add("Tat");
	links.add(1,"tap");
	links.addLast("Dog");
	System.out.print(links.get(2));

	output => Rat
```

### getFirst()

This method returns the first element at the specific position in the list.

```java
	System.out.print(links.getFirst());

	output => Cat
```

### getLast()

This method returns the last element at the specific position in the list.

```java
	System.out.print(links.getLast());

	output => Dog
```

### indexOf(Object o):

This method returns the index of the first occurence of the element in the list or -1 if the list does not contain the element.

```java
	System.out.print(links.indexOf("Tat"));

	output => 3
```

## LinkedList as Queue

### offer(element)

This methods adds the specified element to the end of the list.

```java
	LinkedList<String> links = new LinkedList<String>();

	links.offer("Cat");
	links.offer("Rat");
	links.offer("Tat");
	System.out.print(links);

	output => [Cat, Rat, Tat]
```

### poll()

This method removes the head element from the list.

```java
	LinkedList<String> links = new LinkedList<String>();

	links.offer("Cat");
	links.offer("Rat");
	links.offer("Tat");


	links.set(2,"Fat");
	links.poll();
	System.out.println(links);

	output => [Rat, Fat]
```

### pollFirst()

This method retrieves and removes the first element from the list.

### pollLast()

This method retrieves and removes the last element from the list.

### peek()

This method retrieves but does not remove the lead of the list.

### peekFirst()

This method retrieves but does not remove the first element of the list.

### peekLast()

This method retrieves but does not remove the last element of the list.

### pop()

This method pops an element from the stack represented by the list

### push(element)

This method pushes an element onto the stack represented by the list.

### remove()

This method retrieves and removes the head of the list.

### remove(int index)

This method retrieves and removes an element at the specified index from the list.

```java
	LinkedList<String> links = new LinkedList<String>();

	links.offer("Cat");
	links.offer("Rat");
	links.offer("Tat");
	String m = links.remove(2);
	System.out.println(m);

	System.out.print(links);

	output => Tat
			  [Cat, Rat]
```

### remove(Object o)

This method removes the first occurrence of the specified element from the list.

### removeFirst()

This method removes and return the first element from the list.

### removeLast()

This method removes and return the last element from the list.

### removeFirstOccurrence(Object o)

This method removes the first occurrence of the specified element in the list.

### removeLastOccurrence(Object o)

This method removes the last occurrence of the specified element in the list.

### set(int index, element)

This method replaces the element at the specified position in the list.

```java
	LinkedList<String> links = new LinkedList<String>();

	links.offer("Cat");
	links.offer("Rat");
	links.offer("Tat");

	links.set(2,"Fat");

	System.out.print(links);

	output => [Cat, Rat, Fat]
```

### size()

This method returns the number of elements in the list.

### toArray();

This method returns an array containing all of the elements in the list.

### toString()

This method returns a string containing all of the elements in the list.

```java
	LinkedList<String> links = new LinkedList<String>();

	links.offer("Cat");
	links.offer("Rat");
	links.offer("Tat");

	links.set(2,"Fat");

	System.out.println(links);
	String k = links.toString();
	System.out.print(k.charAt(3));

	output => [Cat, Rat, Fat]

	output =>	t

```
