public class Tree {
    private Treenode root;
    private class Treenode{
        int data;
       private Treenode left;
       private Treenode right;
       Treenode(int data){
           this.data=data;
       }
    }
    public void binarytree(){

        Treenode first=new Treenode(1);
        Treenode second=new Treenode(2);
        Treenode third=new Treenode(3);
        Treenode fourth=new Treenode(4);
        Treenode fifth=new Treenode(5);
        root=first;
        root.left=second;
        root.right=third;
        second.left=fourth;
        second.right=fifth;
    }
    public void preorder(Treenode root){
        if(root==null){
            return;
        }
        System.out.print(root.data +" ");
        preorder(root.left);
        preorder(root.right);
    }
    public void inorder(Treenode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public void postorder(Treenode root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        Tree obj=new Tree();
        obj.binarytree();
        System.out.println("preorder");
        obj.preorder(obj.root);
        System.out.println();
        System.out.println("inorder");
        obj.inorder(obj.root);
        System.out.println();
        System.out.println("postorder");
        obj.postorder(obj.root);

    }
}
