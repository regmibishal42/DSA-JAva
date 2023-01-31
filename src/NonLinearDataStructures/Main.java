package NonLinearDataStructures;

public class Main {
     public static void main(String args[]){
          Tree tree = new Tree();
          tree.addChild(4);
          tree.addChild(1);
          tree.addChild(5);
          tree.addChild(8);
          tree.addChild(3);
          System.out.println(tree.lookup(4));
          System.out.println(tree.lookup(5));
          System.out.println(tree.lookup(10));

//          System.out.println("Done");

//          BinaryTree tree = new BinaryTree();
//          tree.addNode(4);
//          tree.addNode(1);
//          tree.addNode(5);
//          tree.addNode(8);
//          tree.addNode(3);
//          System.out.println("Done");
     }

}
