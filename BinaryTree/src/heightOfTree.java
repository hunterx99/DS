public class heightOfTree {
    static Node root;
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static int height(Node node){
        if(node==null) return 0;
        int leftheight=height(node.left);
        int rightheight=height(node.right);

        return Math.max(leftheight,rightheight) +1;
    }
    public static void main(String[] args) {
        root =new Node(4);
        root.left=new Node(5);
        root.right=new Node(6);
        root.left.right=new Node(7);
        root.left.left=new Node(8);
        System.out.println("Height :" + height(root));
    }
    
}
