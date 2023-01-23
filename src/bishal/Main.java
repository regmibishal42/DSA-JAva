package bishal;


public class Main {
    public static void main(String args[]) {
//        LinkedList2 list = new LinkedList2();
//        list.addLast(3);
//        list.addLast(5);
//        list.addFirst(10);
//        System.out.println(list.indexOf(5));
//        System.out.println(list.indexOf(3));
//        System.out.println(list.indexOf(10));
//        System.out.println(list.indexOf(11));
   DoublyLinkedList list = new DoublyLinkedList();
   list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        System.out.println(list.toString());
    }
}
