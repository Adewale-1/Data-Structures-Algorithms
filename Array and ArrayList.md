


# Static array
## Methods

## asList():
returns a fixed size list backed by the specified array
'''
    int intArr[] = {1,2,3,4,5,6,7,8};
    System.out.println(Array.asList(intArr))

    output => [1,2,3,4,5,6,7,8]
'''








## binarySearch(array, x):
Seaches for a value in the specified sorted array and returns the index, if the index is not found, it return a negative number.
'''
    int intArr[] = {1,2,3,4,19,6,21,8};
    Arrays.sort(intArr);

    System.out.println(Arrays.binarySearch(intArr, 3));

    output => 2
'''






## compare( array 1, array 2):
Compare two arrays lexicographically





## copyOf(originalArray, newLength):
Copies the specified array, truncating or padding with the default value so the copy has the specified length

''' 
    int intArr[] = { 10, 20, 15, 22, 35 };
    System.out.println("Integer Array: "
                           + Arrays.toString(
                                 Arrays.copyOf(intArr, 10)));
                              
    output => Integer Array: [10, 20, 15, 22, 35, 0, 0, 0, 0, 0] 
'''







## copyOf(originalArray, fromIndex, endIndex):

'''
    int intArr[] = { 10, 20, 15, 22, 35 };

    System.out.println("Integer Array: "
                           + Arrays.toString(
                                 Arrays.copyOfRange(intArr, 1, 3)));
                            
    output => Integer Array: [20, 15]
'''






## deepToString(array):
Returns a string representation of the "deep contents" of the specified array



## equals(array1, array2):
Checks if both the arrays are equal or not.
'''
    int intArr[] = { 10, 20, 15, 22, 35 };
  
    int intArr1[] = { 10, 15, 22 };
  
    System.out.println("Integer Arrays on comparison: "
                           + Arrays.equals(intArr, intArr1));

    output => Integer Arrays on comparison: false
'''



## mismatch(array1, array2):
Finds and return the index of the first unmatched element between the two specified arrays.
'''
    int intArr[] = { 10, 20, 15, 22, 35 };
  

    int intArr1[] = { 10, 20, 15 ,5};
  
    System.out.println("The element mismatched at index: " + Arrays.mismatch(intArr, intArr1));
                            
    output => The element mismatched at index: 3
'''


## sort(originalArray):
Sort the complete array in ascending order.
'''
    int intArr[] = { 10, 20, 15, 22, 35 };
    Arrays.sort(intArr);
    System.out.println("Integer Array: "
                           + Arrays.toString(intArr));

    output => Integer Array: [10, 15, 20, 22, 35]
'''






## sort(originalArray,formIndex,endIndex):
Sort the specified range of array in ascending order  from a start index to a end index - 1.
'''
    int intArr[] = { 10, 15, 2, 1, 35 };
  
    Arrays.sort(intArr, 1, 3);
  
    System.out.println("Integer Array: "
                +Arrays.toString(intArr));
    
    output => Integer Array: [10, 2, 15, 1, 35]
'''





## toString(originalArray):
It returns a string representation of the contents of this array. Elements are converted to strings by String.valueOf() function.
'''
    int intArr[] = { 10, 20, 15, 22, 35 };
  
    System.out.println("Integer Array: "
                           + Arrays.toString(intArr));

    output => Integer Array: [10, 20, 15, 22, 35]
'''








# Dynamic Arrays

'''
ArrayList<Integer> array = new ArrayList<Integer>();
'''


## Methods:
## add(int index, element):

This method is used to insert a specific element at  aspecific index in a list
'''
    ArrayList<String> al = new ArrayList<>();

    al.add("I");
    al.add("Rule");
    al.add(1, "like");

    System.out.println(al);

    output => [Geeks, For, Geeks]
'''

## add(element):
This method is used to append a specific element to the end of a list.

## addAll(collection):
This method is used to append all the elements from a specific collection to the end of the mentioned list.

## addAll(int index,collection):
Used to insert all of the elements starting at the specified position from a specified collection into the mentioned list.


## clear():
Removes all the elements from any list

## clone()
This method is used to return a shallow copy of an ArrayList




## contains(Object):
Returns true if the list contains the specified element
'''
    ArrayList<Integer> list = new ArrayList();
    list.add(2);
    list.add(4);
    list.add(3);
    list.add(1);
    System.out.println(list.contains(5));

    output => false;
'''


## sort(list):
'''
    ArrayList<Integer> list = new ArrayList();
    list.add(2);
    list.add(4);
    list.add(3);
    list.add(1);

    Collections.sort(list);

    System.out.println("after sorting list:");
    System.out.println(list);

    output => [1, 2, 3, 4]
'''






## get(int index):
Returns the element at the specific position in the list.
'''
    al.add("I");
    al.add("Geek");
    al.add(1, "can");
  

    for (int i = 0; i < al.size(); i++) {
        System.out.print(al.get(i) + " ");
    }

    output => I can Geek
'''



## indexOf(Object o):
The index of the first occurrence of a specifi element is either returned or -1 in case the element is not in the list.

## isEmpty():
Returns true if this list contains no elements

## lastIndexOf(Object o):
The index of the last occurrence of a specific element is either returned or -1 in case the element is not in the list.

## remove(int index):
Removes the element at the specified position in the list.

## remove(Object o):
Removes the first occurrence of the specified element from the list.
'''
    al.add("Geeks");
    al.add("Geeks");

    al.add(1, "For");

    System.out.println("Initial ArrayList " + al);

    al.remove(1);

    System.out.println("After the Index Removal " + al);

    al.remove("Geeks");

    System.out.println("After the Object Removal "
                           + al);
'''


## removeAll(collection c):
Removes from the list all of its elements that are contained in a specified collection.





## set(int index,element):
Replaces the element at the specified position in the list with the specified element
'''
    al.add("I");
    al.add("Rule");

    al.add(1, "Like");

    System.out.println("Initial ArrayList " + al);
    al.set(1, "Don't");
    System.out.println("Updated ArrayList " + al);

    output => [I,Like,Rule]
    output => [I,Don't Rule]
'''


## size():
Returns the number of elements in the list.

## toArray():
This method is used to return an array containing all of the elements in the list in the correct order.
