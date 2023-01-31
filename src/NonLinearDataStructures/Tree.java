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

    //DFS Traversal using recursion
    public void traversePreOrder(){
        traversePreOrder(root);
    }
    private void traversePreOrder(Node root){
        // root -> left -> right
        if(root == null) return; //base condition
        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);

    }

    public int height(){
        return height(root);
    }
    private int height(Node root){
        if(isEmpty()) return -1;
        if(root.leftChild == null && root.rightChild == null) return 0;
         return 1 + Math.max(height(root.leftChild),height(root.rightChild));
    }

    public int findMin(){
        return findMin(root);
    }
    private int findMin(Node node){
        if(node.leftChild == null && node.rightChild ==null) return node.value;
        var left = findMin(node.leftChild);
        var right = findMin(node.rightChild);
        return Math.min(Math.min(left,right),node.value);
    }

    public boolean equals(Tree other){
        if(other == null) return false;
        return equals(root,other.root);
    }
    private boolean equals(Node first,Node second){
        if(first == null && second == null) return true;
        if(first != null && second != null)
        return first.value == second.value
                 && equals(first.leftChild,second.leftChild)
                && equals(first.rightChild,second.rightChild);
        return false;
    }

    public boolean isBinarySearchTree(){
        return isBinarySearchTree(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    private boolean isBinarySearchTree(Node root,int min,int max){
        if(root == null ) return true;
        if(root.value < min || root.value > max)
            return false;
        return isBinarySearchTree(root.leftChild,min,root.value-1)
                && isBinarySearchTree(root.rightChild,root.value+ 1,max);
    }

    public void printNodesAtDistance(int distance){printNodesAtDistance(distance,root);}
    private void printNodesAtDistance(int distance,Node node){
        if(isEmpty()) return;
        if(distance == 0) {
            System.out.println(node.value);
            return;
        }

        printNodesAtDistance(distance-1,node.leftChild);
        printNodesAtDistance(distance-1,node.rightChild );

    }


}
