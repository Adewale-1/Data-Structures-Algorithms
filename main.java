public class main {
    public static void main(String[] args) {
        
        LL list = new LL();

        list.insertFirst(3);

        list.insertFirst(4);

        list.insertFirst(8);

        list.insertLast(9);

        list.insertLast(18);

        list.insert(2, 1);

        // System.out.println(list.size());

        // list.delete(0);

        // list.deleteLast();

        list.deleteFirst();

    

        list.display();
    }
    
}
