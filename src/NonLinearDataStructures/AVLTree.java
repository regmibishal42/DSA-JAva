package NonLinearDataStructures;

public class AVLTree {
    private class Node{
        private int height;
        private int value;
        private Node left;
        private Node right;
        public Node(int value){
            this.value = value;
        }
    }
    private Node root;
    public boolean isEmpty(){
        return root == null;
    }

//    public void insert(int item){
//        var currentNode = root;
//
//        if(isEmpty()){
//            root = new Node(item);
//            return;
//        }
//        while(true){
//            // right sub tree
//            if(item  < currentNode.value){
//                if(currentNode.left == null){
//                    currentNode.left = new Node(item);
//                    break;
//                }
//                currentNode = currentNode.left;
//            }else{
//                if(currentNode.right == null){
//                    currentNode.right = new Node(item);
//                    break;
//                }
//                currentNode = currentNode.right;
//            }
//        }
//    }

    public void insert(int item){
        root = insert(item,root);
    }
    private Node insert(int item,Node node){
        if(node == null)
            return new Node(item);

        if(item < node.value)
            node.left = insert(item,node.left);
        else
            node.right = insert(item,node.right);
        node.height = Math.max(height(root.left),height(root.right)) + 1;
        //balance factor height(L )-height(Right)
        var balanceFactor = balanceFactor(node);
        if(isLeftHeavy(node)) System.out.println(root.value + " is left heavy");
        if(isRightHeavy(node))System.out.println(root.value + " is right heavy");
        return node;
    }
    private int height(Node node){
        return node == null ? -1 : node.height;
    }
    private int balanceFactor(Node node){
        return (node == null) ? 0 : height(node.left)-height(node.right);
    }
    private boolean isLeftHeavy(Node node){
        return balanceFactor(node) > 1;
    }
    private boolean isRightHeavy(Node node){
        return balanceFactor(node) < -1;
    }
}
