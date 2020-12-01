public class minDepth {
    static Node root;
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static int min(Node node){
        if(node ==null) return 0;
        
        int leftlength=min(node.left);
        int rightlength=min(node.right);
        
       return (leftlength ==0 || rightlength==0) ? leftlength + rightlength + 1
                                        : Math.min(leftlength,rightlength)+1;
    }
    public static void main(String[] args) {
      /*   root =new Node(4);
        root.left=new Node(5);
        root.right=new Node(6);
        root.left.right=new Node(7);
        root.left.left=new Node(8); */
        root=new Node(1);
        root.left=new Node(2);
        System.out.println("Minimum Depth:"+min(root));
    }
}
