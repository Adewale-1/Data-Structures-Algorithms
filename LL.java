
/**
 * LinkedLIst
 */
public class LL {


    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public int size(){
        return size;
    }


    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        // if it is the first item being added
        if (tail == null){
            tail = node;
        }

        size++;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void insertLast (int value){
        if (tail == null){
            insertFirst(value);
        }

        Node node = new Node(value);

        tail.next = node;
        node.next = null;
        tail = node;
        
        size++;

    }
    public void insert(int index, int value){
        Node node = new Node(value);

        if (index == 0){
            insertFirst(value);
        }
        else if (index == size){
            insertLast(value);
        }
        else{
            Node temp = head;
            Node after = head;
            for (int i = 1; i < index; i++) {
                temp  = temp.next;
            }
            for (int i = 1; i < index + 1; i++) {
                after = after.next;
            }
            temp.next = node;
            node.next = after;
        }
        size++;
    }

    public void deleteFirst(){

        if (head.next == null){
            head = null;
            tail = null;
        }
        else{
            Node node = head.next;
            head = node;
        }
        size--;

    }

    public void deleteLast(){
        if (head.next == null){
            deleteFirst();
        }
        else{
            Node temp = head;
            for (int i = 1; i < size - 1; i++) {
                temp = temp.next;
            }
            
            tail = temp;
            tail.next = null;
        }
    }

    public void delete(int index){
        if (index == 0){
            deleteFirst();
        }
        else if (index == size - 1){
            deleteLast();
       }
       else{
            Node temp = head;
            for (int i = 1; i < index - 1; i++) {
                temp = temp.next;
            }
            Node after = head;
            for (int i = 1; i < index + 1; i++) {
                after = temp.next;
            }

            temp.next = after;        
       }
    }


    private class Node{ 
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }


    }


}