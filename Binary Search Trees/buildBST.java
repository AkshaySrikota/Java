public class buildBST{
static class Node{
Node left;
Node right;
int data;
Node(int data){
    this.data=data;
}
}
public static Node insert(Node root,int val){
    if(root==null){
        root=new Node(val);
        return root;
    }
      if(root.data>val){
        //left subtree
        root.left=insert(root.left,val);
      }
      else{
        //right subtree
           root.right=insert(root.right,val);
      }
      return root;
} 
public static void inorder(Node root){
    if(root==null){
        return;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
      inorder(root.right);
    System.out.print(root.data+" ");
    
}

public static void main(String args[]){
int values[]={5,1,3,4,2,7};
Node root=null;

for(int i=0;i<values.length;i++){
    insert(root,values[i]);

}
inorder(root);
System.out.println();
}


} 