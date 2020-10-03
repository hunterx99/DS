public class sampleTree {
    static Node root;
    public static class Node{
    int data;
    Node right,left;
    public Node(int data){
        this.data=data;
        right=left=null;
    }
}

public static void main(String[] args) {
    root =new Node(4);
    root.left=new Node(5);
    root.right=new Node(6);
    root.left.right=new Node(7);
    root.left.left=new Node(8);
    }   
}
/*
            4
           / \
          5   6
         / \
        8   7
*/