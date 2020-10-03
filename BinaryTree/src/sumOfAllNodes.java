public class sumOfAllNodes {
    static Node root;
    public static class Node{
        int data;
        Node right,left;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static int sum(Node node){
        if(node==null) return 0;

        return node.data + sum(node.left) + sum(node.right);
    }
    public static void main(String[] args) {
        root =new Node(4);
        root.left=new Node(5);
        root.right=new Node(6);
        root.left.right=new Node(7);
        root.left.left=new Node(8);
        System.out.print("Sum:- ");
        System.out.println(sum(root));
    }
}
