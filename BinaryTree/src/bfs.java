import java.util.LinkedList;
import java.util.Queue;

/* 
    Level Order

*/
public class bfs {
    static Node root;
    public static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static void levelOrder(Node root){
        if(root==null) return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            root=q.poll();
            System.out.print(root.data +" ");
            if(root.left!=null)
                q.add(root.left);
            if(root.right!=null)
                q.add(root.right);


        }
    }
    public static void main(String[] args) {
        root=new Node(3);
        root.left=new Node(9);
        root.right=new Node(20);
        root.right.left=new Node(15);
        root.right.right=new Node(7);
        levelOrder(root);

    }
}
/* 
            3
           / \
          9  20
            /  \
           15   7

*/