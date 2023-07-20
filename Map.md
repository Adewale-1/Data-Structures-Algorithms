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
### put<K,V>
Inserts the association of a key ```k``` and a value ```v``` into the map.If the key is present, then the new value replaces the old.
```java
    Map<String , Integer> map = new HashMap<>();
	map.put("Boy",3);
	map.put("Girl",4);
	map.put("Goat",9);
	map.put("Horse", 2);
	System.out.print(map);

    output => {Horse=2, Goat=9, Boy=3, Girl=4}
```
## putAll()
Insert all elements from the specified map into this map.
```java
    Map<String , Integer> map = new HashMap<>();
	map.put("Boy",3);
	map.put("Girl",4);
	map.put("Goat",9);
	map.put("Horse", 2);

	Map<String , Integer> map2 = new LinkedHashMap<>();
	map2.put("Cat",3);
	map2.put("Pig",4);
	map2.put("Hen",9);
	map2.put("Donkey", 2);

	map.putAll(map2);
	System.out.print(map);

    output => {Hen=9, Donkey=2, Horse=2, Cat=3, Goat=9, Boy=3, Girl=4, Pig=4}
```
## get(K)
Returns the value associated with the specified key ```K```,if the key is not present, it returns ```null```.
```java
    Map<String , Integer> map = new HashMap<>();
	map.put("Boy",3);
	map.put("Girl",4);
	map.put("Goat",9);
	map.put("Horse", 2);
	Integer k = map.get("Goat");
	  
	System.out.print(k);

    output => 9
```
## containsKey(K)
Checks if the specified key is present in the map.
```java
	Map<String , Integer> map = new HashMap<>();
	map.put("Boy",3);
	map.put("Girl",4);
	map.put("Goat",9);
	map.put("Horse", 2);
	boolean k = map.containsKey("Fan");
	  
	System.out.print(k);

    output => false
```

## containsValue(V)
Checks if the specified value is present in the map.
```java
	Map<String , Integer> map = new HashMap<>();
	map.put("Boy",3);
	map.put("Girl",4);
	map.put("Goat",9);
	map.put("Horse", 2);
	boolean k = map.containsValue(3);
	  
	System.out.print(k);

    output => true
```

## replace(K,V)
Replace the value of the key ```k``` with the new specified value ```v```.
```java
	Map<String , Integer> map = new HashMap<>();
	map.put("Boy",3);
	map.put("Girl",4);
	map.put("Goat",9);
	map.put("Horse", 2);
	map.replace("Horse",6);
	  
	System.out.print(map);

    output => {Horse=6, Goat=9, Boy=3, Girl=4}
```

## remove(K)
Removes the entry from the map represented by the key ```k```.
```java
	Map<String , Integer> map = new HashMap<>();
	map.put("Boy",3);
	map.put("Girl",4);
	map.put("Goat",9);
	map.put("Horse", 2);
	map.remove("Horse");
	  
	System.out.print(map);

	output =>  {Goat=9, Boy=3, Girl=4}
```

## keySet()
Returns the set of all keys present in a map
```java
	Map<String , Integer> map = new HashMap<>();
	map.put("Boy",3);
	map.put("Girl",4);
	map.put("Goat",9);
	map.put("Horse", 2);
	map.replace("Horse",3);

	System.out.print(map.keySet());

    output => [Horse, Goat, Boy, Girl]
```
## values()
Return the set of all the values present in a map
```java
	Map<String , Integer> map = new HashMap<>();
	map.put("Boy",3);
	map.put("Girl",4);
	map.put("Goat",9);
	map.put("Horse", 2);
	map.replace("Horse",3);
	  
	System.out.print(map.values());

    output => [3, 9, 3, 4]
```
## entrySet()
Return a set of all the key/value mapping present in a map.
```java
	map.put("Boy",3);
	map.put("Girl",4);
	map.put("Goat",9);
	map.put("Horse", 2);
	map.replace("Horse",3);
	  
	System.out.print(map.entrySet());

    output => [Horse=3, Goat=9, Boy=3, Girl=4]
```