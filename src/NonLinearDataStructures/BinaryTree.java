package NonLinearDataStructures;

public class BinaryTree {
    private class Node{
        private int value;
        private Node left;
        private Node right;
        public Node(int value){
            this.value = value;
        }
    }
    private Node root;
    private boolean isEmpty(){
        return root == null;
    }
    public void addNode(int value){
        Node currentNode = root;
        if(isEmpty()){
            root = new Node(value);
            return;
        }

        //loop to traver through tree
        while(true){
           if(value < currentNode.value){
               if(currentNode.left == null){
                   currentNode.left = new Node(value);
                   break;
               }
               currentNode = currentNode.left;

           }else{
               if(currentNode.right == null){
                   currentNode.right = new Node(value);
                   break;
               }
               currentNode = currentNode.right;
           }

        }

    }

    public boolean lookup(int value){
        Node current = root;
        if(isEmpty()) throw new IllegalStateException();
        while (current != null){
            if(value < current.value)
                current = current.left;
            else if(value > current.value)
                current =  current.right;
            else return true;
        }
        return false;
    }



}
