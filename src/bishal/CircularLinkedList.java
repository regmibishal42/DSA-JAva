package bishal;

public class CircularLinkedList {
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }

    }
    private Node first;
    private Node last;

    public void addLast(int item){
        Node node = new Node(item);
        if(first==null){
            first=last=node;
            first.next = first;
        }else{
            last.next = node;
            last = node;
            last.next = first;

        }
    }
}
