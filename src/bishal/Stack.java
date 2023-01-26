package bishal;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
   private int[] stack = new int[5];
   int count = 0;
   public void push(int element){
       if(count == stack.length)
           throw new StackOverflowError();
       stack[count] = element;
       count++;
   }
   public int pop(){
       if(count==0) throw new IllegalStateException();
       int element = stack[count];
       count--;
       return element;
   }
   //overirding the native Objects to string method
    @Override
    public String toString(){
       var array = Arrays.copyOfRange(stack,0,count);
       return Arrays.toString(array );
    }
    public int peek(){
       if(count==0) throw new IllegalStateException();
       return stack[count-1];
    }
    public boolean isEmpty(){
       return count == 0;
    }



}

