# Map
```java
    Map<String, Integer> map = new HashMap<>();
```
```HashMap```, ```TreeMap```, and ```LinkedHashMap``` all implements the Map interface.
## HashMap
This has a faster runtime complexity than any other implementaion of the Map interface.No ordering.
## LinkedHashMap
This returns the order of elements in the map, as it was inputed.
## TreeMap
This returns a structured order of the elements in the map.

## Methods
## put<K,V>
Inserts the association of a key ```k``` and a value ```v``` into the map.If the key is present, then the new value replaces the old.

## putAll()
Insert all elements from the specified map into this map.

## get(K)
Returns the value associated with the specified key ```K```,if the key is not present, it returns ```null```.

## containsKey(K)
Checks if the specified key is present in the map.

## containsValue(V)
Checks if the specified value is present in the map.

## replace(K,V)
Replace the value of the key ```k``` with the new specified value ```v```.

## remove(K)
Removes the entry from the map represented by the key ```k```.

## remove(K,V)
Removes the entry from the map that has key ```k``` associated with ```v```.

## keySet()
Returns the set of all keys present in a map

## values()
Return the set of all the values present in a map

## entrySet()
Return a set of all the key/value mapping present in a map.