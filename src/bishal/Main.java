package bishal;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String args[]) {
//        ArrayQueue queue = new ArrayQueue(5);
//        queue.enqueue(5);
//        queue.enqueue(6);
//        queue.enqueue(7);
//        queue.enqueue(8);
//        queue.enqueue(9);
//        queue.printQueue();
//        int rem = queue.dequeue();
//        System.out.println("Removed Item is"+Integer.toString(rem));
//        queue.enqueue(10);
//        queue.printQueue();
//        queue.dequeue();
//        queue.dequeue();
//        queue.enqueue(11);
//        queue.enqueue(12);
//        queue.printQueue();
//        System.out.println("Final Round");
//        queue.dequeue();
//        queue.enqueue(14);
//        queue.printQueue();
        StackQueue queue = new StackQueue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(8);
        queue.dequeue();
        queue.print();

    }

}
