package bishal;

import java.util.NoSuchElementException;

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
//    delete first
    public void deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        if(first == last) {
            first=last=null;
            return;
        }

        var previous = getPrevious(last);
        last = previous;
        last.next = null;

    }

    //deleteLast
    public void removeLast(){
        var current = first;
        while(current.next != null){
            if(current.next == last) break;
            current = current.next;
        }
    }

    //contains
    public boolean contains(int item){
        return indexOf(item) != -1;
    }

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
    private Node getPrevious(Node node){
        var current = first;
        while(current != null){
            if(current.next == node) return current;
            current = current.next;
        }
        return current;
    }

    public void reverse(){
        var prev  = first;
        var current = first.next;
        last = first;
        last.next = null;
        while(current !=null){
            var next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        first = prev;

    }
    public int size(){
        if(isEmpty()) return 0;
        if(first.next == null) return 1;
        int length = 1;
        var current  =first;
        while(current.next != null){
            length++;
            current = current.next;

        }
        return length;
    }

    //convert the LinkedList to Array
    public int[] toArray(){
        int size = size();
        int[] array = new int[size];
        var current = first;
        int index = 0;
        while(current != null){
            array[index++] = current.value;
            current = current.next;
        }

        return array;
    }
//    finding kth node from last in one pass
    public int getKthFromTheEnd(int k){
        var a = first;
        var b = first;
        for(int i=0;i<k-1;i++){
            b = b.next;
            if(b == null) throw new IllegalArgumentException();
        }
        while(b!=last){
            a = a.next;
            b = b.next;
        }
        return a.value;

    }


}
