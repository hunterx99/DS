import java.util.Stack;

public class lterativeInorder {
    static Node root;
    public static class Node{
        int data;
        Node right,left;
        Node(int data){
            this.data=data;
            right=left=null;
        }
    }
    public static void inorder(Node node){
        if(root==null) return;
        Stack<Node> stack=new Stack<>();

        while(node!=null || stack.size()>0){
            while(node!=null){
                stack.push(node);
                node=node.left;
            }
            /* Current must be NULL at this point */
            // so points to privious node which has element on right side
            node=stack.pop();
            System.out.print(node.data+" ");
            node=node.right;
        }
    }
    public static void main(String[] args) {
        root =new Node(4);
        root.left=new Node(5);
        root.right=new Node(6);
        root.left.right=new Node(7);
        root.left.left=new Node(8);
        inorder(root);
    }
}
