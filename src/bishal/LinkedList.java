package bishal;

public class LinkedList {
   private class Node{
       private int value;
       private Node next;
       public Node(int value){
           this.value = value;
       }
   }
    private Node first;
    private Node last;
    private boolean isEmpty(){
        return  first == null;
    }


//    addFirst
    public void addFirst(int item){
        Node node = new Node(item);
        if(isEmpty()) first=last=node;
        else {
            node.next = first;
            first = node;
        }
    }
//    addLast
    public void addLast(int item){
        var node = new Node(item);
        if(isEmpty()){
            first = last =node;
        }else{
            last.next = node;
            last = node;
        }
    }
    //deleteLast
    //contains
    //indexOf
    public int indexOf(int item){
        int index = 0;
        var current = first;
        while(current.next != null){
            if(current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }


}
