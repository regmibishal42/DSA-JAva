package NonLinearDataStructures;

public class Main {
     public static void main(String args[]){
         AVLTree tree = new AVLTree();
         tree.insert(10);
         tree.insert(20);


        // tree.insert(11);

     }
     public static int factroial(int num){
          int fact = 1;
          for(int i=num;i>1;i--){
               fact = fact*i;
          }
          return fact;
     }
     public static int recursiveFactorial(int num){
          //base condition
          if(num ==1) return 1;
          return num * recursiveFactorial(num-1);
     }


}
