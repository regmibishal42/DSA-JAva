package bishal;

public class DoublyLinkedList {
    private class Node{
        private int value;
        private Node prev;
        private Node next;

        public Node(int value){
            this.value = value;
        }

    }
    private Node first;
    private Node last;

    public void addLast(int item){
        Node node = new Node(item);
        if(first ==null){
            first = last = node;
        }else{
            last.next = node;
            node.prev = last;
            last = node;
        }
    }
}
