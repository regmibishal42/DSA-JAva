package NonLinearDataStructures;

public class Tree {

    private class Node{
        private int value;
        private Node leftChild;
        private Node rightChild;
        public Node(int value){
            this.value  = value;
        }

        @Override
        public String toString() {
            return "Node="+value;
        }
    }
    private Node root;
    public boolean isEmpty(){
        return root == null;
    }

    public void addChild(int child){
        Node currentNode = root;
        Node newNode = new Node(child);
        if(isEmpty()){
            root = newNode ;
            return;
        }
        while(true){
           if(child < currentNode.value){
               if(currentNode.leftChild == null){
                   currentNode.leftChild = newNode;
                   break;
               }
               currentNode = currentNode.leftChild;
           }
           else{
               if(currentNode.rightChild == null){
                   currentNode.rightChild = newNode;
                   break;
               }
               currentNode = currentNode.rightChild;
           }


           }

    }
    public boolean lookup(int value){
        Node current = root;
        boolean isFound = false;
        while(current != null){
            if(value == root.value) {
                isFound = true;
                break;
            };
            //lookup to the left
            if(value < current.value){
                if(current.value == value){
                    isFound = true;
                    break;
                }
                current = current.leftChild;
            }
            //looking in right side
            else{
                if(current.value == value){
                    isFound = true;
                    break;
                }
                current = current.rightChild;
            }
        }
        return isFound;
    }


}
