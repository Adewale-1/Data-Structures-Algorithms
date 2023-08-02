public class CLL {
    
    private Node head;
    private Node tail;
    private int size;


    public CLL(){
        this.size = 0;
    }


    public void insertLast(int value){
        Node node = new Node(value);

        if (head == null){
            head = node;
            tail = node;
        }

        tail.next = node;
        node.next = head;
        tail = node;

        size++;
    }
    public void insertFirst(int value){
        Node node = new Node(value);

        if (head == null){
            head = node;
            tail = node;
        }

        node.next = head;
        tail.next = node;
        head = node;

        size++;
    }
    public void display(){
        Node temp = head;

        if ( head != null ){
            do{
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }while (temp != head);
        }

    }
    public void deleteLast(int value ){

    }

    public void delete(int value ){

    }

    private class Node{
        private int value;
        private Node next;

        private Node(int value){
            this.value = value;
        }
        
        private Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
