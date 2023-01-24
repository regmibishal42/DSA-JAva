package bishal;

import java.util.NoSuchElementException;

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

 //finding if list contains a ccertain item or not
    public boolean contains(int item){
        return indexOf(item) != -1;
    }

//removing the first item from an list
    public void removeFirst(){
        if(isEmpty())
            throw new NoSuchElementException();
        if(first == last){
            first = last = null;
            return ;
        }else{
            var second = first.next;
            first.next = null;
            first = second;
        }
    }

    //removing a last item from an linked list
    public void removeLast(){
        if(isEmpty())
            throw new NoSuchElementException();
        if(first == last){
            first = last =null;
            return;
        }
        var secondLast = first.next;
        while(secondLast.next!=last){
            secondLast = secondLast.next;
        }
        last = null;
        last = secondLast;
        last.next = null;
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
//    reversing the linked list --imp
    public void reverse() {
        if(isEmpty()) return;
        var firstRev = first;
        var current = first.next;
        last = first;
        last.next = null;
        while(current != null){
            var next = current.next;
            current.next = firstRev;
            firstRev = current;
            current = next;
        }
        first = firstRev;
    }
//    finding the kth node in a linked list from the last
    public int findNodeFromLast(int index){
        int size = size();
        int count = size -index;
        System.out.println(count);
        var current = first;
        var currentIndex = 0;
        while(current !=null){
            if(currentIndex == count) return current.value;
            currentIndex++;
            current = current.next;
        }
        return -1;
    }
}
