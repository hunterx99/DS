public class sampleTree {
    Node root;
public static class Node{
    int data;
    Node right,left;
    public Node(int data){
        this.data=data;
        right=left=null;
    }
}

public static void main(String[] args) {
   sampleTree tree=new sampleTree();
    tree.root =new Node(4);
    tree.root.left=new Node(5);
    tree.root.right=new Node(6);
    tree.root.left.right=new Node(7);
    tree.root.left.left=new Node(8);
}   
}
