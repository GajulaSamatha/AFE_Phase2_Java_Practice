public class BinarySearchTree{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int val){
            this.data=val;
            this.right=null;
            this.left=null;
        }
    }
    Node root;
    public BinarySearchTree(){
        root=null;
    }
    public void insert(int data){
        root=insertHelper(root,data);

    }
    public Node insertHelper(Node node, int data){
        if(node==null){
            return new Node(data);
        }

        if(data<node.data){
            node.left=insertHelper(node.left,data);
        }
        else if(node.data<data){
            node.right = insertHelper(node.right,data);
        }

        return node;
    }
    public int size(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + size(node.left) + size(node.right);
    }

    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }

    public static void preorder(Node root) {
        if (root == null) return;

        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data + " ");
    }
    public boolean search(Node node, int target){
        if(node==null){
            return false;
        }
        if(node.data==target){
            return true;
        }
        else if(target<node.data){
            return search(node.left,target);
        }
        return search(node.right,target);
    }
    public int findMax(Node node){
        if(node==null){
            return -1;
        }
        while(node.right!=null){
            node=node.right;
        }
        return node.data;
    }
    public int findMaxRec(Node node){
        if(node==null){
            return -1;
        }
        if(node.right==null){
            return node.data;
        }
        return findMaxRec(node.right);
    }
    public int height(Node node){
        if(node==null){
            return 0;
        }
        return 1+(Math.max(height(node.right),height(node.left)));
    }
    public static void main(String args[]){
        BinarySearchTree bst=new BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);

        System.out.println("The no. of nodes are: "+bst.size(bst.root));
        inorder(bst.root);
        preorder(bst.root);
        postorder(bst.root);

        if(bst.search(bst.root,30)){
            System.out.println("The target "+30+" found in the tree!!");
        }
        else{
            System.out.println("The target "+30+" not found in the tree!!");
        }

        if(bst.search(bst.root,90)){
            System.out.println("The target "+90+" found in the tree!!");
        }
        else{
            System.out.println("The target "+90+" not found in the tree!!");
        }
        System.out.println("Find max: "+bst.findMax(bst.root));
        System.out.println("Height of the tree: "+bst.height(bst.root));
    }
}