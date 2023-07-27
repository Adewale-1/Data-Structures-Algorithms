## Reverse a LinkedList

Given the ```head``` of a singly linked list, reverse the list, and return the reversed list.
```java
    class Solution {
        public ListNode reverseList(ListNode head) {
                ListNode prev = null;

                while(head != null){
                    ListNode nextNode = head.next;
                    head.next = prev;
                    prev = head;
                    head = nextNode;
                }
        return prev;        
        }
    }
```