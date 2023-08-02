
# Sets
The set interface extends the Collection interface.It contains an unordered collection of objects in which duplicates values cannot be stroed.A set does not retain the insertion order.

```java
    Set<String> set = new HashSet<String>();
```
## HashSet and LinkedHashSet
HashSet returns the elements of the set in different order.
LinkedHashSet returns the elements of the set is the order it was entered.

## Methods
### add(element):
This method is used to add a specific element to the set, it adds the element only if the specified element is not already in the set.
```java
	Set<Integer> set = new HashSet<>();
	set.add(3);
	set.add(9);
	set.add(4);
	System.out.print(set);

    output => [3, 4, 9]
```
### addAll(collection)
This method is used to append all of the elements from a collection to an existing set.

### clear()
This method is used to remove all the element from the set but does not delete the set. The reference still exist.

### contains(element)
This is used to check if an element exists in the set.

### containsAll(collection)
This is used to check if a set contains all of the elements in a given collection.

### isEmpty()
This checks if a set is empty.

### remove(element)
This removes the element from the set.

### removeAll(collection)
This method is used to remove all the elements from the collection which are present in the set.

### size()
This returns an integer value for the number of elements in the set.

### toArray()
This method is used to form an array of the same elements as that of the set.




add(element)
addAll(collections)
removeAll(collections)
remove(element)
contains(element)
size()
isEmpty()

toArray()