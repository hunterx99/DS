public class treetraversal {
    Node root;
    public static class Node{
        int data;
        Node right,left;
        public Node(int data){
            this.data=data;
            right=left=null;
        }
    }
    public void inorder(Node node){
        if(node == null) return;

        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }
    public void postorder(Node node){
        if(node==null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
    }
    public void preorder(Node node){
        if(node==null) return;

        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }
    
    
    public static void main(String[] args) {
        treetraversal tree=new treetraversal();
        tree.root =new Node(4);
        tree.root.left=new Node(5);
        tree.root.right=new Node(6);
        tree.root.left.right=new Node(7);
        tree.root.left.left=new Node(8);
       System.out.println("Inorder");
        tree.inorder(tree.root);
        System.out.println();
        System.out.println("PostOrder");
        tree.postorder(tree.root);
        System.out.println();
        System.out.println("preorder");
        tree.preorder(tree.root);
        System.out.println();
    }
}
/* 
             4
          /     \
        5        6
       / \
      8   7
 */