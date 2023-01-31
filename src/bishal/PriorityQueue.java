package bishal;

import java.util.Arrays;

public class PriorityQueue {
    private int[] array;
    private int count =0;

    public PriorityQueue(int size){
        array = new int[size];
    }
    public void enqueue(int item){
        if(isFull()) throw new IllegalStateException();
            //shifting items
            int i;
            for(i=count-1;i>=0;i--){
                if(array[i] > item)
                    array[i+1] = array[i];
                else
                    break;
            }
            array[i+1]=  item;
            count++;

    }
    public int dequeue(){
        if(isEmpty()) throw new IllegalStateException();
        return  array[--count];

    }
    public boolean isEmpty(){
        return count == 0;
    }
    public void print(){
        System.out.println(Arrays.toString(array)+" Count IS "+Integer.toString(count));
    }
    public boolean isFull(){
        return count == array.length;
    }
}
