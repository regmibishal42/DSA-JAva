package bishal;

public class ArrayQueue {
    int[] array;
    private int count=  0;
    private int head = 0;

    public ArrayQueue(int capacity){
        array = new int[capacity];
    }


    public void enqueue(int item){
        if(isFull()) throw new IllegalStateException();
        if(count == array.length && head != 0){
            count = 0;
        }
        array[count++] = item;
    }
    public boolean isFull(){
        return (count == array.length && head == 0) || (head == count && head !=0);
    }
    public boolean isEmpty(){
        return count == head && !isFull();
    }
    public int dequeue(){
        if(isEmpty()) throw new IllegalStateException();
        int item = array[head];
        array[head] = 0;
        if(head == array.length-1) {
            head = 0;
            return item;
        }else {
            System.out.println("Increasing Head");
            head++;
            return item;
        }
    }
    public int peek(){
        if(isEmpty()) return -1;
        return array[head];
    }
    public void printQueue(){
        for(int i=0;i<array.length;i++){
            if(array[i] == 0) continue;
            System.out.println(array[i]);
        }
    }
}
