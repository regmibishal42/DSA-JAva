package bishal;

import java.util.Queue;
import java.util.Stack;
public class ReverseQueue {
    public Queue reverseQueue(Queue<Integer> queue){
        if(queue.isEmpty()) throw new IllegalStateException();
        Stack<Integer> stack =  new Stack();
        while(!queue.isEmpty())
            stack.push(queue.remove());
        while(!stack.isEmpty())
            queue.add(stack.pop());
    return queue;
    }

}
