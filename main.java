public class main {
    public static void main(String[] args) {
        
        LL list = new LL();

        list.insertFirst(3);

        list.insertFirst(4);

        list.insertFirst(8);

        list.insertLast(9);

        list.insert(2, 2);

        System.out.println(list.size());

        list.display();
    }
    
}
