public class DLL {
    



    private Node head;
    private Node tail;
    private int size;

    public DLL(){
        this.size = 0;
    }

    public int size(){
        return size;
    }

    public void insertFirst(int value){
        Node node = new Node(value);

        node.next = head;
        node.prev = null;
        
        if ( head != null){
            head.prev = node;
        }
        head = node;
        size++;
    }
    public void insertLast(int value){
        if(head == null){
            insertFirst(value);
        }
        else{
            Node node = new Node(value);
            Node temp = head;
            for (int i = 1; i < size; i++) {
                temp = temp.next;
            }
            node.next = null;
            node.prev = temp;
            temp.next = node;
    
        }

        size++;

    }
    public void insert(int index , int value){
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
            node.prev = temp;
            node.next = after;
        }
        size++;
    }


    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.value +" <-> ");
            temp = temp.next;
        }
        System.out.print("null");
    }






     
    private class Node{
        private int value;
        private Node next;
        private Node prev;

        private Node(int value){
            this.value = value;
        }

        private Node (int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
