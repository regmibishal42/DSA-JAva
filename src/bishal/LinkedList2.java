package bishal;

public class LinkedList2 {
   private class Node{
       private int value;
       private Node next;
       public Node(int value){
           this.value = value;
       }
   }
   private Node first;
   private Node last;
//   add elements to the last of a linked list
    public void addLast(int item){
        Node node = new Node(item);
        if(isEmpty()){
            first = node;
            last = node;
        }else{
            last.next = node;
            last = node;

        }
}
    //add items to the first of linked list
    public void addFirst(int item){
        Node node = new Node(item);
        if(isEmpty()){
            first = node;
            last = node;
        }else{
            node.next = first;
            first = node;
        }

    }
    private boolean isEmpty(){
        return first == null;
    }
//    finding the index of item in the linked list
    public int indexOf(int item){
        int index = 0;
        var current = first;
        while(current !=null){
            if(current.value == item) return index;
            current = current.next;
            index++;
        }
        return  -1;
    }
}
