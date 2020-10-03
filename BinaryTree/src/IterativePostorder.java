import java.util.Stack;

public class IterativePostorder {
    static Node root;
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static void postorder(Node node){
        Stack<Node> stack=new Stack<>();
        while(node!=null || stack.size()>0){
            while (node!=null) {
                stack.push(node);
                node=node.left;
            }
        }
    }
    public static void main(String[] args) {
        root =new Node(4);
        root.left=new Node(5);
        root.right=new Node(6);
        root.left.right=new Node(7);
        root.left.left=new Node(8);
        postorder(root);
    }
    
}
