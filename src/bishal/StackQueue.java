package bishal;

import java.util.Arrays;
import java.util.Stack;
public class StackQueue {
    Stack<Integer> stack = new Stack<>(); //for enqueue
    Stack<Integer> stack2 = new Stack<>(); // for dequeue
    public boolean isEmpty(){
       return stack.isEmpty() && stack2.isEmpty();
    }
     public void enqueue(int item){
        stack.push(item);
     }
     public int dequeue(){
        if(stack.isEmpty() && stack2.isEmpty()) throw  new IllegalStateException();
       if(stack2.isEmpty()){
           while(!stack.isEmpty()){
               stack2.push(stack.pop());
           }
       }
        return stack2.pop();
     }
     public void print(){
        System.out.println(Arrays.toString(stack2.toArray()));
     }


}
