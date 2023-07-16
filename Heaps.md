# Heaps

A heap is a tree-based data structure that satisfies the heap invariant: If A is a parent node of B then A is ordered with respect to B for all nodes A, B in the heap.

  <img src="/Assets/1.png" width="900" />

In a Max Heap, the root of the tree is greater than or equal to all subsequent leaf nodes. For example, 8 is greater than 7 and 6. Recursively, all other parent nodes follow this pattern.

In a Min Heap, the root of the tree is lesser than or equal to all subsequent leaf nodes. For example, 0 is lesser than 2 and 3. Recursively, all other parent nodes follow this pattern.

## Examples

  <img src="/Assets/2.png" width="600" height = "300"/>

Here, we have a violation of the heap invariant:
<img src="/Assets/3.png" width="600" height = "400" />

    <img src="/Assets/4.png" width="600" height = "400"/>

This is a tree and it satisfies the heap invariant:
<img src="/Assets/5.png" width="600" height = "400"/>

This structure is not a tree because it contains a cycle. Heaps must be trees:
<img src="/Assets/6.png" width="600" height = "400"/>
<img src="/Assets/7.png" width="600" height = "400"/>

All these are also heaps:
<img src="/Assets/8.png" width="600" height = "400"/>
<img src="/Assets/10.png" width="600" height = "400"/>

This is not a heap:
<img src="/Assets/9.png" width="600" height = "400"/>
