

LinkedList<String> links = new LinkedList<String>();

Methods:

add(int index, element):
Insert element at the specified position.
	LinkedList<String> links = new LinkedList<String>();

	links.add("Cat");
	links.add("Rat");
	links.add("Tat");

	System.out.print(links);
    output => [Cat, Rat, Tat]

    links.add(1,"tap");

    output => [Cat, tap, Rat, Tat]

add(int index, Collections c):
This method appends all the elements in the specified collection to the end of the list.

addFirst(element):
This methods inserts the element at the beginning of the list.

addLast(element):
This method insert the element at the end of the list.

clear()
The method clears the list.

clone()
This method returns a shallow copy of the Linkedlist.

contains(Object o):
It returns true if this list contains a specific element.

get(int index):
This method returns the element at the specific position in the list.

getFirst()
This method returns the first element at the specific position in the list.

getLast()
This method returns the last element at the specific position in the list.

indexOf(Object o):
This method returns the index of the first occurence of the element in the list or -1 if the list does not contain the element.

offer(element)
This methods adds the specified element to the end of the list.

poll()
This method removes the head element from the list.

pollFirst()
This method retrieves and removes the first element from the list.

pollLast()
This method retrieves and removes the last element from the list.

peek()
This method retrieves but does not remove the lead of the list.

peekFirst()
This method retrieves but does not remove the first element of the list.

peekLast()
This method retrieves but does not remove the last element of the list.

pop()
This method pops an element from the stack represented by the list

push(element)
This method pushes an element onto the stack represented by the list.

remove()

remove(int index)

remove(Object o)

removeFirst()

removeLast()

removeFirstOccurrence(Object o)

removeLastOccurrence(Object o)

set(int index, element)

size()

toArray();

toString()
