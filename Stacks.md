# Stacks
A stack is a one-ended linear data structure which models a real world stack by having two primary operations, namely push and pop.

```
    Stack<String> stack = new Stack<String>();
```

## Methods:

## push(Object element):

Add to the top of the stack

```
    Stack<String> stack = new Stack<String>();
    stack.push("Cat");
    stack.push("Dog");
    stack.push("Goat");

    System.out.print(stack);

    output => [Cat, Dog, Goat]
```

## pop():

Remove from the top of the stack

```
    Stack<String> stack = new Stack<String>();
    stack.pop();
    System.out.print(stack);

    output => [Cat, Dog]
```

## peek():

Returns the element at the top of the stack ,without deleting it.

```
    Stack<String> stack = new Stack<String>();
    String value = stack.peek();
    System.out.print(value);
    System.out.print(stack);

    output => Goat
    output => [Cat, Dog, Goat]
```

## empty():

Return true if the stack is empty, else false

## search(object element):

It determines whether an object exists in the stack, if the element is found, it returns the position of the element from the top of the stack.Else, it returns -1.

```
    stack.push("Cat");
    stack.push("Dog");
    stack.push("Goat");
	stack.push("Ant");
    stack.push("Dragon");
    stack.push("Gorrila");
	stack.push("Snacks");

    System.out.print(stack.search("Cat"));

    output => 7
```
